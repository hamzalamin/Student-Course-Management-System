Student-Course Management System
This project is a Student-Course Management System built using Java, Hibernate, and PostgreSql. It provides functionality for managing students and courses, allowing administrators to add, update, delete, and assign students to courses. The system leverages Hibernate ORM for managing the relationships between Student and Course entities and performing database operations seamlessly.

Features:
Add new students and courses to the system.
Update existing student and course details.
Delete students and courses.
Assign students to one or more courses.
Manage many-to-many relationships between students and courses using Hibernate annotations.
Technologies:
Java 11+
Hibernate ORM
PostgreSql
Maven (for project build and dependency management)
Getting Started:
Clone the repository.
Set up the PostgreSql database and configure hibernate.cfg.xml with your database credentials.
Build the project using Maven.
Run the application to manage students and courses.
Database Relationship:
The system models a many-to-many relationship between students and courses:

A student can be enrolled in multiple courses.
A course can have multiple students enrolled.
