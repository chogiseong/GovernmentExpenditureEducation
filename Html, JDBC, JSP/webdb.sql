create table guestbook(
    no number,
    name varchar2(80),
    password varchar2(20),
    content varchar2(2000),
    reg_date date,
    primary key (no)
    );

create sequence seq_guestbook_no
increment by 1
start with 1;

insert into guestbook
values(seq_guestbook_no.nextval,
    '조기성',
    '0000',
    '게스트북프로젝트진행',
    '1997-05-20');

commit;

select * from guestbook;