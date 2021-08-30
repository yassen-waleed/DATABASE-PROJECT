create database project ; 
use project;



CREATE TABLE Employee(
 employee_id int(1) NOT NULL AUTO_INCREMENT,
 month_salary float   ,
 first_name varchar(32),
 Last_name  varchar(32),
 phone_num  varchar(32),
 firstwork_date date,
 endwork_date date,
 primary key (employee_id)
 );
 
 select * from Employee;
 
 
 
 CREATE TABLE Manger(
 manger_username  varchar(100),
 manger_passwd varchar(100),
 employee_id  int not null REFERENCES Employee(employee_id) ON delete cascade,
 primary key (employee_id)
 
 );
 
 
 
 
  CREATE TABLE Delivery_guy (
 delivery_num int ,
 employee_id  int not null REFERENCES Employee(employee_id) ON delete cascade,
 primary key (employee_id)
 
 );
 Alter table Delivery_guy
 add passwd int not null ;

 
 
 
    CREATE TABLE cheff (
   spcilty  varchar(32) ,
   cheff_num int ,
   employee_id  int not null REFERENCES Employee(employee_id) ON delete cascade,
   primary key (employee_id)
 );
 
 
 
 
 
 
   CREATE TABLE Car  (
Car_id int(1) auto_increment   primary key ,
car_outlays varchar(40),
 employee_id int NOT NULL,
 FOREIGN KEY (employee_id) references Delivery_guy(employee_id)

 );




CREATE TABLE Customer(
 
  customer_id int(1) NOT NULL AUTO_INCREMENT,
  first_name varchar(32),
  Last_name varchar(32),
  city varchar(32) ,
  street varchar(32) ,
  house_num int ,
  phonenumber int ,

 primary key (customer_id)
 );
 SELECT COUNT(*)
FROM customer;
ALTER TABLE customer
MODIFY COLUMN phonenumber varchar(32);
 
 
 
 
 


   CREATE TABLE Bill   (
Bill_id int(1) auto_increment   primary key ,
Total_price  double ,
 employee_id int NOT NULL,
 customer_id int not Null,
 FOREIGN KEY (employee_id) references delivery_guy(employee_id),
 FOREIGN KEY (customer_id) references customer(customer_id)

 );
 

 

 
 
 
 
 
CREATE TABLE orders(
  order_id int(1)  NOT NULL AUTO_INCREMENT,
  customer_id int NOT NULL,
  delivery_id int NOT NULL,
  status1 char(30) ,
  dilevared_time varchar(32),
  order_time varchar(32),
  primary key (order_id),
  foreign key (customer_id) references Customer(customer_id),
  foreign key (delivery_id) references delivery_guy(employee_id)
 );
 
 alter table orders
 add delivery_date varchar (32);
 
 
CREATE TABLE Finalize (
order_id int not null ,
cheff_id int NOT NULL,
 foreign key (order_id) references orders(order_id),
 foreign key (cheff_id) references cheff(employee_id)
);







CREATE TABLE Meal(
 meal_id int(1)  NOT NULL AUTO_INCREMENT,
 NumOfMeals  int ,
 price float,
 mealtype varchar(50),
 primary key (meal_id)
 
 );
 ALTER TABLE Meal
  ADD  Category varchar(32);



  create table order2meal(
 order_id int not null ,
 meal_id int not null ,
 
 FOREIGN KEY (order_id) references orders(order_id),
 FOREIGN KEY (meal_id) references Meal(meal_id));
 
 
 Alter table order2meal
 add quantity int Not null;
 
 

 
 CREATE TABLE Ingredints(
  ingredints_id int(1)  NOT NULL AUTO_INCREMENT,
  price float,
  ingredint_name varchar(32),
  quntity int ,
 PRIMARY KEY(ingredints_id)

 );

 create table meal_has_ingredint(
 meal_id int not null,
 ingredint_id int not null,
 FOREIGN key (ingredint_id) REFERENCES Ingredints(ingredints_id),
 FOREIGN key (meal_id) REFERENCES Meal(meal_id)
 );
  create table cheff_use_ingredint(
 cheff_id int not null,
  ingredint_id int not null,
  FOREIGN key (cheff_id) REFERENCES cheff(employee_id),
  FOREIGN key (ingredint_id) REFERENCES Ingredints(Ingredints_id)
 );
 
 


