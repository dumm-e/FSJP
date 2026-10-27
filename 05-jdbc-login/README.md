# Experiment 5: JDBC login with JSP and Servlet

All source files are kept directly in this experiment folder. This example uses Jakarta Servlet and MySQL Connector/J. Deploy the files to a Jakarta-compatible servlet container and add MySQL Connector/J to the app.

Create the database and table:

```sql
CREATE DATABASE login_db;
USE login_db;
CREATE TABLE users (username VARCHAR(100) PRIMARY KEY, password VARCHAR(255) NOT NULL);
INSERT INTO users (username, password) VALUES ('student', 'change-me');
```

Configure `DB_URL` (defaults to `jdbc:mysql://localhost:3306/login_db`), `DB_USER`, and `DB_PASSWORD` as server environment variables. For a real application, store a strong password hash and verify it with a password hashing library; this lab keeps the simple comparison from the reference example. Do not commit database credentials.
