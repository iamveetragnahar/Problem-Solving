# Write your MySQL query statement below
select a.name from employee a
cross join employee b
on a.id=b.managerId
group by b.managerId
having count(*)>=5