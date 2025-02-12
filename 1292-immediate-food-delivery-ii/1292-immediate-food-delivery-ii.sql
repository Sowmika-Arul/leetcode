WITH Firstorder as 
(
select delivery_id, customer_id, order_date, customer_pref_delivery_date from Delivery where (customer_id, order_date) in 
(select customer_id, MIN(order_date) 
from Delivery 
GROUP BY(customer_id))
)
select ROUND(100.0 * sum(case when order_date= customer_pref_delivery_date THEN 1 ELSE 0 END)/count(*),2) AS immediate_percentage fROM Firstorder;