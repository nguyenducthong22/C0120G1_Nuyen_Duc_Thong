drop database if exists website;
create database website;
use website;

create table suppliers(
id_suppliers int not null auto_increment primary key,
name varchar(100) not null,
email varchar(50) not null,
phone_number varchar(20),
address varchar(500)
);

create table categories(
id_categories int auto_increment primary key,
name varchar(50) not null,
description varchar(500)
);

create table products(
id_products int auto_increment primary key,
name varchar(50) not null,
image_url varchar(1000) not null,
price decimal(18.2),
discount decimal(18.2),
stock decimal(18),
id_categories int(11),
id_suppliers int(11),
description varchar(1000),
foreign key (id_categories) references categories(id_categories) on delete cascade,
foreign key (id_suppliers) references suppliers(id_suppliers) on delete cascade
);

create table employees(
id_employees int auto_increment primary key,
first_name varchar(50) not null,
last_name varchar(50) not null,
phone_number varchar(20),
address varchar(500) not null,
email varchar(50) not null,
birthday datetime
);

create table customers(
id_customers int auto_increment primary key,
first_name varchar(50) not null,
last_name varchar(50) not null,
phone_number varchar(20),
address varchar(500) not null,
email varchar(50) not null,
birthday date
);

create table orders(
id_orders int auto_increment primary key,
created_date date not null,
shipped_date date,
status varchar(50) not null,
description varchar(1000),
shipping_address varchar(500) not null,
shipping_Oty varchar(50) not null,
payment_type varchar(20) not null,
id_customers int(11),
id_employees int(11),
constraint orders_ibfk1 foreign key (id_customers) references customers(id_customers) on delete cascade,
constraint orders_ibfk2 foreign key (id_employees) references employees(id_employees) on delete cascade
);

create table orderdetails(
id_orderdetails int auto_increment primary key,
id_orders int(11),
id_products int(11),
quantity decimal(18,2),
foreign key (id_orders) references orders(id_orders) on delete cascade,
foreign key (id_products) references products(id_products) on delete cascade
);

insert into suppliers values (1,"Sony","d@.com","0112","so1"),(2,"Sam Sung","t@.com","0113","so2"),(3,"Apple","n@.com","0113","so3"),(4,"bon","?@.com","0114","so4");
insert into categories values (1,"A","a"),(2,"B","b"),(null,"C","c"),(null,"D","d");
insert into products values (1,"Phone","abc",100000,10,1,1,1,"abc"), (null,"Mouse","def",200000,20,2,2,2,"def"), (null,"Laptop","ghi",300000,30,3,3,3,"ghi"),(null,"USB","lmn",400000,6,6,4,4,"lmn");
insert into customers values (1,"Cuong","Pham","0311","hai chau","c@.con","1990-03-25"),(null,"Tien","Tong","0312","pho 2","t@.con","2002-02-02"),(null,"Long","Nguyen","0313","pho 3","l@.con","2003-03-03"),(null,"Binh","Doan","0314","pho 4","b@.con","1990-04-04");
insert into employees values (1,"Hoa","Nguyen","0211","duong 1","h@.con","2001-03-25"),(null,"Tan","Tran","0212","duong 2","t@.con","2002-02-02"),(null,"Hung","Vo","0213","duong 3","h@.con","2003-03-03"),(null,"Co","Co","0214","duong 4","c@.con","2004-04-04");
insert into orders values (1,"2018-01-01","2020-03-25","Complete","A","Ha Noi","A","Cash",1,1),(null,"2020-03-25","2020-03-25","Canced","B","B","B","Creadit card",2,2),(null,"2018-03-03","2020-03-03","Complete","C","C","C","Cash",3,3),(null,"2017-04-04","2020-04-04","Canced","D","D","D","Creadit card",4,4);
insert into orderdetails values (1,1,1,1),(null,2,2,2),(null,3,3,3),(null,4,4,4);

-- Câu 1: Viết câu lệnh UPDATE để cập nhật Price với điều kiện: Các mặt hàng có Price <= 100000 thì tăng thêm 10%
SET SQL_SAFE_UPDATES = 0;
update products set price = (((price*10)/100)+price) where price <=100000;

-- Câu 2: Viết câu lệnh UPDATE để cập nhật DISCOUNT với điều kiện: Các mặt hàng có Discount <= 10% thì tăng thêm 5%
update products set discount = (((discount*5)/100)+discount) where discount <=10;

-- Câu 3: Hiển thị tất cả các mặt hàng có giảm giá <= 10%
select * from products where discount <= 10;

-- Câu 4: Hiển thị tất cả các mặt hàng có tồn kho <= 5
select * from products where stock <= 5;

-- câu 5 : Hiển thị tất cả các khách hàng có địa chỉ ở Quận Hải Châu
select * from customers where address ="hai chau";

