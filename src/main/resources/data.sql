USE `mydb` ;

INSERT INTO `mydb`.`users` (`id`, `name`) VALUES
(1, 'Alice'),
(2, 'Bob'),
(3, 'Carol'),
(4, 'Dave'),
(5, 'Eve')
;

INSERT INTO `mydb`.`articles` (`id`, `user_id`, `title`) VALUES
(1, 1, 'Article 1'),
(2, 2, 'Article 2')
;

INSERT INTO `mydb`.`likes` (`article_id`, `user_id`) VALUES
(1, 2),
(1, 3),
(1, 4),
(2, 3),
(2, 4)
;
