# Write your MySQL query statement below
select p.firstname as firstName,
p.lastname as lastName,
a.city as city,
a.state as state
from Person p
left join address a on 
p.personid = a.personid;
