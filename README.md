# Money Transfer Service

This project was created as a use case sample for hexagonal architecture.

This project provides endpoint to transfer money from one account to another

The Account service provides data like below:

* Sender Account Id
* Receiver Account Id
* Amount
* Result
* Timestamp

### Endpoints

This service provides one endpoints for transfer money

#### `POST /transfers`

Transfer money

#### Request:

```json
{
   "senderAccountId":"123456788",
   "receiverAccountId":"123456789",
   "amount":25
}
```

#### Response:

```json
{
    "id": 1,
    "senderAccountId": "123456788",
    "receiverAccountId": "123456789",
    "amount": 25,
    "result": "SUCCESSFUL",
    "timeStamp": "2020-10-03T20:41:16.799826Z"
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


## Running Application

After you create package of the application, in the path of the application on terminal, write the command which is below to run application.

#### `javac -jar target/account-service-0.0.1-SNAPSHOT.jar`

### Run with command:

#### `mvn spring-boot:run`
Starts application


### Important Note:
* This is a simple sample application.
* When the application runs 2 dummy accounts inserting DB:
  - 123456788
  - 123456789

* Only money transfer endpoint is created as an example.
