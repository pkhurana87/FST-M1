select c.CUSTOMER_NAME, s.SALESMAN_NAME from customers c, salesman s where c.SALESMAN_ID = s.SALESMAN_ID;

select c.CUSTOMER_NAME, s.SALESMAN_NAME, C.GRADE from customers c, salesman s where c.SALESMAN_ID = s.SALESMAN_ID AND  GRADE < 300 ORDER BY CUSTOMER_ID;

select c.CUSTOMER_NAME, s.SALESMAN_NAME, s.COMMISSION from customers c, salesman s where c.SALESMAN_ID = s.SALESMAN_ID AND s.COMMISSION > 12 ORDER BY COMMISSION;

select o.order_no, o.order_date, o.purchase_amount, c.CUSTOMER_NAME, s.SALESMAN_NAME, s.COMMISSION from orders  o,customers c, salesman s where o.CUSTOMER_id = c.CUSTOMER_id  and  c.SALESMAN_ID = s.SALESMAN_ID;