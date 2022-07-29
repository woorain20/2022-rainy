-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`player` (
  `idplayer` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `backnumber` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  `nation` VARCHAR(45) NULL,
  `birthyear` INT NULL,
  PRIMARY KEY (`idplayer`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`team` (
  `idteam` INT NOT NULL,
  `team` VARCHAR(45) NULL,
  `team_abb` VARCHAR(45) NULL,
  `foundation` INT NULL,
  `hometown` VARCHAR(45) NULL,
  `league` VARCHAR(45) NULL,
  `stadium` VARCHAR(45) NULL,
  `headcoach` VARCHAR(45) NULL,
  PRIMARY KEY (`idteam`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`league`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`league` (
  `idleague` INT NOT NULL,
  `leaguename` VARCHAR(45) NULL,
  `nation` VARCHAR(45) NULL,
  PRIMARY KEY (`idleague`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`league_record`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`league_record` (
  `idleague_record` INT NOT NULL,
  `winner` VARCHAR(45) NULL,
  `max_win` VARCHAR(45) NULL,
  `max_lose` VARCHAR(45) NULL,
  `min_lose` VARCHAR(45) NULL,
  `max_goal` VARCHAR(45) NULL,
  `min_goal` VARCHAR(45) NULL,
  `min_losegoal` VARCHAR(45) NULL,
  PRIMARY KEY (`idleague_record`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`player_record`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`player_record` (
  `idplayer_record` INT NOT NULL,
  `player_name` VARCHAR(45) NULL,
  `play` INT NULL,
  `goal` INT NULL,
  `assist` INT NULL,
  `lose_goal` INT NULL,
  `yellow` INT NULL,
  `red` INT NULL,
  PRIMARY KEY (`idplayer_record`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`team_reord`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`team_reord` (
  `idteam_reord` INT NOT NULL,
  `team_name` VARCHAR(45) NULL,
  `goal` INT NULL,
  `lose_goal` INT NULL,
  `point` INT NULL,
  `maxgoal_pl` VARCHAR(45) NULL,
  `maxass_pl` VARCHAR(45) NULL,
  PRIMARY KEY (`idteam_reord`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


-- data

-- league
insert into league values('EPL','잉글랜드');
insert into league values('La Liga', '스페인');
insert into league values('Serie A', '이탈리아');
insert into league values('Bundesliga', '독일');
insert into league values('League 1', '프랑스');
insert into league values('Eredivisie', '네덜란드');
insert into league values('Primeira Liga', '포르투갈');

-- team
insert into team values('아스날','ARS', 1886, '런던', 'EPL', '에미레이트 스타디움', '미켈 아르테타');
insert into team values('리버풀','LIV', 1892, '리버풀', 'EPL', '안필드', '위르겐 클롭');
insert into team values('첼시','CHE', 1905, '런던', 'EPL', '스탬퍼드 브릿지', '토마스 투헬');
insert into team values('맨체스터 유나이티드','MUN', 1878, '맨체스터', 'EPL', '올드 트래포드', '에릭 텐하흐');
insert into team values('맨체스터 시티','MCI', 1894, '맨체스터', 'EPL', '에티하드 스타디움', '펩 과르디올라');
insert into team values('에버튼','EVE', 1878, '리버풀', 'EPL', '구디슨 파크', '프랭크 램파드');
insert into team values('울버햄튼','WOL', 1877, '울버햄튼', 'EPL', '몰리뉴 스타디움', '코너 코디');
insert into team values('뉴캐슬','NEW', 1892, '뉴캐슬', 'EPL', '세인트 제임스 파크', '에디 하우');
insert into team values('레스터 시티','LEI', 1884, '레스터', 'EPL', '킹 파워 스타디움', '브렌던 로저스');
insert into team values('본머스','BOU', 1899, '본머스', 'EPL', '바이탈리티 스타디움', '스콧 파커');
insert into team values('리즈 유나이티드','LEE', 1919, '리즈', 'EPL', '엘런드 로드', '제시 마치');
insert into team values('노팅엄 포레스트','NFO', 1865, '노팅엄', 'EPL', '더 시티 그라운드', '스티브 쿠퍼');
insert into team values('브라이튼','BHA', 1901, '브라이튼 앤 호븐', 'EPL', '아메리칸 익스프레스 커뮤니티 스타디움', '그레이엄 포터');
insert into team values('사우스햄튼','SOU', 1885, '사우스햄튼', 'EPL', '세인트 메리즈 스타디움', '랄프 하젠휘틀');
insert into team values('웨스트햄','WHU', 1895, '런던', 'EPL', '런던 스타디움', '데이비드 모예스');
insert into team values('아스톤빌라','AVL', 1874, '버밍엄', 'EPL', '빌라 파크', '스티븐 제라드');
insert into team values('크리스탈 팰리스','CRY', 1905, '런던', 'EPL', '셀허스트 파크', '파트리크 비에이라');
insert into team values('풀럼','FUL', 1879, '풀럼', 'EPL', '크레이븐 코티지', '마르코 실바');
insert into team values('브렌트포드','BRE', 1889, '런던', 'EPL', '브렌트포드 커뮤니티 스타디움', '토마스 프랑크');
insert into team values('토트넘','TOT', 1882, '런던', 'EPL', '토트넘 핫스퍼 스타디움', '안토니오 콘테');
insert into team values('레알 마드리드','RMA', 1902, '마드리드', 'La Liga', '산티아고 베르나베우', '카를로 안첼로티');
insert into team values('바르셀로나','BAR', 1899, '바르셀로나', 'La Liga', '캄 노우', '차비 에르난데스');
insert into team values('발렌시아','VAL', 1919, '발렌시아', 'La Liga', '에스타디오 데 메스타야', '젠나로 가투소');
insert into team values('AT마드리드','ATM', 1903, '마드리드', 'La Liga', '시티바스 메트로폴리타노', '디에고 시메오네');
insert into team values('비야레알','VIL', 1923, '비야레알', 'La Liga', '에스타디오 데 라 세라미카', '우나이 에메리');
insert into team values('세비야','VRC', 1890, '세비야', 'La Liga', '에스타디오 라몬 산체스 피스후안', '줄렌 로페테기');
insert into team values('AC밀란','MIL', 1899, '밀라노', 'Serie A', '주세페 메아자', '스테파노 파울리');
insert into team values('인테르','INT', 1908, '밀라노', 'Serie A', '주세페 메아자', '시모네 인자기');
insert into team values('유벤투스','JUV', 1897, '토리노', 'Serie A', '알리안츠 스타디움', '마시밀리아노 알레그리');
insert into team values('라치오','LAZ', 1900, '로마', 'Serie A', '스타디오 올림피코', '마우리치오 사리');
insert into team values('피오렌티나','FIO', 1926, '피렌체', 'Serie A', '스타디오 아르테미오 프랑키', '빈첸초 이탈리아노');
insert into team values('로마','ROM', 1927, '로마', 'Serie A', '스타디오 올림피코', '주제 무리뉴');
insert into team values('나폴리','NAP', 1926, '나폴리', 'Serie A', '스타디오 디에고 아르만도 마라도나', '루치아노 스팔레티');
insert into team values('바이에른 뮌헨','FCB', 1900, '바이에른','Bundesliga', '알리안츠 아레나', '율리안 나겔스만');
insert into team values('보루시아 도르트문트','BVB', 1909, '도르트문트','Bundesliga', '지그날 이두나 파크', '에딘 테르지치');
insert into team values('RB 라이프치히','RBL', 2009, '라이프치히','Bundesliga', '레드불 아레나', '도메니코 테데스코');
insert into team values('바이에른 레버쿠젠','LEV', 1904, '레버쿠젠','Bundesliga', '바이아레나', '헤라르도 세오아네');
insert into team values('SC 프라이부르크','SCF', 1904, '프라이부르크','Bundesliga', '유로파 파크 슈타디온', '크리스티안 슈트라이히');
insert into team values('파리 생제르맹','PSG', 1970, '파리','League 1', '파르크 데 프랭스', '크리스토프 갈티에');
insert into team values('올림피크 리옹','OL', 1950, '리옹','League 1', '그루파마 스타디움', '페터르 보츠');
insert into team values('AS 모나코','ASM', 1924, '모나코','League 1', '스타드 루이 2세', '필리프 클레망');
insert into team values('올림피크 마르세유','IOM', 1899, '마르세유','League 1', '오렌지 벨로드롬', '이고르 투도르');
insert into team values('스타드 렌','SRF', 1901, '렌','League 1', '로아존 파르크', '브뤼노 제네시오');
insert into team values('아약스','AJX', 1900, '암스테르담','Eredivisie', '요한 크루이프 아레나', '알프레드 스뢰더르');
insert into team values('PSV','PSV', 1913, '에인트호번','Eredivisie', '필립스 스타디온', '뤼트 판 니스텔로이');
insert into team values('AZ 알크마르','AZ', 1967, '알크마르','Eredivisie', 'AFAS 스타디온', '파스칼 얀센');
insert into team values('페예노르트','FR', 1908, '로테르담','Eredivisie', '스타디온 페예노르트', '아르네 슬롯');
insert into team values('포르투','FPT', 1893, '포르투','Primeira Liga', '이스타디우 두 드라강', '세르지우 콘세이상');
insert into team values('스포르팅 리스본','SCP', 1906, '리스본','Primeira Liga', '이스타디우 주제 알발라드', '후벵 아모링');
insert into team values('브라가','SCB', 1921, '브라가','Primeira Liga', '이스타디우 무니시팔 드 브라가', '아르투르 조르즈');
insert into team values('벤피카','SBF', 1904, '리스본','Primeira Liga', '이스타디우 다 루스', '로저 슈미트');

-- player
insert into player values('베른트 레노', 1, 'GK', '독일', 1992, '아스날');
insert into player values('윌리엄 살리바', 2, 'DF', '프랑스', 2001, '아스날');
insert into player values('키어런 티어니', 3, 'DF', '스코틀랜드', 1997, '아스날');
insert into player values('벤 화이트', 4, 'DF', '잉글랜드', 1997, '아스날');
insert into player values('토마스 파티', 5, 'MF', '가나', 1993, '아스날');
insert into player values('가브리엘 마갈량이스', 6, 'DF', '브라질', 1997, '아스날');
insert into player values('부카요 사카', 7, 'FW', '잉글랜드', 2001, '아스날');
insert into player values('마틴 외데고르', 8, 'MF', '노르웨이', 1998, '아스날');
insert into player values('가브리엘 제수스', 9, 'FW', '브라질', 1997, '아스날');
insert into player values('에밀 스미스로우', 10, 'MF', '잉글랜드', 2000, '아스날');
insert into player values('가브리엘 마르티넬리', 11, 'FW', '브라질', 2001, '아스날');
insert into player values('에디 은케티아', 14, 'FW', '가나', 1999, '아스날');
insert into player values('롭 홀딩', 16, 'DF', '잉글랜드', 1995, '아스날');
insert into player values('세드릭 소아레스', 17, 'DF', '포르투갈', 1991, '아스날');
insert into player values('도미야스 다케히로', 18, 'DF', '일본', 1998, '아스날');
insert into player values('니콜라 페페', 19, 'FW', '코트디부아르', 1995, '아스날');
insert into player values('누노 타바레스', 20, 'DF', '포르투갈', 2000, '아스날');
insert into player values('파비우 비에이라', 21, 'MF', '포르투갈', 2000, '아스날');
insert into player values('삼비 로콩가', 23, 'MF', '벨기에', 1999, '아스날');
insert into player values('모하메드 엘네니', 25, 'MF', '이집트', 1992, '아스날');
insert into player values('플로린 발로군', 26, 'FW', '잉글랜드', 2001, '아스날');
insert into player values('마르키뉴스', 27, 'FW', '브라질', 2003, '아스날');
insert into player values('멧 터너', 30, 'GK', '미국', 1994, '아스날');
insert into player values('아론 램스데일', 32, 'GK', '잉글랜드', 1998, '아스날');
insert into player values('아서 오콩고', 33, 'GK', '잉글랜드', 2001, '아스날');
insert into player values('그라니트 자카', 34, 'MF', '스위스', 1992, '아스날');
insert into player values('올렉산드로 진첸코', 35, 'DF', '우크라이나', 1996, '아스날');
insert into player values('찰리 파티노', 87, 'MF', '잉글랜드', 2003, '아스날');

insert into player values('알리송 베커', 1, 'GK', '브라질', 1992, '리버풀');
insert into player values('알리송 베커', 1, 'GK', '브라질', 1992, '리버풀');


