# Microservice Architecture

## Summary
This project demonstrates :- 

-   ** spring service discovery approach using Eureka service**
-  ** Configuration externalization using spring  cloud config server and client**

## Run Locally

- clone this project into local machine
- Update file path of `spring.cloud.config.server.git.uri` in `my-config-server` -> application.properties
- Run -> eureka-registry-server and check on browser http://localhost:8761/
- Run -> my-config-server and check on browser  http://localhost:8761/
- Run -> microservice-alpha and check on browser http://localhost:8081/
            you should see response `remote git`
- Run -> microservice-beta and check on browser http://localhost:8082/
            you should see response `remote git microservice-beta.properties`

## some change to test vscode
