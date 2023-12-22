CREATE TABLE IF NOT EXISTS department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS employee (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(255),
    salary DECIMAL(10, 2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(department_id)
);

INSERT INTO department (department_id, department_name) VALUES
(1, 'IT'),
(2, 'HR'),
(3, 'Finance'),
(4, 'Marketing'),
(5, 'Sales');

INSERT INTO employee (employee_id, employee_name, salary, department_id) VALUES
(1, 'John Doe', 50000.00, 1),
(2, 'Jane Smith', 60000.00, 2),
(3, 'Bob Johnson', 75000.00, 1),
(4, 'Alice Williams', 55000.00, 3),
(5, 'Charlie Brown', 70000.00, 2),
(6, 'David Davis', 62000.00, 4),
(7, 'Eva White', 80000.00, 3),
(8, 'Frank Miller', 58000.00, 5),
(9, 'Grace Taylor', 68000.00, 4),
(10, 'Harry Thompson', 72000.00, 1);

/* 1 */
SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id;

/* 2 */
SELECT employee_id, employee_name, salary
FROM employee
ORDER BY salary DESC;

/* 3 */
SELECT d.department_name, AVG(e.salary) AS average_salary
FROM department d
JOIN employee e ON d.department_id = e.department_id
GROUP BY d.department_name;
