-- MySQL Script generated by MySQL Workbench
-- Thu Dec  7 16:14:18 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema projetdd
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema projetdd
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `projetdd` DEFAULT CHARACTER SET utf8 ;
USE `projetdd` ;

-- -----------------------------------------------------
-- Table `projetdd`.`hero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projetdd`.`hero` (
                                                 `id` INT NOT NULL AUTO_INCREMENT,
                                                 `name` VARCHAR(45) NULL,
    `type` VARCHAR(45) NULL,
    `life` INT NULL,
    `strength` INT NULL,
    `position` INT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projetdd`.`board`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projetdd`.`board` (
                                                  `id` INT NOT NULL AUTO_INCREMENT,
                                                  `board` JSON NULL,
                                                  PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projetdd`.`sauvegarde`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projetdd`.`sauvegarde` (
                                                       `id` INT NOT NULL AUTO_INCREMENT,
                                                       `hero_id` INT NOT NULL,
                                                       `board_id` INT NOT NULL,
                                                       PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    INDEX `fk_sauvegarde_hero_idx` (`hero_id` ASC) VISIBLE,
    INDEX `fk_sauvegarde_board1_idx` (`board_id` ASC) VISIBLE,
    CONSTRAINT `fk_sauvegarde_hero`
    FOREIGN KEY (`hero_id`)
    REFERENCES `projetdd`.`hero` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_sauvegarde_board1`
    FOREIGN KEY (`board_id`)
    REFERENCES `projetdd`.`board` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
