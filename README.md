# Employee Management System

The Employee Management System is a Spring Boot application designed to manage employee data using RESTful APIs. It allows CRUD operations (Create, Read, Update, Delete) for employee records stored in a database.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)
- [Endpoints](#endpoints)
- [Testing](#testing)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Employee Management System is a web-based application that provides functionalities to manage employee records. It allows users to perform CRUD operations on employee data, including adding new employees, updating existing records, retrieving employee details, and deleting records.

## Features

- Add a new employee with details (name, phone number, email, etc.).
- Update employee information.
- Retrieve employee details by ID or get a list of all employees.
- Delete an employee by ID.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) - version X.X or higher
- Apache Maven installed
- MySQL database (or any preferred database) installed and running
- Git (optional for cloning the repository)

## Setup

1. **Clone the repository**:

    ```bash
    git clone <repository_url>
    cd employee-management-system
    ```

2. **Database Setup**:
   
   - Create a MySQL database named `employee`.
   - Configure the database connection in `application.properties`.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/employee
    spring.datasource.username=root
    spring.datasource.password=dmbhoyar
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    ```

3. **Build the application**:

    ```bash
    mvn clean install
    ```

## Running the Application

Run the Spring Boot application:

```bash
mvn spring-boot:run
