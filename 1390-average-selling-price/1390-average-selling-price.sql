select P.product_id, COALESCE(round(sum(P.price * U.units) / sum(U.units), 2), 0) as average_price from Prices P left join UnitsSold U on P.product_id = U.product_id
AND U.purchase_date BETWEEN P.start_date AND P.end_date
group by P.product_id;