# allmob

- login page URL 'http://localhost:8080/login' 
 login 'mike' and password 'mike' 

- Open API     http://localhost:8080/swagger/swagger-ui/index.html 
- Steps to create database schema with flyway
- in project directory '\mobility>' run terminal and command:   .\gradlew clean build
- in project build directory '\mobility\build\libs>' run terminal and the command: java -jar .\mobility-0.0.1-SNAPSHOT.jar
- jOOQ code generation for persistence layer
  in project directory '\mobility>' run terminal and command: .\gradlew generateEntities



# Requirements

- Java 17
- Spring Boot 2.7.12
- Gradle
- OpenAPI
- MariaDB version 10.6 not newer because mariaDb comes with an advanced thread pool capable of running faster and supporting up to 200,000+ connections. 
The thread pool provided by MySQL cannot support up to 200,000 connections per time. In MariaDB, 
replication can be done safer and faster.
- HikariCP It's Faster.
- Flyway
- jOOQ