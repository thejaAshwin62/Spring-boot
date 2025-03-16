# Use a multi-stage build
FROM maven:3.9.5-eclipse-temurin-21 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml and download dependencies first (better cache)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the project and build
COPY . .
RUN mvn clean package -DskipTests

# Create a smaller runtime image
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy the built JAR from the previous stage
COPY --from=build /app/target/odin-0.0.1-SNAPSHOT.jar app.jar

# Expose the app port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
