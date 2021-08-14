select * from orders where salesman_id = (select salesman_id from orders where customer_id = 3007);

select * from orders where salesman_id = (select salesman_id from salesman where SALESMAN_CITY = 'New York');

select grade, count(*) from customers where grade > (select avg(grade) from customers where CITY = 'New York') group by grade;

select * from orders where SALESMAN_ID = (select SALESMAN_ID from salesman  where COMMISSION = (select max(COMMISSION) from salesman));