select c.customer_id from Customer c join Product p on p.product_key = c.product_key 
group by customer_id having count(Distinct p.product_key) = (select count(*) from Product);