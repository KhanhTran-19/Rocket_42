#Q1 + Q2
insert into Department(department_name) values (N'Tài chính'), (N'Quản lý'), (N'Giám đốc'), (N'Sản xuất'), (N'Thiết kế');
select * from Department;

insert into Position (position_name) values ('Staff'), (N'Thư ký'), ('CEO'), ('Leader'), (N'Bảo vệ'), ('Tester'), (N'Kế toán'), ('HR'), ('Sale'), ('Designer');
select * from Position;

insert into Account(email, username, fullname, department_id, position_id, create_date)
values  ('anh@gmail.com', 'anh', N'Anh Võ', 1, 1, curdate()),
		('bao@gmail.com', 'bao', N'Bảo Trần', 2, 1, curdate()),
        ('gia@gmail.com', 'gia', N'Gia Lê', 1, 3, curdate()),
        ('thu@gmail.com', 'thu', N'Thư Nguyễn', 5, 2, curdate()),
        ('minh@gmail.com', 'minh', N'Minh Nguyễn', 3, 2, curdate()),
        ('an1@gmail.com', 'an1', N'An Trần', 1, 1, curdate()),
		('nhi@gmail.com', 'nhi', N'Nhi Lê', 2, 1, curdate()),
        ('tien@gmail.com', 'tien', N'Tiến Võ', 1, 3, curdate()),
        ('tien1@gmail.com', 'tien1', N'Tiên Nguyễn', 5, 2, curdate()),
        ('nga@gmail.com', 'nga', N'Nga Lê', 3, 2, curdate());
select * from Account;

select * from `Group`;

insert into GroupAccount(group_id, account_id, join_date)
values	('1', '6', curdate()), 
		('1', '7', curdate()),
        ('4', '8', curdate()),
        ('2', '9', curdate()),
        ('3', '10', curdate()),
        ('1', '11', curdate()), 
		('5', '12', curdate()),
        ('4', '13', curdate()),
        ('3', '14', curdate()),
        ('3', '15', curdate());
select * from GroupAccount;

select * from TypeQuestion;

insert into CategoryQuestion(category_name) values ('C/C++'), ('Go'), ('MongoDB'), ('Wordpress'), ('C#'), ('JavaScript'), ('HTML'), ('CSS'), ('Python'), ('PHP');
select * from CategoryQuestion;

insert into Question(content, category_id, type_id, creator_id, create_date)
values	('When ?', 1, 2, 1, curdate()),
		('Which ?', 3, 1, 4, curdate()),
        ('Can ?', 1, 1, 2, curdate()),
        ('What ?', 1, 2, 1, curdate()),
		('Why ?', 3, 1, 4, curdate()),
        ('How ?', 1, 1, 2, curdate()),
        ('Who ?', 4, 2, 5, curdate()),
        ('Where ?', 2, 1, 1, curdate()),
        ('When ?', 1, 2, 1, curdate()),
		('Which ?', 3, 1, 4, curdate());
select * from Question;
        
insert into Answer(content, question_id, is_correct)
values	('At...', 1, 0),
		('This...', 2, 1),
        ('I can...', 3, 1),
        ('It is...', 1, 0),
		('Because...', 2, 1),
        ('This...', 3, 1),
        ('That one...', 4, 1),
        ('Here...', 5, 0),
        ('At...', 1, 0),
		('This...', 2, 1);
select * from Answer;
        
insert into Exam(code, title, category_id, duration, creator_id, create_date)
values	('Q6', 'Question 6', 7, 90, 9, curdate()),
		('Q7', 'Question 7', 2, 120, 8, curdate()),
        ('Q8', 'Question 8', 9, 150, 5, curdate()),
        ('Q9', 'Question 9', 5, 60, 2, curdate()),
        ('Q10', 'Question 10', 3, 100, 6, curdate()),
        ('Q11', 'Question 11', 11, 90, 12, curdate()),
		('Q12', 'Question 12', 9, 120, 1, curdate()),
        ('Q13', 'Question 13', 1, 150, 7, curdate()),
        ('Q14', 'Question 14', 15, 60, 13, curdate()),
        ('Q15', 'Question 15', 8, 100, 14, curdate());
select * from Exam;
        
insert into ExamQuestion(exam_id, question_id)
values 	(6, 6),
		(7, 7),
        (8, 8),
        (9, 9),
        (10, 10),
        (11, 11),
		(12, 12),
        (13, 13),
        (14, 14),
        (15, 15);
select * from ExamQuestion;

#Q3
select id from department where department_name = 'Sale';

#Q4
select * from account 
where length(fullname) = (select max(length(fullname)) from account);

#Q5
select * from account 
where department_id = 3 
and length(fullname) = (
	select max(length(fullname)) 
    from account 
    where department_id = 3
    );
    
#Q6
select group_name
from `Group` join GroupAccount on `Group`.id = GroupAccount.group_id
where GroupAccount.join_date < '2019-12-20';

#Q7
select Question.id
from Question join Answer on Question.id = Answer.question_id
group by Question.id
having count(answer.id) >= 4;

#Q8
select code from Exam
where duration >= 60 and created_date < '2019-12-20';

#Q9
select * from `Group` 
order by create_date desc limit 5;

#Q10
select count(*) from Account where department_id = 2; 

#Q11
select * from Account where fullname like 'D%o';

#Q12
delete from Exam where create_date < '2019-12-20'; 

#Q13
delete from Question where content like 'Câu hỏi%';

#Q14
update Account 
set fullname = 'Nguyễn Bá Lộc', email = 'loc.nguyenba@vti.com.vn'
where id = 5;

#Q15
update Account set group_id = 4 where id = 5;
