# Employee_Management_Application_Project_1

# Employee Management System (Spring Boot, Thymeleaf)
## Tech Stack:
- Spring Boot (Backend)
- Spring JPA, Hibernate (Database ORM)
- Thymeleaf (Frontend Templating)
- MySQL (Database)
- Bootstrap (CSS)
---
## Features:
- Add, View, Edit, Delete Employees (CRUD)
- Search Employees by Name
- Form Validation (Backend and Frontend)
- Global Exception Handling
- Swagger API Documentation
## Setup Instructions:
### 1. Clone the Repository
```bash
git clone <your-repo-url>
cd employee-management
2. Setup MySQL Database
CREATE DATABASE employee_db;
3. Configure application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
4. Run the Project
mvn spring-boot:run
5. Access Application:
Web Interface: http://localhost:8080/employees
Swagger API: http://localhost:8080/swagger-ui.html

API Endpoints:
Action
URL
Method
List all employees
/employees
GET
Create new employee
/employees
POST
Get employee for edit
/employees/edit/{id}
GET
Update employee
/employees/update/{id}
POST
Delete employee
/employees/delete/{id}
GET
Search employee
/employees/search?keyword={keyword}
GET


📄 Data Model (Employee):
Field
Type
Validation
id
Long
Auto-generated
name
String
Required
department
String
Required
email
String
Unique, Email
salary
Double
-


Sample Swagger Output In http://localhost:8080/swagger-ui.html, you will see:
Method
Path
Description
GET
/api/employees
Get all employees
POST
/api/employees
Add new employee
GET
/api/employees/{id}
Get employee by ID
PUT
/api/employees/{id}
Update employee
DELETE
/api/employees/{id}
Delete employee
GET
/api/employees/search
Search employees





🚧 Validations:
Name, Department - Cannot be empty.
Email - Valid and unique format.
Global error handling for non-existent employees.


