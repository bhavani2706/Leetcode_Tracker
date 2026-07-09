-- Last updated: 09/07/2026, 09:49:48
SELECT p.firstname,p.lastname,city,state
FROM Person p
LEFT JOIN Address a ON p.personid = a.personid;
