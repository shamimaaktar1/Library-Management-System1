
--CREATE DATABASE LibraryManagementSystem


create table authenticator(
	a_id varchar(20) not null ,
	type varchar(30) not null,
	primary key ( a_id)


);




create table users(
	u_id varchar(20) not null,
	a_id varchar(20) not null,
	fname varchar(50) not null,
	lname varchar(50) not null,
	phone varchar(50) not null,
	dateofbirth date not null,
	addres varchar (100) not null,
	pasword varchar(50) not null,
	picture varchar(100) not null,
	gender varchar(20) not null,
    primary key ( u_id),
	foreign key (a_id) references authenticator ,
	

);



create table membercard(
	card_no varchar(20) not null,
	u_id varchar(20) not null,
	issue_date date not null,
	exp_date date not null,
	primary key ( card_no),
	foreign key (u_id) references users,
	
);

create table publisher(
	pub_id varchar(20) not null,
	fname  varchar(50) not null,
	lname varchar(50) not null,
	phone varchar(50) not null, 
	dateofbirth date not null,
	address varchar(100) not null,
	primary key (pub_id),

);



create table book(

	bk_code varchar(20) not null,
	title varchar(100) not null,
	pub_id varchar(20) not null,
	price varchar(20) not null,
	numofcopy varchar(10) not null,
	isbn varchar(50) not null,
	picture varchar(100) not null,
    [author] [varchar](100)not null,
    primary key ( bk_code),
	foreign key (pub_id) references publisher ,

);

create table category(
	cat_id varchar(20) not null,
	cat_name varchar(100) not null,
	daily_fine varchar(20) not null,
	rent_rate varchar(50) not null,
	primary key (cat_id)

);

create table bookcategory(
	bk_code varchar(20) not null,
	cat_id varchar(20) not null,
	 primary key (cat_id, bk_code),
	 foreign key (cat_id) references category ,
		
	 foreign key ( bk_code) references book ,
	

);




create table memberbook(

	  bk_code varchar(20) not null,
	  u_id varchar(20)not null,
	  borrow_date date not null,
	  retrn_date date ,
	  due_date date not null,
	  status varchar(50) not null,
	  primary key (u_id, bk_code),
	  
	  foreign key (u_id) references users,
		
	 foreign key ( bk_code) references book ,
	  
);



create table reservations(
	resrve_id varchar(20) not null,
	u_id varchar(20) not null,
	bk_code varchar(20) not null,
	reserve_date date not null,
	pick_date date not null,
	satus varchar(50) not null,
	primary key (resrve_id) ,
	
	foreign key (u_id) references users,
		
	 foreign key ( bk_code) references book,
	

);