# Step 1: Use Maven to build the application
FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /app

# Copy project files
COPY . .

# Build the application (skip tests for faster build)
RUN mvn clean package -DskipTests

# Step 2: Use a lightweight JRE image to run the app
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copy the built jar file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
