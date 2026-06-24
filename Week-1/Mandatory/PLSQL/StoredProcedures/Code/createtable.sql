CREATE TABLE accounts (
    account_id NUMBER PRIMARY KEY,
    account_holder VARCHAR2(100),
    account_type VARCHAR2(20),
    balance NUMBER(12,2)
);
CREATE TABLE employees (
    employee_id NUMBER PRIMARY KEY,
    employee_name VARCHAR2(100),
    department_id NUMBER,
    salary NUMBER(10,2)
);
