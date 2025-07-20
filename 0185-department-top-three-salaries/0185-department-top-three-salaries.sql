with RankedSalaries as(
    select d.name as Department, e.name as Employee, e.salary as Salary,
    DENSE_RANK() OVER(
        PARTITION BY e.departmentId
        order by e.salary desc
    ) AS salary_rank
    from Employee e join Department d on e.departmentId = d.id 
)

select Department, Employee, Salary from RankedSalaries where salary_rank <= 3;