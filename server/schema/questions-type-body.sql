create table questions (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    question_title VARCHAR(100) NOT NULL,
    question_type INT NOT NULL, 
    question_channel INT,  
    single_q_ID AS (CASE WHEN [question_type] = '1' THEN [question_channel] ELSE NULL END) PERSISTED REFERENCES single (single_q_ID),
    multiple_q_ID AS  (CASE WHEN [question_type] = '2' THEN [question_channel] ELSE NULL END) PERSISTED REFERENCES multiple ( multiple_q_ID),
    open_q_ID AS  (CASE WHEN [question_type] = '3' THEN [question_channel] ELSE NULL END) PERSISTED REFERENCES open_ended (open_q_ID),
);

create table single(
    single_q_ID BIGSERIAL NOT NULL PRIMARY KEY,
    question_content BIGINT REFERNCES single (id) NOT NULL,
    question_option VARCHAR(100) NOT NULL,
    question_score INTEGER NOT NULL,
    question_answer VARCHAR(100) NOT NULL,
);

create table multiple(
     multiple_q_ID BIGSERIAL NOT NULL PRIMARY KEY,
    question_content BIGINT REFERNCES single (id) NOT NULL,
    question_option VARCHAR(100) NOT NULL,
    question_score INTEGER NOT NULL,
    question_answer VARCHAR(100) NOT NULL,
);

create table open_ended(
    open_q_ID BIGSERIAL NOT NULL PRIMARY KEY,
    question_content BIGINT REFERNCES single (id) NOT NULL,
    question_option VARCHAR(100) NOT NULL,
    question_score INTEGER NOT NULL,
    question_answer VARCHAR(100) NOT NULL,
);
   