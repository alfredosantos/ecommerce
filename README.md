# run ecommerce DOCKER

Step 1: mvn clean

Step 2: mvn install

Step 3: mvn docker:build

Step 4: docker save ecommerce > ecommerce.tar

Step 5: docker load --input ecommerce.tar

Step 6: docker run -p 8080:8080 -t ecommerce

--------------------------------------
# run ecommerce LOCAL SERVER

How to start the ecommerce application

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/ecommerce-1.0.0-SNAPSHOT.jar`
1. To check that your application is running enter url `http://localhost:8080`

Swagger
To see your swagger enter url `http://localhost:8080/swagger-ui.html#`

--------------------------------------
# configure ecommerce environment properties
- Required
- Database
MONGO_HOST
MONGO_PORT
MONGODB_USER
MONGODB_PASSWORD
MONGO_DATABASE

- Required
- Security
OAUTH2_CLIENT_SCOPE
OAUTH2_CLIENT_CLIENT_ID
OAUTH2_CLIENT_CLIENT_SECRET

- Optional
MONGO_REPOSITORIES_ENABLED
JPA_HIBERNATE_DDL_AUTO
JPA_SHOW_SQL
JPA_PROPERTIES_HIBERNATE_FORMAT_SQL