INSERT INTO  employee (month_salary,first_name,Last_name,phone_num,firstwork_date,endwork_date) 
VALUES (2800.0,"ahmad","hussan","056847843","2017-1-1","2021-1-1"),


	   (2500.0,"qasem","khaled","0568478741","2017-1-1","2021-1-1"),
       
       
	   (2500.0,"amer","walid","0568478412","2017-1-1","2021-1-1"),
       
       
       (2500.0,"yassen","walid","0568478569","2017-1-1","2021-1-1"),
       
       
       (1500,"malik","mohammad","0568222222","2015-1-1","2023-1-1"),
       
       
       (3000.0,"abd","salam","0568111123","2014-1-1","2022-5-3"),
       
       
       (3600.0,"mohammad","Hussan","0568114561","2017-1-4","2020-1-1"),
       
       
       (4000.0,"yazzed","kareem","0568178954","2017-1-4","2022-1-7");



    INSERT INTO  manger (manger_username,manger_passwd,employee_id)
    
    values("yassen_waleed ","password",4);
    
    
    
    insert Into Delivery_guy 
    values (1,1,'1234'),
    
    
           (2,2,'1234'),
           
           
           (3,3,'1234');
           
           
            INSERT INTO  cheff (spcilty,cheff_num,employee_id)
    values("Main dishes",1,5),
    
    
          ("Main dishes",2,6),
          
          
          ("Entrees",3,7),
          
          
          ("drinks",4,8);
INSERT INTO project.`car` (Car_id, car_outlays, employee_id) VALUES ('1', '30000', '1');



INSERT INTO project.`car` (Car_id, car_outlays, employee_id) VALUES ('2', '30000', '2');



INSERT INTO project.`car` (Car_id, car_outlays, employee_id) VALUES ('3', '30000', '3');



INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('1', '1', '99.99', 'Zarb');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('2', '1', '29.99', 'msakhan');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('3', '1', '49.99', 'makloba');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('4', '1', '39.99', 'kdra');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('5', '1', '69.99', 'dwali');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('6', '1', '39.99', 'koba');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('7', '1', '5', 'malfof');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('8', '1', '5', 'normal');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('9', '1', '5', 'turkish');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('10', '1', '5', 'cocakola');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('11', '1', '5', 'sprite');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('12', '1', '5', 'fanta');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('13', '1', '6', 'Schweppes');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('14', '1', '6', 'cappy');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('15', '1', '4', 'smallcappy');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('16', '1', '3.5', 'smallcocakola');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('17', '1', '3.5', 'smallsprite');


INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('18', '1', '3.5', 'smallfanta');

   
   
   INSERT INTO project.`meal` (meal_id, NumOfMeals, price, mealtype) VALUES ('19', '1', '79.99', 'zarb chicken');
   
   
   
   INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('1', '70', 'Meat', '200');
   
   
INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('2', '12', 'chickens', '400');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('3', '5', 'Onions', '30');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('4', '4', 'garlic', '200');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('5', '9', 'groats', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('6', '11', 'butter', '45');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('7', '400', 'oil', '20');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('8', '5', 'salt', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('9', '100', 'rice ', '20');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('10', '10', 'potato', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('11', '20', 'yogurt', '30');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('12', '10', 'cauliflower', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('13', '10', 'Aubergine', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('14', '10', 'almonds', '500');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('15', '10', 'tomato', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('16', '10', 'Option', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('17', '40', 'boiled chickpeas', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('18', '70', 'pine', '200');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('19', '10', 'cabbage', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('20', '1', 'parsley', '200');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('30', '30', 'cocacola', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('29', '30', 'sprit', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('23', '30', 'fanta', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('24', '25', 'schweppes', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('25', '31', 'cappy', '100');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('26', '24', 'small_cocacola', '150');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('27', '24', 'small_sprit', '150');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('28', '24', 'small_fanta', '150');


INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('21', '50', 'warq 3nb', '10');

INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('22', '5', 'Bread shrakes', '70');

INSERT INTO project.`ingredints` (ingredints_id, price, ingredint_name, quntity) VALUES ('31', '10', 'Lemon', '100');
 
 
 INSERT INTO `project`.`meal` (`NumOfMeals`, `price`, `mealtype`, `Category`) VALUES ('1', '20', 'pancake', 'Dessert');
INSERT INTO `project`.`meal` (`NumOfMeals`, `price`, `mealtype`, `Category`) VALUES ('1', '20', 'cake', 'Dessert');
UPDATE `project`.`meal` SET `Category` = 'food' WHERE (`meal_id` = '3');
UPDATE `project`.`meal` SET `Category` = 'food' WHERE (`meal_id` = '4');
UPDATE `project`.`meal` SET `Category` = 'food' WHERE (`meal_id` = '5');
UPDATE `project`.`meal` SET `Category` = 'food' WHERE (`meal_id` = '6');
UPDATE `project`.`meal` SET `Category` = 'salad' WHERE (`meal_id` = '7');
UPDATE `project`.`meal` SET `Category` = 'salad' WHERE (`meal_id` = '8');
UPDATE `project`.`meal` SET `Category` = 'salad' WHERE (`meal_id` = '9');
UPDATE `project`.`meal` SET `Category` = 'drink' WHERE (`meal_id` = '10');
UPDATE `project`.`meal` SET `Category` = 'drink' WHERE (`meal_id` = '18');
UPDATE `project`.`meal` SET `Category` = 'drink' WHERE (`meal_id` = '17');
UPDATE `project`.`meal` SET `Category` = 'drink' WHERE (`meal_id` = '16');
UPDATE `project`.`meal` SET `Category` = 'drink' WHERE (`meal_id` = '15');
UPDATE `project`.`meal` SET `Category` = 'drink' WHERE (`meal_id` = '14');
UPDATE `project`.`meal` SET `Category` = 'drink' WHERE (`meal_id` = '13');
UPDATE `project`.`meal` SET `Category` = 'drink' WHERE (`meal_id` = '12');
UPDATE `project`.`meal` SET `Category` = 'drink' WHERE (`meal_id` = '11');
UPDATE `project`.`meal` SET `Category` = 'food' WHERE (`meal_id` = '19');

 

UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '20');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '21');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '22');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '23');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '24');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '25');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '26');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '27');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '28');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '29');
UPDATE project.`meal` SET NumOfMeals = '1' WHERE (meal_id = '30');

INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '39.99', 'Qidra','food');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '39.99', 'Kabsa','food');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '39.99', 'Dawali & kosa','food');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '39.99', 'Sheshbarq','food');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '59.99', 'Mashawi mshkal','food');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '15', 'Kunafa','Dessert');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '15', 'Qatayef','Dessert');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '15', 'Cannoli','Dessert');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '18', 'Red velvet','Dessert');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '18', 'Rain Bow','Dessert');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '16', 'Nuttella','Dessert');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '18', 'Baked cheseCake','Dessert');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '32', 'Fattoush','Salad');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '32', 'Greek salad','Salad');

 INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '79.99', 'Zarb meal(meat)','food');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '59.99', 'Zarb meal(Chicken)','food');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ('1', '39.99', 'Mansaf','food');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '32', 'Caser salad','Salad');
INSERT INTO project.meal ( NumOfMeals, price, mealtype,Category) VALUES ( '1', '32', 'Tabouleh Halabia','Salad');
 
 
 
 
 UPDATE project.`meal` SET mealtype = 'Zarb (meat)', Category = 'food' WHERE (meal_id = '1');
UPDATE project.`meal` SET mealtype = 'Zarb(chicken)', Category = 'food' WHERE (meal_id = '2');
INSERT INTO `project`.`meal` (`NumOfMeals`, `price`, `mealtype`, `Category`) VALUES ('1', '20', 'pancake', 'desert');
INSERT INTO `project`.`meal` (`NumOfMeals`, `price`, `mealtype`, `Category`) VALUES ('1', '25', 'cheesecake', 'desert');

 UPDATE `project`.`meal` SET `Category` = 'Dessert' WHERE (`meal_id` = '21');
UPDATE `project`.`meal` SET `Category` = 'Dessert' WHERE (`meal_id` = '20');




SELECT * FROM meal_has_ingredint;
ALTER TABLE meal_has_ingredint
ADD  quantity int ;
SELECT * FROM finalize;
SELECT finalize.cheff_id, COUNT(order_id) FROM finalize GROUP BY cheff_id ORDER BY COUNT(order_id) DESC limit 1;
SELECT * FROM Meal;
SELECT * FROM customer;
SELECT * FROM bill;
SELECT * FROM Employee;
SELECT * FROM ingredints;
SELECT * FROM manger;
SELECT * FROM Orders;
SELECT * FROM meal;
SELECT * FROM delivery_guy;

show tables;