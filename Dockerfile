FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/cicdsetup-image.jar cicdsetup-image.jar
ENTRYPOINT ["java","-jar","/cicdsetup-image.jar"]