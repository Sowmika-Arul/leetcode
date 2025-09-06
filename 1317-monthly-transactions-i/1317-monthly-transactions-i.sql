select DATE_FORMAT(trans_date, '%Y-%m') as month,
country,count(*) as trans_count,
SUM(CASE WHEN state = 'approved' then 1 else 0 end) as approved_count,
SUM(amount) as trans_total_amount, 
sum(CASE WHEN state = 'approved' then amount else 0 end) as approved_total_amount
from Transactions
 group by DATE_FORMAT(trans_date, '%Y-%m'), country; 