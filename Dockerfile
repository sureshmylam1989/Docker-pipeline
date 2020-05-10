FROM selenium/node-chrome-debug:3.5.3-boron

USER root

# Install prerequisites
RUN apt-get update && apt-get install -y \
curl


RUN mkdir -p /usr/local/share/maven /usr/local/share/maven/ref \
  && curl -fsSL -o /tmp/apache-maven.tar.gz ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
  && echo "${SHA}  /tmp/apache-maven.tar.gz" | sha512sum -c - \
  && tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 \
  && rm -f /tmp/apache-maven.tar.gz \
  && ln -s /usr/local/share/maven/bin/mvn /usr/bin/mvn

ENV MAVEN_HOME /usr/local/share/maven
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"

COPY mvn-entrypoint.sh /usr/local/bin/mvn-entrypoint.sh
COPY settings-docker.xml /usr/local/share/maven/ref/

ENTRYPOINT ["/usr/local/bin/mvn-entrypoint.sh"]

COPY  . /tmp
WORKDIR /tmp