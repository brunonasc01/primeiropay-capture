# Extend vert.x image
FROM vertx/vertx3

ENV VERTICLE_NAME com.primeiropay.capture.MainVerticle
ENV VERTICLE_FILE target/capture-1.0-fat.jar

# Set the location of the verticles
ENV VERTICLE_HOME /usr/verticles

EXPOSE 8081

# Copy your verticle to the container
COPY $VERTICLE_FILE $VERTICLE_HOME/

# Launch the verticle
WORKDIR $VERTICLE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec vertx run $VERTICLE_NAME -cp $VERTICLE_HOME/*"]
