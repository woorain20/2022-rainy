create database connectdb;
grant all privileges on connectdb.* to connectuser@'localhost' identified by 'connect123!@#';
-- % - 모든 곳에서 접근 가능하다는 뜻 그러나 보안에 취약하므로 하지 않음
flush privileges;
show databases;
