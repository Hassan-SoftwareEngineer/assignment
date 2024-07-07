# Assignment Application

This project is a Java-based assignment application designed to manage surveys, questions, and answers. It includes models for candidates, companies, jobs, questions, surveys, and survey answers.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Assignment Application is designed to handle various aspects of a survey system, including managing candidates, companies, jobs, questions, surveys, and answers.

## Features

- Manage candidates, companies, and jobs
- Create and manage surveys and questions
- Record survey answers

## Project Structure

assignment/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── serand/
│   │   │           └── assignment/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               │   ├── Candidate.java
│   │   │               │   ├── Company.java
│   │   │               │   ├── Job.java
│   │   │               │   ├── QuestionOptions.java
│   │   │               │   ├── Questions.java
│   │   │               │   ├── Survey.java
│   │   │               │   └── SurveyAnswer.java
│   │   │               ├── repository/
│   │   │               ├── sample/
│   │   │               └── service/
│   │   ├── resources/
│   │   │   ├── application.properties
│   ├── test/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md

## Installation

### Prerequisites

- Java 11 or higher
- Maven
- A database (e.g., MySQL, PostgreSQL)

### Steps

1. **Clone the repository**:
    ```bash
    cd assignment
    ```

2. **Configure the database**:
    Update the `application.properties` file with your database configuration.

3. **Build the project**:
    ```bash
    ./mvnw clean install
    ```

4. **Run the application**:
    ```bash
    ./mvnw spring-boot:run
    ```

The application should now be running on `http://localhost:8080`.

## Usage

### API Endpoints

Here are some of the main API endpoints:

- **Candidates**
  - `GET /candidates`: Get all candidates
  - `POST /candidates`: Create a new candidate
  - `GET /candidates/{id}`: Get a candidate by ID
  - `PUT /candidates/{id}`: Update a candidate
  - `DELETE /candidates/{id}`: Delete a candidate

- **Companies**
  - `GET /companies`: Get all companies
  - `POST /companies`: Create a new company
  - `GET /companies/{id}`: Get a company by ID
  - `PUT /companies/{id}`: Update a company
  - `DELETE /companies/{id}`: Delete a company

- **Jobs**
  - `GET /jobs`: Get all jobs
  - `POST /jobs`: Create a new job
  - `GET /jobs/{id}`: Get a job by ID
  - `PUT /jobs/{id}`: Update a job
  - `DELETE /jobs/{id}`: Delete a job

- **Surveys**
  - `GET /surveys`: Get all surveys
  - `POST /surveys`: Create a new survey
  - `GET /surveys/{id}`: Get a survey by ID
  - `PUT /surveys/{id}`: Update a survey
  - `DELETE /surveys/{id}`: Delete a survey

- **Questions**
  - `GET /questions`: Get all questions
  - `POST /questions`: Create a new question
  - `GET /questions/{id}`: Get a question by ID
  - `PUT /questions/{id}`: Update a question
  - `DELETE /questions/{id}`: Delete a question

## Contributing

We welcome contributions from the community. To contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
