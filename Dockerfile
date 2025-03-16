# Use a lightweight Java image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the .env file (optional if you're using dotenv)
COPY .env .env

# Copy the built JAR file into the container
COPY target/odin-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
