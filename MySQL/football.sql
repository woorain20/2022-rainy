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
CREATE SCHEMA IF NOT EXISTS `footballdb` DEFAULT CHARACTER SET utf8 ;
USE `footballdb` ;

-- -----------------------------------------------------
-- Table `mydb`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `footballdb`.`team` (
  `idteam` INT NOT NULL,
  `team` VARCHAR(45) NULL,
  `nation` VARCHAR(45) NULL,
  `league` VARCHAR(45) NULL,
  `foundation` INT NULL,
  `hometown` VARCHAR(45) NULL,
  `stadium` VARCHAR(45) NULL,
  `headcoach` VARCHAR(45) NULL,
  PRIMARY KEY (`idteam`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`league`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `footballdb`.`league` (
  `idleague` INT NOT NULL,
  `league` VARCHAR(45) NULL,
  `nation` VARCHAR(45) NULL,
  `found` INT NULL,
  PRIMARY KEY (`idleague`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`team_record`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `footballdb`.`team_record` (
  `idteam_record` INT NOT NULL,
  `team` VARCHAR(45) NULL,
  `league_win` INT NULL,
  `facup_win` INT NULL,
  `eucup_win` INT NULL,
  `max_wpoint` INT NULL,
  `max_goal` INT NULL,
  `max_losegoal` INT NULL,
  `max_outingp` VARCHAR(45) NULL,
  `max_goalp` VARCHAR(45) NULL,
  PRIMARY KEY (`idteam_record`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `footballdb`.`player` (
  `idplayer` INT NOT NULL,
  `player` VARCHAR(45) NULL,
  `team` VARCHAR(45) NULL,
  `nation` VARCHAR(45) NULL,
  `backnum` INT NULL,
  `birthyear` INT NULL,
  `position` VARCHAR(45) NULL,
  PRIMARY KEY (`idplayer`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
