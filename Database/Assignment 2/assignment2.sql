insert into Department(department_name) values ('Sale'), ('Marketing'), (N'Bảo vệ'), (N'Nhân sự'), (N'Kỹ thuật');

insert into Position (position_name) values ('Dev'), ('Test'), ('Scrum Master'), ('PM'), ('Manager');
 
insert into Account(email, username, fullname, department_id, position_id, create_date)
values  ('an@gmail.com', 'an', N'An Nguyễn', 1, 1, curdate()),
		('binh@gmail.com', 'binh', N'Bình Trần', 2, 1, curdate()),
        ('chinh@gmail.com', 'chinh', N'Chính Võ', 1, 3, curdate()),
        ('duyen@gmail.com', 'duyen', N'Duyên Nguyễn', 5, 2, curdate()),
        ('vy@gmail.com', 'vy', N'Vy Lê', 3, 2, curdate());
        
insert into `Group`(group_name, creator_id, create_date)
values  ('A', '1', curdate()), 
		('B', '2', curdate()),
        ('C', '3', curdate()),
        ('D', '4', curdate()),
        ('V', '5', curdate());
        
insert into GroupAccount(group_id, account_id, join_date)
values	('1', '5', curdate()), 
		('2', '4', curdate()),
        ('3', '1', curdate()),
        ('4', '3', curdate()),
        ('5', '2', curdate());
        
insert into TypeQuestion(type_name) values ('Essay'), ('Multiple-Choice');

insert into CategoryQuestion(category_name) values ('Java'), ('.NET'), ('SQL'), ('Postman'), ('Ruby');

insert into Question(content, category_id, type_id, creator_id, create_date)
values	('What ?', 1, 2, 1, curdate()),
		('Why ?', 3, 1, 4, curdate()),
        ('How ?', 1, 1, 2, curdate()),
        ('Who ?', 4, 2, 5, curdate()),
        ('Where ?', 2, 1, 1, curdate());
        
insert into Answer(content, question_id, is_correct)
values	('It is...', 1, 0),
		('Because...', 2, 1),
        ('This...', 3, 1),
        ('That one...', 4, 1),
        ('Here...', 5, 0);
        
insert into Exam(code, title, category_id, duration, creator_id, create_date)
values	('Q1', 'Question 1', 1, 90, 1, curdate()),
		('Q2', 'Question 2', 2, 120, 4, curdate()),
        ('Q3', 'Question 3', 3, 150, 2, curdate()),
        ('Q4', 'Question 4', 4, 60, 1, curdate()),
        ('Q5', 'Question 5', 5, 100, 3, curdate());
        
insert into ExamQuestion(exam_id, question_id)
values 	(1, 1),
		(2, 2),
        (3, 3),
        (4, 4),
        (5, 5);