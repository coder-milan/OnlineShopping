create database walmart_shopping;

use walmart_shopping;

create table customer(
id bigint(15) not null auto_increment,
name varchar(100) not null,
phone varchar(30),
address varchar(30),
created_at date not null,
primary key (id)
);

select * from customer;

rename table customer to customers;

select * from customers;

create table customer_login(
id bigint(15) not null auto_increment,
username varchar(100) not null,
password varchar(100) not null,
created_at datetime not null,
updated_at datetime ,
last_signed_on datetime,
customer_id bigint(15) not null,
primary key (id),
foreign key (customer_id) references customers(id)
);

alter table customer_login add  
CONSTRAINT username_uniquek UNIQUE (username);
