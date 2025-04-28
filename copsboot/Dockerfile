# Use official OpenJDK image
FROM eclipse-temurin:17-jre

# Set working directory inside container
WORKDIR /app

# Copy the JAR file into the container
COPY target/copsboot-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on (if needed, 8080 usually)
EXPOSE 8080

# Define default command
ENTRYPOINT ["java", "-jar", "app.jar"]
