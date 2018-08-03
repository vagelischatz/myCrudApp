-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema crud
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema crud
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `crud` DEFAULT CHARACTER SET utf8 ;
USE `crud` ;

-- -----------------------------------------------------
-- Table `crud`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crud`.`user` (
  `userid` INT(4) NOT NULL,
  `email` VARCHAR(120) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `enabled` INT(4) NOT NULL,
  `register_date` DATETIME NOT NULL,
  PRIMARY KEY (`userid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `crud`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crud`.`category` (
  `categoryid` INT(4) NOT NULL,
  `title` VARCHAR(250) NOT NULL,
  `category_type` INT(2) NOT NULL,
  `customer_id` INT(4) NOT NULL,
  PRIMARY KEY (`categoryid`),
  INDEX `customerid_idx` (`customer_id` ASC),
  CONSTRAINT `customerid`
    FOREIGN KEY (`categoryid`)
    REFERENCES `crud`.`user` (`userid`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `crud`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crud`.`role` (
  `roleid` INT(4) NOT NULL,
  `title` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`roleid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `crud`.`user_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crud`.`user_role` (
  `user_id` INT(4) NOT NULL,
  `role_id` INT(4) NOT NULL,
  INDEX `userd_idx` (`user_id` ASC),
  INDEX `role_id_idx` (`role_id` ASC),
  CONSTRAINT `role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `crud`.`role` (`roleid`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `crud`.`user` (`userid`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
