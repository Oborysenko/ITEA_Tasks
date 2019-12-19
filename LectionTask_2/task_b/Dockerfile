FROM nginx
COPY ./index.html /usr/share/nginx/html/
COPY ./entrypoint.sh /
#CMD ls 
ENV MY_NAME aaa
CMD /entrypoint.sh
#CMD echo ${MY_NAME}
#ENTRYPOINT echo ${MY_NAME} >> /var/www/html/index.html
