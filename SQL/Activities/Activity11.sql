select salesman_name, salesman_id from salesman where salesman_id in (select salesman_id FROM orders group by salesman_id HAVING count(*)>1) UNION select customer_name, customer_id from customers where customer_id in (select customer_id FROM orders group by customer_id HAVING count(*)>1) ;

select s.salesman_name,s.salesman_id , o.order_date, 'highest on', o.purchase_amount from salesman s, orders o where s.salesman_id = o.salesman_id and o.purchase_amount in (select max(purchase_amount) from orders  group by salesman_id)
UNION
select s.salesman_name,s.salesman_id , o.order_date, 'lowest on', o.purchase_amount from salesman s, orders o where s.salesman_id = o.salesman_id and o.purchase_amount in (select min(purchase_amount) from orders  group by salesman_id)