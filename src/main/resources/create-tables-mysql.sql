DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    id        			INT             PRIMARY KEY AUTO_INCREMENT NOT NULL,
    first_name       	VARCHAR(40)     NOT NULL,
    last_name			VARCHAR(40)		NOT NULL,
    birth_date			DATE                	,
    email				VARCHAR(40)		NOT NULL,
    created_datetime    DATETIME        NOT NULL DEFAULT CURRENT_TIMESTAMP		
);