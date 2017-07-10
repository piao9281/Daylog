#!DB

// to make a database
	CREATE DATABASE Daylog
	CHARACTER SET utf8 COLLATE utf8_general_ci;

// to create user table

	CREATE TABLE user(
	UserID MEDIUMINT UNSIGNED NOT NULL AUTO_INCREMENT,
	Name VARCHAR(20),
	Login_last_time DATETIME,
	Login_stamp DATETIME,
	PRIMARY KEY (UserID)
	);

// to create post table

	CREATE TABLE post(
	PostID MEDIUMINT UNSIGNED NOT NULL AUTO_INCREMENT,
	Post_userID VARCHAR(2),
	Post_Title VARCHAR(30),
	Post_Content VARCHAR(1500),
	Post_Time DATETIME,
	PRIMARY KEY (PostID)
	);

//to create tag list

	CREATE TABLE tag_list(
	tag_ID MEDIUMINT UNSIGNED NOT NULL AUTO_INCREMENT,
	tag_name VARCHAR(30),
	PRIMARY KEY (tag_ID)
	);

//to create *tag table

	CREATE TABLE *tag(
	Post_Time DATETIME,
	PostID VARCHAR(5)
	);
//To insert test into post table

	INSERT INTO post VALUES ('','1','test Title', 'test content', now());
