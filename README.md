
# Spring Boot New Relic Demo

Sample Spring Boot MVC application with New Relic monitoring

## New Relic configuration

1. Download `newrelic-java.zip` and `newrelic.yml` from [New Relic](https://one.newrelic.com/)
2. Extract `newrelic-java.zip` to `./newrelic`.
3. Replace `./newrelic/newrelic.yml` with the one downloaded from New Relic.



## Build

`mvn clean install`

## Execution

`java -javaagent:newrelic/newrelic.jar -jar target/demo-0.0.1-SNAPSHOT.jar`
