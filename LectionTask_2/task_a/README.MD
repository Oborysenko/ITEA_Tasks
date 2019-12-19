execution  command is:
sudo docker build . -t alpine_git:0.1 && sudo docker run  -v ~/ITeaDevOps/LectionTask_2/task_a/test_folder/:/data -e "REPO=https://github.com/Oborysenko/ITeaDevOps.git" alpine_git:0.1
