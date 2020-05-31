FROM vertx/vertx3
WORKDIR /
ADD target/capture-1.0-fat.jar capture-1.0.jar
EXPOSE 8081
CMD java - jar capture-1.0.jar