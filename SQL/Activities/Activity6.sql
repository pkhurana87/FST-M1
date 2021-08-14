select * from orders;

select distinct SALESMAN_ID from orders;

select order_no,order_date from orders order by order_date;

select order_no,PURCHASE_AMOUNT from orders order by PURCHASE_AMOUNT desc;

select * from orders where PURCHASE_AMOUNT < 500;

select * from orders  where PURCHASE_AMOUNT between 1000 and 2000;