SELECT * FROM MEMBER;

--로그인 SQL : client가 전송한 id와 password가 일치하는 회원이 존재하면 그 회원정보를 조회, 일치하지 않으면 조회결과 없음
--아이디와 패스워드가 일치 : 로그인 ok
SELECT name,address FROM MEMBER WHERE ID = 'java' AND password='abcd';
--패스워드가 일치하지 않을 경우 : 로그인 실패 -> 조회행이 나오지 않는다 resultset next 이용하기
SELECT name,address FROM MEMBER WHERE ID = 'java' AND password='1';
--아이디가 없는 경우 : 로그인 실패 -> 조회행이 나오지 않는다 resultset next 이용하기
SELECT name,address FROM MEMBER WHERE ID = 'cbaaa' AND password='1';


--주소로 회원정보 조회
SELECT id,name FROM MEMBER WHERE address='오리';


UPDATE MEMBER SET PASSWORD='a', name='강하늘', address='판교' WHERE ID="spring";


INSERT INTO MEMBER(ID,PASSWORD,NAME,ADDRESS) VALUES('kia','a','K5','군산');



--아이디 존재 유무를 판단
SELECT COUNT(*) FROM member WHERE id='java';


