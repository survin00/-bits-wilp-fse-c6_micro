# Use an official Java runtime as a parent image
FROM openjdk:17.0.2-slim

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR
COPY target/weborder-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]