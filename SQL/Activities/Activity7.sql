select sum(PURCHASE_AMOUNT) as total_amount from orders;

select avg(PURCHASE_AMOUNT) as average_amount from orders;

select max(PURCHASE_AMOUNT) as max_amount from orders;

select min(PURCHASE_AMOUNT) as min_amount from orders;

select count(distinct SALESMAN_ID) as total_salesman from orders;