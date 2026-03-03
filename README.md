# 🚀 Employee Management System - Backend

Frontend Url : https://github.com/VELAGASUBHASH/EmployeeManagementSystem-Using-React-Frontend
Overall Webiste Live Preview : https://employee-management-system-using-re.vercel.app/

A production-ready Spring Boot REST API for managing Employees and Departments.

Deployed with Docker on Render and connected to PostgreSQL.

---

## 🛠 Tech Stack

Spring Boot 4  
Spring Data JPA  
PostgreSQL  
Hibernate  
Docker  
Render (Deployment)  
Maven  
Java 17  

---

## 📦 Features

- Create Department
- Get All Departments
- Create Employee
- Get All Employees
- Department ↔ Employee Relationship (One-to-Many)
- Unique Email Constraint
- Production Deployment with Docker
- PostgreSQL Database Integration

---

## 🗂 Project Structure

```
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 └── EmployeeManagementSystemApplication.java
```

---

## ⚙️ Environment Variables

Set these in your deployment platform (Render):

```
SPRING_DATASOURCE_URL=jdbc:postgresql://<hostname>:5432/<database>
SPRING_DATASOURCE_USERNAME=<username>
SPRING_DATASOURCE_PASSWORD=<password>

SPRING_JPA_HIBERNATE_DDL_AUTO=update
SPRING_JPA_DATABASE_PLATFORM=org.hibernate.dialect.PostgreSQLDialect
```

---

## ▶️ Run Locally

### 1️⃣ Clone repository

```bash
git clone https://github.com/your-username/ems-backend.git
cd ems-backend
```

### 2️⃣ Update application.properties

```
spring.datasource.url=jdbc:postgresql://localhost:5432/ems
spring.datasource.username=postgres
spring.datasource.password=yourpassword
```

### 3️⃣ Run

```bash
mvn spring-boot:run
```

Server runs on:

```
http://localhost:8080
```

---

## 🐳 Docker Build

Build image:

```bash
docker build -t ems-backend .
```

Run container:

```bash
docker run -p 8080:8080 ems-backend
```

---

## 🌐 API Endpoints

### 📌 Department APIs

Create Department

```
POST /api/departments/add
```

Sample Body:

```json
{
  "name": "Engineering",
  "location": "Hyderabad"
}
```

Get All Departments

```
GET /api/departments/getalldepartments
```

---

### 📌 Employee APIs

Create Employee

```
POST /api/employees/add
```

Sample Body:

```json
{
  "name": "Subhash",
  "email": "subhash@gmail.com",
  "salary": 75000,
  "department": {
    "id": 1
  }
}
```

Get All Employees

```
GET /api/employees/getallemployees
```

---

## 🧠 Database Schema

### Department

| Field     | Type   |
|-----------|--------|
| id        | Long   |
| name      | String |
| location  | String |

### Employee

| Field         | Type   |
|---------------|--------|
| id            | Long   |
| name          | String |
| email         | String (Unique) |
| salary        | Double |
| department_id | Long (FK) |

---

## 🚀 Deployment

- Dockerized application
- PostgreSQL hosted on Render
- Auto-deploy from GitHub
- Environment variables configured in Render

---

## 👨‍💻 Author

Velaga Subhash  
Full Stack Developer  

---

## ⭐ Future Improvements

- JWT Authentication
- Role-based Access Control
- Swagger API Documentation
- Pagination & Sorting
- Global Exception Handling
- Logging & Monitoring
- CI/CD Pipeline
