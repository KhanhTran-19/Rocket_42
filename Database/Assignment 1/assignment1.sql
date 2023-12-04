create database if not exists Testing_System;
use Testing_System;

create table Department (
	id int auto_increment primary key,
    department_name nvarchar(50)
);

create table Position (
	id int auto_increment primary key,
    position_name nvarchar(50)
);

create table Account (
	id int auto_increment primary key,
    email nvarchar(50),
    username nvarchar(50),
    fullname nvarchar(50),
    department_id int,
    position_id int,
    create_date date,
    foreign key (department_id) references Department(id),
    foreign key (position_id) references Position (id)
);

create table `Group` (
	id int auto_increment primary key,
    group_name nvarchar(50),
    creator_id int,
    create_date date,
    foreign key (creator_id)references Account (id)
);

create table GroupAccount (
	group_id int,
    account_id int,
    join_date date,
    primary key (group_id, account_id),
    foreign key (group_id) references `Group`(id),
    foreign key (account_id) references Account (id)
);
    
create table TypeQuestion (
	id int auto_increment primary key,
    type_name enum ('Essay', 'Multiple-Choice')
);

create table CategoryQuestion (
	id int auto_increment primary key,
    category_name nvarchar(50)
);

create table Question (
	id int auto_increment primary key,
    content text,
    category_id int,
    type_id int,
    creator_id int,
    create_date date,
    foreign key (category_id) references CategoryQuestion(id),
    foreign key (type_id) references TypeQuestion(id),
    foreign key (creator_id) references Account (id)
);

create table Answer (
	id int auto_increment primary key,
    content text,
    question_id int,
    is_correct bool,
    foreign key (question_id) references Question(id)
);

create table Exam (
	id int auto_increment primary key,
    code nvarchar(50),
    title nvarchar(50),
    category_id int,
    duration int,
    creator_id int,
    create_date date,
    foreign key (category_id) references CategoryQuestion(id),
    foreign key (creator_id) references Account (id)
);

create table ExamQuestion (
	exam_id int,
    question_id int,
    primary key (exam_id, question_id),
    foreign key (exam_id) references Exam(id),
    foreign key (question_id) references Question(id)
);
    