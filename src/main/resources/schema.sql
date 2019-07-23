CREATE SCHEMA IF NOT EXISTS `mydb`;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`articles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`articles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `title` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_articles_users1_idx` (`user_id` ASC),
  CONSTRAINT `fk_articles_users1`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `mydb`.`likes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`likes` (
  `article_id` INT NULL,
  `user_id` INT NULL,
  INDEX `fk_likes_articles_idx` (`article_id` ASC),
  INDEX `fk_likes_users1_idx` (`user_id` ASC),
  PRIMARY KEY (`article_id`, `user_id`),
  CONSTRAINT `fk_likes_articles`
    FOREIGN KEY (`article_id`)
    REFERENCES `mydb`.`articles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_likes_users1`
    FOREIGN KEY (`user_id`)
    REFERENCES `mydb`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
