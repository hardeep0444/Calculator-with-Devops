FROM openjdk:11
COPY ./target/SPE_Calculator-1.0-SNAPSHOT.jar ./

WORKDIR ./
CMD ["java", "-jar", "SPE_Calculator-1.0-SNAPSHOT.jar"]