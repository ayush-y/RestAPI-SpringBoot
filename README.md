- Overview
This is a RESTful To-Do application built using Spring Boot.
It provides an API for managing to-do items, including creating, reading, updating, and deleting tasks. 
The project follows best practices for modular design, aspect-oriented programming, and service-layer separation.

- Features
CRUD operations for to-do items.

Implementation of service layers 
-TodoService 
-FakeTodoService 
-AnotherTodoService

Aspect-oriented logging
(TimeMonitor, 
TimeMonitorAspect).

RESTful API with TodoController.

Project Structure


## Features

- CRUD operations for managing to-do items
- Modular service implementation
- Spring Boot REST API design
- Time tracking aspect integration
- Mock service implementations for testing purpose

## Setup & Installation

### Prerequisites
- Java 17+
- Gradle 7+
- Spring Boot 3+
- Postman (Optional for API testing)

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/todo-spring-boot.git


Gradle build system for project automation.
├── gradle/                # Gradle build scripts
├── src/
│   ├── main/
│   │   ├── java/com/example/TodoSpringBootRestApplication/
│   │   │   ├── Todo.java                    # Model class for to-do items
│   │   │   ├── TodoService.java             # Main service interface
│   │   │   ├── FakeTodoService.java         # Mock service implementation
│   │   │   ├── AnotherTodoService.java      # Alternative service implementation
│   │   │   ├── TodoController.java          # REST controller handling API requests
│   │   │   ├── TodoApiSpringApplication.java # Main application entry point
│   │   │   ├── TimeMonitor.java             # Monitoring class
│   │   │   ├── TimeMonitorAspect.java       # Aspect for time tracking
│   │   ├── resources/                        # Configuration and static resources
│   ├── test/java/com/example/TodoSpringBootRestApplication/
│   │   ├── TodoSpringBootRestApplicationTests.java # Unit tests
├── .gitattributes                               # Git configuration for file attributes
├── .gitignore                                   # Git ignore file for unnecessary files.
Used Postman tool to test all APIs

