create table EMPLOYEES (
	id INT,
	firstName VARCHAR(50),
	lastName VARCHAR(50),
	email VARCHAR(50),
	password VARCHAR(50),
	isBoss VARCHAR(50),
	bossId INT
);
/
create table REIMBURSMENT (
	id INT,
	amount INT,
	description VARCHAR(50),
	status VARCHAR(50),
	eId INT
);

insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (1, 'Jorry', 'Anthiftle', 'janthiftle0@e-recht24.de', 'JBuOehRc0S', 'false', 95);
insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (2, 'Laney', 'Leithgoe', 'lleithgoe1@newsvine.com', 'dzcYSy2', 'true', 1);
insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (3, 'Dreddy', 'Hawgood', 'dhawgood2@edublogs.org', 'YVeG65RmH', 'false', 1);
insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (4, 'Augy', 'Quernel', 'aquernel3@wufoo.com', '9DOWFadTr', 'true', 1);
insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (5, 'Sauncho', 'Scoffham', 'sscoffham4@dailymotion.com', 'c4JVO1f', 'true', 1);
insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (6, 'Olav', 'Maun', 'omaun5@yahoo.co.jp', 'hXmCId6', 'false', 1);
insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (7, 'Ariadne', 'Pinxton', 'apinxton6@usnews.com', 'qxQk1kHrqqk', 'false', 1);
insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (8, 'Berkly', 'Warmisham', 'bwarmisham7@nyu.edu', '0WsudOPfxNiR', 'false', 1);
insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (9, 'Devonne', 'Itzik', 'ditzik8@irs.gov', 'wkMvGlMx', 'false', 1);
insert into EMPLOYEES (id, firstName, lastName, email, password, isBoss, bossId) values (10, 'Jeanelle', 'Giacopini', 'jgiacopini9@earthlink.net', 'PCvXO70fR6O', 'false', 1);


insert into REIMBURSMENT (id, amount, description, status, eId) values (1, 334, 'nunc vestibulum ante', 'tortor', 1);
insert into REIMBURSMENT (id, amount, description, status, eId) values (2, 778, 'leo rhoncus sed vestibulum', 'et', 2);
insert into REIMBURSMENT (id, amount, description, status, eId) values (3, 842, 'integer ac leo pellentesque', 'convallis', 3);
insert into REIMBURSMENT (id, amount, description, status, eId) values (4, 821, 'aliquet at feugiat', 'non', 4);
insert into REIMBURSMENT (id, amount, description, status, eId) values (5, 988, 'luctus cum sociis', 'ridiculus', 5);
insert into REIMBURSMENT (id, amount, description, status, eId) values (6, 190, 'ligula vehicula', 'iaculis', 6);
insert into REIMBURSMENT (id, amount, description, status, eId) values (7, 362, 'nisi volutpat eleifend ', 'lorem', 7);
insert into REIMBURSMENT (id, amount, description, status, eId) values (8, 692, 'quam pharetra magna', 'sapien', 8);
insert into REIMBURSMENT (id, amount, description, status, eId) values (9, 776, 'lorem id ligula', 'sed', 9);
insert into REIMBURSMENT (id, amount, description, status, eId) values (10, 604, 'magna at nunc commodo', 'libero', 10);


alter table REIMBURSMENT add constraint pk_reim primary key(id);
alter table EMPLOYEES add constraint pk_emp primary key(id);
alter table REIMBURSMENT add constraint fk_id foreign key(eId) references EMPLOYEES(id);