# Learn Repository - Design Patterns

This repository contains the implementation of various design patterns using Spring Boot 3 for the topic of "Learn Code for Design Patterns".

## Classification of Design Patterns

Design patterns are divided into three categories:

1. **Creational Patterns** (creational design patterns): These patterns provide a way to create objects in a manner suitable to the situation. The goal is to create objects in a way that is appropriate to the context. Examples of creational patterns include Singleton, Factory, Abstract Factory, Builder, Prototype, and Composite.

2. **Structural Patterns** (structural design patterns): These patterns deal with object composition, that is, how different objects are combined to form larger objects. They provide a way to make the design flexible and modular by identifying simple yet effective ways to compose objects. Examples of structural patterns include Adapter, Bridge, Composite, Decorator, Facade, Flyweight, and Proxy.

3. **Behavioral Patterns** (behavioral design patterns): These patterns define the interactions between objects. They identify common communication patterns between objects and realize these patterns. Examples of behavioral patterns include Observer, State, Strategy, Template Method, Command, Iterator, and Mediator.

Each pattern has its own directory with a detailed implementation and readme file.
## Running the Application
### Running with Docker

To run this application using Docker, you can follow these steps:

1. Make sure you have Docker installed on your machine.

2. Clone this repository to your local machine:
   ```bash
   git clone git@github.com:inghumberto/DesignPatterns.git
3. Navigate to the project directory:
   ```bash
   cd DesignPatterns
4. Build the Docker image using the provided Dockerfile:
   ```bash
   docker build -t design-patterns .
   docker run -p 8080:8080 design-patterns
This command will start the application inside a Docker container and map port 8080 of the container to port 8080 of your local machine. You can access the application by navigating to http://localhost:8080 in your web browser.


### Running with Docker Compose
To run this application using Docker, you can follow these steps:

1. Make sure you have Docker installed on your machine.

2. Clone this repository to your local machine:
   ```bash
   git clone git@github.com:inghumberto/DesignPatterns.git
1. Build the Docker image by running `docker-compose build` in the terminal.
2. Start the application by running `docker-compose up` in the terminal.

The application will be accessible at http://localhost:9090/design-patterns.

Please note that Spring Boot 3 is not released yet, so the actual implementation may vary based on the final release.
