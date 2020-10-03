# Money Transfer Service

This is a sample project to show a use case sample for hexagonal architecture.

This project provides endpoints to transfer money

The Money Transfer  service provides data like below:

* Sender Account Id
* Receiver Account Id
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
   "senderAccountId":"123456788",
   "receiverAccountId":"123456789",
   "amount":50
}
```

#### Response:

```json
{
    "id": 1,
    "sender": "123456788",
    "receiver": "123456789",
    "amount": 50,
    "result": "SUCCESSFUL",
    "timeStamp": "2020-10-03T18:25:32.313180Z"
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

#### `javac -jar target/account-service-0.0.1-SNAPSHOT.jar`

### Run with command:

#### `mvn spring-boot:run`
Starts application


### Important Note:
* This is a simple sample application.
* When the application runs 2 dummy accounts inserting DB:
  - 123456788
  - 123456789

* Only money transfer endpoint is open to give sample.
