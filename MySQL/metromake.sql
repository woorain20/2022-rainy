create database metro;
grant all privileges on metro.* to metrouse@'localhost' identified by 'metro11';
-- % - 모든 곳에서 접근 가능하다는 뜻 그러나 보안에 취약하므로 하지 않음
flush privileges;
show databases;