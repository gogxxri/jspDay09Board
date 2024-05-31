drop table if exists board;


CREATE TABLE BOARD (
    anum INT PRIMARY KEY AUTO_INCREMENT, -- 기본 키, 자동 증가
    author VARCHAR(100) NOT NULL, -- 작성자, 비어 있을 수 없음
    email VARCHAR(200) NOT NULL, -- 이메일, 비어 있을 수 없음
    title VARCHAR(500) NOT NULL, -- 제목, 비어 있을 수 없음
    content VARCHAR(4000), -- 내용
    passwd VARCHAR(12), -- 비밀번호
    writeday DATE DEFAULT CURRENT_DATE, -- 기본 입력 값이 현재 날짜
    readcnt INT DEFAULT 0, -- 기본 입력 값이 0
    rep_root INT DEFAULT 0, -- 답글 루트
    rep_step INT DEFAULT 0, -- 답글 단계
    rep_indent INT DEFAULT 0 -- 답글 들여쓰기
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