DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    employee_num        INT             PRIMARY KEY NOT NULL,
    first_name       	VARCHAR(40)     NOT NULL,
    birth_date			DATE                	,
    created_datetime    DATETIME        DEFAULT CURRENT_TIMESTAMP		
);