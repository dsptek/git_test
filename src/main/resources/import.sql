INSERT INTO USER (ID, USER_ID, PASSWORD, NAME, EMAIL) VALUES (1, 'javajigi', 'test', '홍길동', 'javajigi@com.com');
INSERT INTO USER (ID, USER_ID, PASSWORD, NAME, EMAIL) VALUES (2, 'sanjigi', 'test', '홍길녀', 'sanjigi@com.com');


INSERT INTO QUESTION (ID, WRITER_ID, TITLE, CONTENTS, CREATE_DATE ) VALUES (1, 1, '국내에서 Ruby on Rails', '이 글만으로는 원인 파악하기 힘들겠다.', CURRENT_TIMESTAMP());
INSERT INTO QUESTION (ID, WRITER_ID, TITLE, CONTENTS, CREATE_DATE ) VALUES (2, 2, 'Play가 활성화되기 힘든 이유는 뭘까?', '소스 코드와 설정을 단순화해서 공유해 주면 같이 디버깅해줄 수도 있겠다.', CURRENT_TIMESTAMP());

