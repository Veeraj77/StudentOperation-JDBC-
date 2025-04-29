#  StudentOperation-JDBC

A simple Java console application demonstrating **CRUD** (Create, Read, Update, Delete) operations on a student database using **JDBC** and **MySQL**.

---

##  Features

-  Add new student records  
-  View all student records  
-  Update existing student records  
-  Delete student records  
-  Menu-driven console interface  

---

##  Prerequisites

-  Java Development Kit (JDK) 8 or higher  
-  MySQL Database  
-  MySQL JDBC Driver  


## SQL Code

CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    grade VARCHAR(10)
);

## DBConnection

private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
private static final String USERNAME = "your-username";
private static final String PASSWORD = "your-password";

## Menu

1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice:


## Key Functions and Their Purpose
### DBConnection.java
getConnection()
Returns a Connection object to connect to the MySQL database.

### StudentDAO.java
addStudent(Student student)
Inserts a new student record into the database.

getAllStudents()
Retrieves and returns a list of all student records.

updateStudent(Student student)
Updates an existing student's data in the database.

deleteStudent(int id)
Deletes a student record by ID.

### StudentOperations.java
addStudent()
Takes user input and calls StudentDAO.addStudent().

viewAllStudents()
Calls StudentDAO.getAllStudents() and prints student data.

updateStudent()
Takes user input and calls StudentDAO.updateStudent().

deleteStudent()
Takes user input and calls StudentDAO.deleteStudent()
