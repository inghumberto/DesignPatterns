# Use a base image with Java 17 and Alpine Linux
FROM maven:3.8.3-openjdk-17

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven project files
COPY . /app/
RUN cd /app
RUN mvn clean install
# Command to run the application
CMD ["java", "-jar", "/app/target/design-patterns-1.0.0-SNAPSHOT.jar"]