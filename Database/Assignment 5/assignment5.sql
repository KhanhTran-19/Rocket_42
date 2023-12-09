#Q1
create view sale_staffs as
	select * from Account
		where department_id = (select id from Department where department_name = 'Sale');
select * from sale_staffs;

#Q2
create view most_members_group as
	select 	rank () over(order by count(Account.id) desc) as rank_no, 
			count(group_id) as number_of_member, 
            Account.* from Account
	join GroupAccount
	on GroupAccount.account_id = Account.id
	group by account_id;
select * from most_members_group where rank_no = 1;

#Q3
create view long_content_questions as 
	select id, content from question
    where length(content) > 300;
-- delete from Question where id in (select id from long_content_questions);

#Q4
create view most_employees_department as
	select 	rank () over(order by count(Account.id) desc) as rank_no, 
			department_name, 
            count(Account.id) as number_of_staff
			from Account
	join Department
	on Account.department_id = Department.id
	group by department_name;
select * from most_employees_department where rank_no = 1;

#Q5
create view question_created_by_nguyen as
	select content as question, fullname as creator from Question
	join Account on creator_id = Account.id
	where fullname like "%Nguyễn%";
select * from question_created_by_nguyen;