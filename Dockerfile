FROM openjdk:8-jre-alpine

ADD target/ecommerce-*.jar ./ecommerce.jar

EXPOSE 8080
EXPOSE 5005

ENTRYPOINT ["java", "-jar", "./ecommerce.jar"]