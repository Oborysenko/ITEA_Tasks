#!/bin/bash
echo ${MY_NAME} >> /usr/share/nginx/html//index.html
nginx  -c /etc/nginx/nginx.conf -g "daemon off;"
