# JobTrack — Job Application Tracking System

JobTrack is a Java-based project built with Spring Boot and MySQL to help organize and track job application records.

## About the Project

Managing multiple job applications can be difficult. JobTrack aims to make this process easier by providing a backend application for storing and managing job-related records.

## Technologies Used

- **Java** — Backend programming
- **Spring Boot** — Application framework
- **MySQL** — Relational database
- **Maven** — Build and dependency management
- **Git & GitHub** — Version control and source code hosting

## Key Features

- Store and manage job-related records
- Track job application statuses
- Use REST APIs to handle application requests
- Integrate with a MySQL database

## Project Structure

```text
JobTrack/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/jobtrack/
│   │   └── resources/
│   └── test/
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

Make sure you have the following installed:

- Java JDK
- MySQL Server
- Git

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Sanjana200306/JobTrack.git
   ```

2. Open the project directory:

   ```bash
   cd JobTrack
   ```

3. Create the required MySQL database.

4. Configure your database connection locally in `src/main/resources/application.properties`. Never commit database passwords or other secrets to GitHub.

5. Run the application on Windows using PowerShell:

   ```powershell
   .\mvnw.cmd spring-boot:run
   ```

6. Once the application starts successfully, access it at:

   `http://localhost:8080`

   API endpoints depend on the controllers implemented in the project.

## Future Improvements

- Add a user authentication system
- Build a frontend dashboard
- Add search and filtering for job applications
- Improve automated testing

## Author

**Sanjana**

[GitHub Profile](https://github.com/Sanjana200306)

---

*This project is part of my journey toward becoming a Software Engineer.*


