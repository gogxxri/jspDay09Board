drop table if exists board;


CREATE TABLE BOARD (
    anum INT PRIMARY KEY AUTO_INCREMENT, 
    author VARCHAR(100) NOT NULL, 
    email VARCHAR(200) NOT NULL, 
    title VARCHAR(500) NOT NULL, 
    content VARCHAR(4000), 
    passwd VARCHAR(12), 
    writeday DATE DEFAULT CURRENT_DATE, 
    readcnt INT DEFAULT 0, 
    rep_root INT DEFAULT 0, 
    rep_step INT DEFAULT 0, 
    rep_indent INT DEFAULT 0 
);


-- author, email, title, content, passwd 외에
-- default로 설정 된 필드는 기본값으로 사용
INSERT INTO BOARD(author, email, title, content, passwd)
Values('test', 'test@test.com', 'test title', 'test content', '12345');

INSERT INTO BOARD(author, email, title, content, passwd)
Values('test2', 'test2@test.com', 'test title2', 'test content2', '11111');

UPDATE BOARD 
SET readcnt = (SELECT readcnt FROM BOARD WHERE anum = 2) + 1 
WHERE anum = 2;

UPDATE BOARD 
SET author='HONG', email='hong@test.com', title='홍길동이 쓴 글' 
WHERE anum=2;

select * from board;

commit;