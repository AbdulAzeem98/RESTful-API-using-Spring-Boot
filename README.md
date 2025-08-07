# Spring Boot RESTful API(For Software Engineer Managment)

This project is a Spring Boot RESTful API that manages data of software engineers.
It allows clients to perform basic CRUD (Create, Read, Update, Delete) operations on software engineer records stored in a PostgreSQL database.

A RESTful API built with Spring Boot, Spring Data JPA, and PostgreSQL (via Docker) to manage Software Engineers.

## Tech Stack

- Java 21
- Spring Boot 3.5.4 (Web, Data JPA)
- PostgreSQL (Dockerized)
- Maven
- IntelliJ IDEA

## Setup

1. Clone the repo:
git clone https://github.com/AbdulAzeem98/RESTful-API-using-Spring-Boot.git
cd RESTful-API-using-Spring-Boot


2. Start PostgreSQL with Docker:
docker-compose up -d


3. Run the app (`Application.java`) in IntelliJ or:
./mvnw spring-boot:run


4. Access API at `http://localhost:8080`

## API Endpoints

Base URL: `/api/v1/software-engineers`

| Method | Endpoint              | Description             |
|--------|-----------------------|-------------------------|
| GET    | `/`                   | Hello World             |
| GET    | `/`                   | List all engineers      |
| GET    | `/{id}`               | Get engineer by ID      |
| POST   | `/`                   | Add new engineer        |
| PUT    | `/{id}`               | Update engineer by ID   |
| DELETE | `/{id}`               | Delete engineer by ID   |

Example: Add Engineer

POST /api/v1/software-engineers
Content-Type: application/json

{
"id": 1,
"name": "Shumaire",
"techStack": "content creation, python"
}

## Notes

- Database port mapped to 5332 via Docker
- Uses `spring.jpa.hibernate.ddl-auto=create-drop` (for dev)
- For production, consider migrations and better exception handling

## Author

Abdul Azeem | [GitHub](https://github.com/AbdulAzeem98)

