pipelineJob('DSL_DockerDeploy') {

  def repo = 'https://github.com/Oborysenko/ITEA_Tasks.git'

  triggers {
    scm('H/5 * * * *')
  }
  description("Pipeline for $repo")

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('lecture_3')
          scriptPath('LectionTask_3/Jenkinsfile')
          extensions { }  // required as otherwise it may try to tag the repo, which you may not want
        }

        // the single line below also works, but it
        // only covers the 'master' branch and may not give you
        // enough control.
        // git(repo, 'master', { node -> node / 'extensions' << '' } )
      }
    }
  }
}

