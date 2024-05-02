# JMH Benchmark Template

Welcome to the Java JMH Benchmark Template Repository. This repository provides a ready-to-use template to help you
quickly set up and run benchmarks using the Java Microbenchmark Harness (JMH).

You can find samples of JMH at https://github.com/openjdk/jmh/tree/master/jmh-samples/src/main/java/org/openjdk/jmh/samples

## Included features

Template parts:

- Service with business logic
- Benchmark
- Tests placeholder


Dependencies:

- JMH dependency
- JUnit5
- Assertj
- fmt-maven-plugin

Also:

- Jar with dependencies build
- Dockerfile

## Getting Started

1. Clone repository
2. Change `AppService`
3. Change `AppServiceTest`
4. Change benchmark `SampleBenchmark`
5. Execute benchmark from `Main`

## Execute

### Host build

```
mvn package
java -jar target/jmh-benchmark-1.0-SNAPSHOT-jar-with-dependencies.jar
```

### Docker build

```
docker build -f src/main/docker/Dockerfile .
```

or 

```
docker run $(docker build -f src/main/docker/Dockerfile . -qq)
```

## Author

Author of this template is Mark Andreev ( [MrkAndreev.name](https://mrkandreev.name/),  [LinkedIn](https://www.linkedin.com/in/mrk-andreev/) )
