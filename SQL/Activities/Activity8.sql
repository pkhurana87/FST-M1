select customer_id, max(PURCHASE_AMOUNT) from orders group by customer_id;

select salesman_id,max(PURCHASE_AMOUNT),order_date from orders  group by salesman_id,order_date having order_date = TO_DATE('2012/08/17', 'YYYY/MM/DD');

select customer_id,max(PURCHASE_AMOUNT),order_date from orders  group by customer_id,order_date having max(PURCHASE_AMOUNT) in (2030, 3450, 5760, 6000);