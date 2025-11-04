# JDBC-MVC-Demo

Java applications demonstrating JDBC database connectivity, CRUD operations, and MVC architecture with MySQL.

This repository contains three comprehensive modules showcasing different aspects of Java database programming:

## Modules Overview

### Part A: MySQL Connection and Data Fetch using JDBC
**Location:** `part-a-mysql-jdbc/`

**Objective:** Connect to a MySQL database and retrieve data from a table using JDBC.

**Features:**
- Establish JDBC connection to MySQL database
- Fetch records from Employee table
- Display records in a structured format
- Demonstrate basic SQL queries with JDBC

**Files:**
- `src/Main.java` - Main entry point with JDBC connection
- `src/DatabaseConnection.java` - Utility class for database connection
- `schema.sql` - Database schema (Employee table)

**Setup Instructions:**
1. Create MySQL database: `CREATE DATABASE jdbc_demo;`
2. Execute `schema.sql` to create Employee table
3. Update database credentials in `DatabaseConnection.java`
4. Compile and run `Main.java`

---

### Part B: CRUD Operations on Product Table
**Location:** `part-b-crud-operations/`

**Objective:** Menu-driven Java program performing CRUD operations with transaction handling.

**Features:**
- Create new product records
- Read/Retrieve product information
- Update existing product details
- Delete product records
- Transaction management (commit/rollback)
- Input validation and error handling
- Menu-driven user interface

**Files:**
- `src/ProductDAO.java` - Data Access Object with CRUD methods
- `src/Product.java` - Product model class
- `src/ProductMenu.java` - Menu-driven interface
- `src/Main.java` - Application entry point
- `schema.sql` - Database schema (Product table)

**Database Schema:**
```sql
CREATE TABLE product (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    product_price DECIMAL(10, 2) NOT NULL,
    product_quantity INT NOT NULL,
    product_description VARCHAR(255)
);
```

**Setup Instructions:**
1. Create MySQL database: `CREATE DATABASE jdbc_demo;`
2. Execute `schema.sql` to create Product table
3. Update database credentials in `ProductDAO.java`
4. Compile and run `Main.java`
5. Use menu options to perform CRUD operations

---

### Part C: Student Management Application using MVC Architecture
**Location:** `part-c-mvc-architecture/`

**Objective:** Build a Student Management application following MVC design pattern with JDBC.

**Architecture:**
- **Model:** Data model and database operations
- **View:** User interface (console-based or UI)
- **Controller:** Business logic and request handling

**Features:**
- Add new student records
- View all students
- Update student information
- Delete student records
- Search students by roll number
- MVC pattern implementation
- JDBC for database operations

**Directory Structure:**
```
part-c-mvc-architecture/
├── src/
│   ├── model/
│   │   ├── Student.java
│   │   └── StudentDAO.java
│   ├── view/
│   │   └── StudentView.java
│   ├── controller/
│   │   └── StudentController.java
│   └── Main.java
├── schema.sql
└── README.md
```

**Database Schema:**
```sql
CREATE TABLE student (
    roll_number INT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    student_email VARCHAR(100),
    student_age INT,
    student_course VARCHAR(50)
);
```

**Setup Instructions:**
1. Create MySQL database: `CREATE DATABASE jdbc_demo;`
2. Execute `schema.sql` to create Student table
3. Configure database connection in model layer
4. Compile all Java files
5. Run `Main.java` to start the application

---

## General Setup and Requirements

### Prerequisites:
- Java 8 or higher
- MySQL Server (5.7 or higher)
- MySQL JDBC Driver (mysql-connector-java)
- IDE: Eclipse, IntelliJ IDEA, or VS Code with Java extensions

### Database Configuration:
Update the following in each module's database connection class:
```java
private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

### Adding MySQL JDBC Driver:
1. Download `mysql-connector-java-x.x.xx.jar`
2. Add to project classpath/lib folder
3. Or use Maven: `mysql:mysql-connector-java:8.0.33`

### Compilation and Execution:

**Part A:**
```bash
cd part-a-mysql-jdbc
javac -cp src src/*.java
java -cp src Main
```

**Part B:**
```bash
cd part-b-crud-operations
javac -cp src src/*.java
java -cp src Main
```

**Part C:**
```bash
cd part-c-mvc-architecture
javac -cp src src/model/*.java src/view/*.java src/controller/*.java src/Main.java
java -cp src Main
```

---

## Key Concepts Covered

1. **JDBC Basics:**
   - Connection establishment
   - Statement execution
   - ResultSet processing
   - Resource management

2. **CRUD Operations:**
   - INSERT queries
   - SELECT queries with filtering
   - UPDATE operations
   - DELETE operations

3. **Database Transactions:**
   - Begin, commit, rollback
   - Error handling
   - Data consistency

4. **MVC Architecture:**
   - Separation of concerns
   - Model-View-Controller pattern
   - Data access layer (DAO)
   - Business logic separation

5. **Best Practices:**
   - Connection pooling
   - Prepared statements (SQL injection prevention)
   - Exception handling
   - Resource cleanup
   - Input validation

---

## File Structure

```
jdbc-mvc-demo/
├── part-a-mysql-jdbc/
│   ├── src/
│   │   ├── Main.java
│   │   └── DatabaseConnection.java
│   └── schema.sql
├── part-b-crud-operations/
│   ├── src/
│   │   ├── Main.java
│   │   ├── Product.java
│   │   ├── ProductDAO.java
│   │   └── ProductMenu.java
│   └── schema.sql
├── part-c-mvc-architecture/
│   ├── src/
│   │   ├── model/
│   │   │   ├── Student.java
│   │   │   └── StudentDAO.java
│   │   ├── view/
│   │   │   └── StudentView.java
│   │   ├── controller/
│   │   │   └── StudentController.java
│   │   └── Main.java
│   ├── schema.sql
│   └── README.md
├── .gitignore
└── README.md
```

---

## Learning Resources

- [Java JDBC Tutorial](https://docs.oracle.com/javase/tutorial/jdbc/)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [MVC Architecture Pattern](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)
- [DAO Pattern](https://www.oracle.com/java/technologies/dataaccessobject.html)

---

## Contributing

Feel free to fork this repository and submit pull requests for improvements.

## License

This project is open source and available under the MIT License.

---

## Author

Created for educational purposes to demonstrate JDBC and MVC architecture in Java.
