# bcnc-group

- This is a Spring Boot application for the BCNC Group Test.
Its been developed using hexagonal architecture. The application
implements a functionality to retrieve a product price based on
product id, brand id and a supplied date.

- The project was developed under Java 17 JDK and Spring Boot 3.4.3
using Maven 3.8.7 as dependency manager.
It can be compiled using `mvn clean install` and then run with
`java -jar target/prices-0.0.3-SNAPSHOT.jar`

- The API First methodology was used for this project and an
OpenAPI specification can be found in the main resources folder (prices.yaml)
To generate the code based on the specification the openapi-maven-generator
plugin was used. Its configuration can be found in the pom.xml file

- For adapters, we have a REST API Controller as primary adapter and
a JPA implementation as secondary. The project is configured to
update the database schemas automatically based on its Entities.

- JUnit 5 and Mockito where the libraries used for unitary testing and
in addition the JaCoCo library was used to generate code coverage reports.
After running `mvn clean install` or `mvn clean test` the JaCoCo library
generates a 'site' folder inside 'target' at the root of the project, which
can be checked for code coverage information.

- A postman collection file has been added to the repository in order to
test the API.

## Instructions for testing

Before running the tests we will need to make sure our application is running.
If we followed the instructions from earlier we can run it executing 
`java -jar target/prices-0.0.3-SNAPSHOT.jar` from the project root directory
after having run `mvn clean install`

1. Run from Postman
- Install Postman
- Import the collection
- Run the tests using the UI

2. Run from command line
- Install newman with `npm install -g newman` (Node required)
- Execute `newman run collection.json`