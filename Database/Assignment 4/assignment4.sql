#Q1
select fullname, department_name from Account
join Department on Account.department_id = Department.id;

#Q2
select * from Account where create_date > '2010-12-20';

#Q3
select fullname from Account 
join Position on Account.position_id = Position.id
where Position.position_name = 'Dev';

#Q4
select Department.id, department_name from Department
join Account on Department.id = Account.department_id
group by Department.id
having count(Account.id) > 3;

#Q5
select Question.id, Question.content from Question 
join ExamQuestion on Question.id = ExamQuestion.question_id
group by Question.id 
order by count(ExamQuestion.exam_id) desc;

#Q6
select CategoryQuestion.id, category_name, count(Question.id) as number_of_question from CategoryQuestion
join Question on CategoryQuestion.id = Question.category_id
group by CategoryQuestion.id
order by number_of_question desc;

#Q7
select Question.id, Question.content, count(ExamQuestion.exam_id) as number_of_exam from Question
join ExamQuestion on Question.id = ExamQuestion.question_id
group by Question.id
order by count(ExamQuestion.exam_id) desc;

#Q8
select Question.id, Question.content from Question
join Answer on Question.id = Answer.question_id
group by Question.id
order by count(Answer.question_id) desc limit 1;

#Q9
select `Group`.id, group_name, count(GroupAccount.account_id) as number_of_account from `Group`
join GroupAccount on `Group`.id = GroupAccount.group_id
group by `Group`.id
order by number_of_account desc;

#Q10
select Position.id, position_name, count(Account.position_id) as number_of_employee from Position 
join Account on Position.id = Account.position_id
group by Position.id
order by number_of_employee asc limit 1;

#Q11
select department_name, position_name, count(Account.id) as number_of_employee from Department
join Account on Department.id = Account.department_id
join Position on Account.position_id = Position.id
group by Department.id, Position.id;
