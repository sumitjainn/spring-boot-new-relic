
# Spring Boot New Relic Demo

Sample Spring Boot MVC application with New Relic monitoring

## New Relic configuration

Download `newrelic-java.zip` and `newrelic.yml` from New Relic website, extract `newrelic-java.zip` to `./newrelic`.
Replace `./newrelic/newrelic.yml` with the one downloaded from New Relic.


## Build and execution

### Build

`mvn clean install`

### execution

`java -javaagent:newrelic/newrelic.jar -jar target/demo-0.0.1-SNAPSHOT.jar`
