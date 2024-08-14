# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . .

# Build the application
RUN ./mvnw package -DskipTests

# Expose port 8080 to the outside world
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/task-management-0.0.1-SNAPSHOT.jar"]
