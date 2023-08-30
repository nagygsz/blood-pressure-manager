# Use the official OpenJDK base image for Java 17
FROM openjdk:17-jdk-slim-buster

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Spring Boot JAR file into the container
# remote path after copy
COPY ./blood-pressure-manager.jar app.jar
COPY ./application.yaml application.yaml

# Expose the port that your Spring Boot app will run on
EXPOSE 8080

# Command to run your Spring Boot application
CMD ["java", "-jar", "app.jar"]