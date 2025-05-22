drop database if exists customer_db;
create database customer_db;
use  customer_db;

create table customer (
	customer_id BIGINT not null,
	email_id varchar(20),
	name varchar(20),
	date_of_birth date,
	city varchar(10),
	primary key (customer_id)
);


INSERT INTO customer VALUES (1001,'steven@infy.com', 'Steven', '1992-11-29','Seattle');
INSERT INTO customer VALUES (1002,'kevin@infy.com', 'Kevin','1993-04-30','Vancouver');
INSERT INTO customer VALUES(1003,'john@infy.com', 'John', '1993-07-29','Yakima');
INSERT INTO customer VALUES (1004,null, 'Chan', '1982-08-11','Vancouver');
INSERT INTO customer VALUES(1005,'jill@infy.com', 'Jill', '1990-01-01','Vancouver');
INSERT INTO customer VALUES(1006,'jack@infy.com', 'Jack', '1996-07-28','Seattle');

select * from customer;
commit;
