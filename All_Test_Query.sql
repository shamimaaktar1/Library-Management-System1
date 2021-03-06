
--1.find authenticator
select * from authenticator where a_id='0001';

--2.find users
select * from users where u_id='0001' ;

--3.Find Publisher

select * from publisher   where  pub_id ='0004' 

--4.find Book

select * from book where bk_code='0006'

--5.Find the membercard 

select u_id,card_no from membercard where u_id='0012' and card_no='0009'


--6.Find the membercard and users

select users.u_id,card_no from users,membercard where users.u_id='0012' and card_no='0009'

--7.Find category

select * from category where  cat_id ='0004'

--8.Find all from bookcategory
select * from bookcategory where  cat_id ='0004' and bk_code='0006'

--9.Find all the users details and brorro details who had borrow one book

select * from users,memberbook where memberbook.status='Borrow'  and memberbook.u_id=users.u_id;

--10.Find all the category 

select * from category;

--10.Find all the category  whice rent rate is 5 to 10

select * from category where rent_rate between 5 and 10

--11.Find all the Category tuples whose daily fine 1 or 2.

select* from Category where daily_fine=1 or daily_fine=2 

--12.Find all of Users with Gender='Female'

select * from users  where gender='Female'

--13.Find all of users with ordering them in descending order by authenticator ID
 
 select * from users order by a_id desc
 
 --14.Find all Users information。
 
 select*from users
 
 --15.Find all Users id, authenticator id fast name,last name 。
 
 select u_id, a_id,fname,lname from users
 
 --15.Find all Users id,fast name,last name, phone number  address 。
 
 select u_id, fname,lname,phone,addres from users
 
 --16 Find all of users info with ascending order by authenticator id and descending order by first Name.
 
 select*from Users order by a_id asc,fname desc
 
 --17 Find the number of all of users in Library.
 
 select count(*)from  users

--18 Find the UserID and faname ,last name whose Users ID  highest

select u_id,fname,lname from users where u_id in (select MAX(u_id)from users)

--19  Find users type and user detailes

Select u_id,users.a_id,type,fname,lname,phone,dateofbirth,addres,gender,picture  from users,authenticator

--20 Find all the authenticator

Select * from authenticator;

--21 Find all the authenticator where type is admin

Select * from authenticator where type= 'admin'

--22 Find all the authenticator where type is Librarian

Select * from authenticator where type= 'Librarian'

--23 Find all the authenticator where type is Member

Select * from authenticator where type= 'Member'

--24 Find all the MemberCard

Select * from membercard

--25 Find all the MemberCard and users details

Select * from users,membercard where membercard.u_id=users.u_id

--26 FIND ALL THE pUBLISHER

SELECT * FROM publisher

--27 FIND ALL THE publisher who published at least one book

SELECT * FROM publisher,book where publisher.pub_id=book.pub_id

--28.Find all the book

Select * from book

--29Find all of book with ordering them in descending order by price

Select * from book order by price desc


--30 Find the book title and author name

Select title,author from book 

--31 Find the book Return list

Select * from memberbook where status='Return' 

--32 Frind Reserve List

Select * from reservations;

--33 Find all of reservation with ordering them in acending order by book code

Select * from reservations order by bk_code asc

--33 Find all of reservation with ordering them in acending order by u_id

Select * from reservations order by u_id asc

-- 34.Find allBook category

select * from category

--35. Find allBook bookcategory

select * from bookcategory

--36.Find the users above of 0f  0005

select * from users where u_id > '0005'

--37.Find the users less then  0005

select * from users where u_id < '0005'

--38.Find the users less then  0005

select * from users where u_id between '0005' and '0010'

--39.Find the users of all of users who are borrow Database System Concepts book

Select * from users where u_id=(Select u_id from memberbook where bk_code=(Select bk_code from book where title='Database System Concepts'))

--40 Find all the bookcategory
select * from bookcategory













