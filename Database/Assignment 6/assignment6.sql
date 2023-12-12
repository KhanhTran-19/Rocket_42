#Q1
DELIMITER $$
create procedure GetAccountsByDepartmentName(in department_name VARCHAR(50))
begin
    select * from Account
    join Department on Account.department_id = Department.id
    where Department.department_name = department_name;
end $$
DELIMITER ;
call GetAccountsByDepartmentName('Marketing');

#Q2
DELIMITER $$
create procedure AccountNumberInGroup (in account_id varchar(50))
begin 
	select `Group`.id, group_name, count(account_id) as account_number
	from GroupAccount join `Group`
    	on GroupAccount.group_id = `Group`.id
	group by group_id;
end $$
DELIMITER ;
call AccountNumberInGroup('group_id');