-- câu 6: Hiển thị tất cả các khách hàng có năm sinh 1990
 select * from customers where year(birthday)=1990;
 
-- câu 7: Hiển thị tất cả các khách hàng có sinh nhật là hôm nay
select*from customers where day(birthday)=25 and month(birthday)=03;

-- câu 8: Hiển thị tất cả các đơn hàng có trạng thái là COMPLETED
select*from orders where status ="Complete";

-- câu 9: Hiển thị tất cả các đơn hàng có trạng thái là COMPLETED trong ngày hôm nay
select*from orders where (status ="Complete" and year(shipped_date)=2020 and month(shipped_date)=03 and day(shipped_date)=25);

-- câu 10: Hiển thị tất cả các đơn hàng có trạng thái là CANCELED
select*from orders where status ="Canced";

-- câu 11: Hiển thị tất cả các đơn hàng có hình thức thanh toán là CASH
select*from orders where payment_type ="Cash";

-- câu 12: Hiển thị tất cả các đơn hàng có hình thức thanh toán là CREADIT CARD
select*from orders where payment_type ="Creadit card";

-- câu 13: Hiển thị tất cả các đơn hàng có địa chỉ giao hàng là Hà Nội
select*from orders where shipping_address ="Ha Noi";

-- câu 14: Hiển thị tất cả các nhân viên có sinh nhật là hôm nay
select * from employees where month(now())=month(birthday) and day(now())=day(birthday);

-- câu 15: Hiển thị tất cả các nhà cung cấp có tên là: (SONY, SAMSUNG, TOSHIBA, APPLE)
select* from suppliers where name = "Sony" or name = "Sam Sung" or name = "Apple" or name = "Toshiba" ;

-- câu 16: Hiển thị tất cả các mặt hàng cùng với CategoryName
 select products.name,categories.name as "categories name" from products join categories 
 where categories.id_categories=products.id_categories;

-- câu 17: Hiển thị tất cả các đơn hàng cùng với thông tin chi tiết khách hàng (Customer)
 select * from customers inner join  orders on customers.id_customers=orders.id_customers;

-- câu 18: Hiển thị tất cả các mặt hàng cùng với thông tin chi tiết của Category và Supplier
 select * from products inner join categories on products.id_categories=categories.id_categories inner join suppliers on products.id_suppliers=suppliers.id_suppliers;


-- câu 19: Hiển thị tất cả danh mục (Categories) với số lượng hàng hóa trong mỗi danh mục(Viết 2 cách) (edited) 
-- 	Em chưa hiểu để lắm

-- câu 20: Hiển thị tất cả nhà cung cấp (Suppliers) với số lượng hàng hóa mỗi nhà cung cấp(Viết 2 cách)
-- 	Em chưa hiểu để lắm

-- câu 21: Hiển thị tất cả các mặt hàng được bán trong khoảng từ ngày, đến ngày(Khoảng cách ngày các bạn tuỳ chọn theo data phù hợp với mỗi người) (edited) 
select products.id_products,products.name,products.image_url,products.price from products join orderdetails on products.id_products=orderdetails.id_products
join orders on orders.id_orders= orderdetails.id_orders where created_date between "2019-01-01"and "2020-12-31";

-- câu 22: Hiển thị tất cả các khách hàng mua hàng trong khoảng từ ngày, đến ngày((Khoảng cách ngày các bạn tuỳ chọn theo data phù hợp với mỗi người)) (edited) 
select * from  customers join orderdetails on customers.id_customers=orderdetails.id_orderdetails 
join orders on orders.id_orders=orderdetails.id_orderdetails where created_date between "2019-01-01"and "2020-12-31";

-- Câu 23: Hiển thị tất cả các khách hàng mua hàng (với tổng số tiền) trong khoảng từ ngày, đến ngày(viêt bằng 2 cách, ngày tuỳ chọn )
select customers.first_name,customers.last_name,products.name as "name products ",sum(price) as TongTien from  customers join orderdetails on customers.id_customers=orderdetails.id_orderdetails 
join orders on orders.id_orders=orderdetails.id_orderdetails 
join products on products.id_products= orderdetails.id_products
where created_date between "2019-01-01"and "2020-12-31";

-- câu 24: Hiển thị tất cả đơn hàng với tổng số tiền
select products.id_products, products.name as "name products ",products.image_url,products.image_url,sum(price) as TongTien from  customers join orderdetails on customers.id_customers=orderdetails.id_orderdetails 
join orders on orders.id_orders=orderdetails.id_orderdetails 
join products on products.id_products= orderdetails.id_products;

-- câu 25: Hiển thị tất cả các nhân viên bán hàng với tổng số tiền bán được

select employees.first_name,employees.last_name,sum(price) from employees
join orders on employees.id_employees=orders.id_employees
join orderdetails on orderdetails.id_orders=orders.id_orders
join products on orderdetails.id_products=products.id_products 
