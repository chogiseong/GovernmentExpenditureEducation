create table studyboard(
      study_fileno number,
      study_title varchar2(100),
      study_content varchar2(1000),
      study_fileName varchar2(100),
      study_date date,
      PRIMARY KEY(study_fileno)
);

create sequence seq_studyboard
start with 1
increment by 1;

insert into studyboard values(seq_studyboard.nextval, '�����׽�Ʈ', '�����׽�Ʈ', '�����̸��׽�Ʈ', sysdate);

select * from studyboard;

commit;
SELECT study_id, study_title, study_content, study_filename,
					to_char(study_date, 'YYYY"��" MM"��" DD"��"')					
FROM studyboard;

drop table studyboard;
drop sequence seq_studyboard;

select * from studyboard;
insert into StudyBoard values(seq_studyboard.nextval, '�׽�Ʈ����', '�׽�Ʈ����', '�׽�Ʈ����', sysdate);
insert into StudyBoard values(seq_studyboard.nextval, '�׽�Ʈ����', '�׽�Ʈ����', '�� ����.zip', sysdate);

commit;