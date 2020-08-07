# Money Transfer Service

This is a sample project to show a use case sample for hexagonal architecture.

This project provides endpoints to transfer money

The Money Transfer  service provides data like below:

* Sender
* Receiver
* Amount
* Status
* Timestamp

### Endpoints

This service provides one endpoints for transfer money

#### `POST /transfers`

Transfer money

#### Request:

```json
{
   "sender":"John Doe",
   "receiver":"Jane Doe",
   "amount":100
}
```

#### Response:

```json
{
    "id": 1,
    "sender": "John Doe",
    "receiver": "Jane Doe",
    "amount": 100,
    "status": "SUCCESSFUL",
    "timeStamp": "2020-08-07T13:48:08.830936Z"
}
```

## Libraries & Tools

* Java 11
* Maven 3.6
* Spring Boot 2
* Lombok
* Flyway
* H2 Database
* Docker


## Building Application

Always use the Maven wrapper to build the project from command line.

App runs default `8080` port. `http://localhost:8080/`

### Useful commands:

#### `mvn clean install`
Fully clean and install dependencies
#### `mvn test`
Runs tests
#### `mvn compile`
Compiles application
#### `mvn package`
Creates package of application
#### `mvn clear verify`
Runs CheckStyle

## Running Application

After you create package of the application, in the path of the application on terminal, write the command which is below to run application.

#### `javac -jar target/money-transfer-service-0.0.1-SNAPSHOT.jar`

### Run with command:

#### `mvn spring-boot:run`
Starts application


