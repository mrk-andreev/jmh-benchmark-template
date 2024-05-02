FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /webapp

COPY . .
RUN --mount=type=cache,target=/root/.m2 mvn package


FROM eclipse-temurin:17.0.11_9-jdk-focal
WORKDIR /webapp

COPY --from=builder /webapp/target/jmh-benchmark-1.0-SNAPSHOT-jar-with-dependencies.jar .

ENTRYPOINT ["java"]
CMD ["-jar", "jmh-benchmark-1.0-SNAPSHOT-jar-with-dependencies.jar"]
