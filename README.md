# Account Service

This project was created as a use case sample for hexagonal architecture.

This project provides endpoints for account domain CRUD actions and to transfer money from one account to another.

The Account service provides data like below:

Account:
* id
* Account id
* Account Name
* Account Owner
* Account Balance
* Creation Time

Transfer:
* Sender Account Id
* Receiver Account Id
* Amount
* Result
* Timestamp


### Endpoints

The service provides CRUD actions and money transfer endpoints

### `POST /accounts`

Create a new account

#### Request:

```json
{
   "accountId": "123456789",
   "name": "Main Account",
   "owner": "John Doe",
   "balance": 650
}
```

#### Response:

```json
{
   "id": 1,
   "accountId": "123456789",
   "name": "Main Account",
   "owner": "John Doe",
   "balance": 650,
   "createdAt": "2020-10-11T20:56:59.606932Z"
}
```

### `GET /accounts`

Retrieve a list of all accounts

#### Response:

```json
{
   "accounts":[
      {
         "id":1,
         "accountId":"123456789",
         "name":"Main Account",
         "owner":"John Doe",
         "balance":650,
         "createdAt":"2020-10-11T20:56:59.606932Z"
      },
      {
         "id":2,
         "accountId":"123456788",
         "name":"Saving Account",
         "owner":"Jane Doe",
         "balance":750,
         "createdAt":"2020-10-03T20:41:16.517256Z"
      }
   ]
}
```

### `GET /accounts/{id}`

Retrieve account by id

#### Response:

```json
{
   "id":1,
   "accountId":"123456789",
   "name":"Main Account",
   "owner":"John Doe",
   "balance":650,
   "createdAt":"2020-10-11T20:56:59.606932Z"
}
```

### `DELETE /accounts/{id}`

Deletes account by id


### `POST /accounts/transfer`

Transfers money from one account to another

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
* SwaggerUI


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

* Some account service endpoints are created as example.
