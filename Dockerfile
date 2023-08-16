FROM ubuntu:latest
WORKDIR /home
RUN apt-get update && \
    DEBIAN_FRONTEND=noninteractive \
    apt-get -y install default-jre-headless git && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*
RUN git clone https://github.com/aulas-leopoldo/gradle-actions-tutorial.git
WORKDIR /home/gradle-actions-tutorial
CMD ["./gradlew", "build"]