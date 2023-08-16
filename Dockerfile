FROM ubuntu:latest
WORKDIR /home
RUN apt-get update && \
    DEBIAN_FRONTEND=noninteractive \
    apt-get -y install default-jre-headless git && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*
RUN git clone https://github.com/aulas-leopoldo/gradle-actions-tutorial.git
RUN git config --global user.email "lmt@cin.ufpe.br"
RUN git config --global user.name "Leopoldo Teixeira"
WORKDIR /home/gradle-actions-tutorial
CMD ["./gradlew", "build"]