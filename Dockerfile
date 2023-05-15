FROM openjdk:latest
COPY ./target/calc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","calc-1.0-SNAPSHOT-jar-with-dependencies.jar","Calculator"]
