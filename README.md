
                                                                HOTEL MANAGEMENT SYSTEM
                                                                 ========================


STEP 1 = First download MySQL GUI from the browser and install it.


STEP 2= then copy and paste these queries from these file and run the query one-by-one.

STEP 3=    create database hotelmanagementsystem;


STEP 4=    use hotelmanagementsystem;



STEP 5=   create table login(username varchar(25),password varchar(25));


STEP 6 =   insert into login values('admin','12345');



STEP 7 =   select*from login;


STEP 8 =    create table employee(name varchar(25),age varchar(10),gender varchar(15),job varchar(30),salary varchar(15),phone varchar(15),email varchar(40),aadhar varchar(20))



STEP 9=  select* from employee;


STEP 10=  create table room(roomnumber varchar(10),availability varchar(20),cleaning_status varchar(20),price varchar(20),bed_type varchar(20));


STEP 11= create table driver(name varchar(20), age varchar(10),gender varchar(15),company varchar(20), brand varchar(20),available varchar(20),location varchar(40));



STEP 12= create table customer(document varchar(20),number varchar(30),name varchar(30),gender varchar(15),country varchar(20),room varchar(10),checkintime varchar(80),deposite varchar(20));



STEP 13=   create table customers(document varchar(20),number varchar(30),name varchar(30),gender varchar(15),country varchar(20),room varchar(10),checkintime varchar(80),deposit varchar(20));


STEP 14= create table department(department varchar(30),budget varchar(30));


STEP 15=

insert into department values('Front Office','500000');

insert into department values('HouseKeeping','40000');

insert into department values('Food and Beverage','23000');

insert into department values('Kitchen or Food Production','540000');

insert into department values('Security','320000');

