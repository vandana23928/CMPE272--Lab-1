# CMPE272--Lab-1
# Simple REST Service

This is a simple RESTful web service built with Spring Boot.

## Prerequisites

- Java 11 or higher
- Maven

## Running the Application

1. Clone this repository:

git clone CMPE272_Lab-1


2. Navigate to the project directory:

cd simple-rest-service


3. Build the project:

mvn clean install

4. Run the application:

mvn spring-boot:run 
 OR
./mvnw spring-boot:run


5. The application will start on http://localhost:8080

## Testing the Application

Use a REST client like Postman or cURL to test the following endpoints:

1. Default greeting:
GET http://localhost:8080/greeting

2. Custom greeting:
GET http://localhost:8080/greeting?name=John
