--1.Update Authenticator Type
UPDATE authenticator set type='Librarian' where  a_id ='0012'

--2.Update Users Information

UPDATE users  set a_id='0014',fname='shamima',lname='Islam',phone='+88328923897',dateofbirth='1998-12-25',addres='Magura,dhaka',pasword='1234',picture='C:\Users\ASUS\OneDrive\Documents\NetBeansProjects\LiabraryManagementSystem\src\Profilepic\p1.jpg',gender='Female'  where  u_id ='0012';

--3.Update Publisher address

UPDATE publisher  set address='Bangladesh' where  pub_id ='0005'


--4.Update  Book details

UPDATE book set bk_code='0006',title='Operating system',pub_id='0004', price='110',numofcopy='10',isbn='"+isbn+"',picture='C:\Users\ASUS\OneDrive\Documents\NetBeansProjects\LiabraryManagementSystem\src\book picture\5.jpg',author='McGraw-Hill Education' where bk_code='0006' 

--5.Update Membership

UPDATE membercard set u_id='0012',issue_date='2021-01-06',exp_date='2022-01-06' where  card_no ='0009' 

 --6.Update Category

 
 UPDATE category set cat_name='Oprerating System 2nd Edition',rent_rate='15',daily_fine='3' where  cat_id ='0004'
 
 --7.Update  book bookcategory
 
 UPDATE bookcategory set cat_id='0005',bk_code='0006'where cat_id ='0004' and bk_code='0006'
 
 --8.Rerturn Book
 
 update memberbook set  status='Return',retrn_date='2021-02-05' where bk_code ='0004' and u_id ='0005'