create database CSE31;
--admin table--
use CSE31;
create table admin (

Username varchar(20) not null,
Password varchar(20) not null,
admin_id int identity(7001,1) not null


);
insert into admin values ('amit','123456'),('akash','123456');
select * from admin

--Doner table-- 
use CSE31;
create table doner(

		id int identity(1001,1) primary key not null,
		name varchar(255) not null,
		age int not  null,
		gender varchar(255) ,
		division varchar(255) not null,
		district varchar(255) not null,
		police_station varchar(255) not null,
		post_office varchar(255) not null,
		post_code int not null,
		occupation varchar(255) not null,
		phone varchar(255) not null,
		email varchar(255) not null,
		amount_of_donation decimal  not null,
		date datetime not null

);
select * from doner


--recipent table----
use CSE31;
create table recipent(

		id int identity(5001,1) primary key not null,
		name varchar(255) not null,
		age int not null,
		gender varchar(255) not null ,
		division varchar(255) not null,
		district varchar(255) not null,
		police_station varchar(255) not null,
		post_office varchar(255) not null,
		post_code int not null,
		
		phone varchar(255) not null,
		email varchar(255)  null,
		family_member int null,
		yearly_income decimal not null,
		occupation varchar(255) not null,
		amount_of_donation decimal  not null,
		date datetime not null

);
select * from recipent

create table WelfareSystem(
	id int primary key identity(90001, 1),
	D_id int foreign key references Doner(id) not null,
	R_id int foreign key references Recipent(id) not null,
);


insert into WelfareSystem values(1001, 5001);
insert into WelfareSystem values(1002, 5002);

---ALL Query We used-----

--admin log in'
select * from admin where username  ='amit'  and password = '123456'
select * from admin where username  ='akash'  and password = '123456'

--search donator's info  with Donator's id
select * from doner where id = 1001


--search recipient's info  with Donator's id
select * from recipent where id = 5001;


--update doner's info
update doner set xxx where xxx = ' ';


--update recipient's info
update recipent set xxx where xxx = ' ';

-- show all doner's list
select id,name,occupation,phone,email,amount_of_donation,date from doner 

-- show all recipent's list
select id,name,occupation,phone,amount_of_donation,date from recipent 

--delete doner
delete  from doner where id = 1001

--delte recipients 
delete from recipent where id = 5001


