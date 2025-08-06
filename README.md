
# 📝 Spring Boot Task Manager

A simple Spring Boot application to manage tasks — allowing users to create, update, delete, and track task status.

---

## 🚀 Features

- Create, read, update, delete (CRUD) tasks  
- Task status tracking: Pending, In Progress, Completed  
- Search and filter tasks by title or status  
- REST API support for easy integration

---

## 🧩 Technology Stack

- Java 17+  
- Spring Boot  
- Spring Data JPA  
- H2 / MySQL (configurable)  
- Spring MVC (REST controllers)  
- Optional: Thymeleaf or Bootstrap (for web UI)

---

## 🚧 Prerequisites

- Java 17 or higher  
- Maven  
- (Optional) MySQL/PostgreSQL for production

---

## 🛠️ Getting Started

```bash
# Clone the repository
git clone https://github.com/sahilsingh78/springboot-task-manager.git

# Navigate to the project directory
cd springboot-task-manager

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

Visit: `http://localhost:8080`

---

## 🔌 Configuration

### H2 (Default)
```properties
spring.datasource.url=jdbc:h2:mem:taskdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

### MySQL (Optional)
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tasks
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

---

## 📮 API Endpoints

| Method | Endpoint           | Description              |
|--------|--------------------|--------------------------|
| GET    | `/api/tasks`       | Get all tasks            |
| GET    | `/api/tasks/{id}`  | Get task by ID           |
| POST   | `/api/tasks`       | Create new task          |
| PUT    | `/api/tasks/{id}`  | Update task              |
| DELETE | `/api/tasks/{id}`  | Delete task              |
| PATCH  | `/api/tasks/{id}/complete` | Mark task complete |

---

## 🧪 Running Tests

```bash
mvn test
```

---

## 🤝 Contributing

1. Fork the repository  
2. Create your feature branch: `git checkout -b feature/my-feature`  
3. Commit your changes: `git commit -m "Add new feature"`  
4. Push to the branch: `git push origin feature/my-feature`  
5. Open a pull request

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Sahil Singh**  
[GitHub](https://github.com/sahilsingh78)
