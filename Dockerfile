FROM selenium/node-chrome-debug:3.5.3-boron

COPY  . /tmp
WORKDIR /tmp

RUN ls /tmp