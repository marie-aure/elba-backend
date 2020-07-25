INSERT INTO `db_example`.`classe` (`id`,`libelle`) VALUES (1,'Illégitime');
INSERT INTO `db_example`.`classe` (`id`,`libelle`) VALUES (2,'Paysan');
INSERT INTO `db_example`.`classe` (`id`,`libelle`) VALUES (3,'Pauvre');
INSERT INTO `db_example`.`classe` (`id`,`libelle`) VALUES (4,'Modeste');
INSERT INTO `db_example`.`classe` (`id`,`libelle`) VALUES (5,'Aisée');
INSERT INTO `db_example`.`classe` (`id`,`libelle`) VALUES (6,'Riche');
INSERT INTO `db_example`.`classe` (`id`,`libelle`) VALUES (7,'Noblesse');


UPDATE `db_example`.`classe` SET `classe_sup_id`='3' WHERE `id`='2';
UPDATE `db_example`.`classe` SET `classe_sup_id`='4' WHERE `id`='3';
UPDATE `db_example`.`classe` SET `classe_sup_id`='5' WHERE `id`='4';
UPDATE `db_example`.`classe` SET `classe_sup_id`='6' WHERE `id`='5';
UPDATE `db_example`.`classe` SET `classe_sup_id`='7' WHERE `id`='6';
