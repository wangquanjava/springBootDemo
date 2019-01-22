CREATE TABLE `demo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000012 DEFAULT CHARSET=utf8;

INSERT INTO `demo`(`id`, `start_date`) VALUES (1, '2018-07-04 18:09:32');
INSERT INTO `demo`(`id`, `start_date`) VALUES (2, '2018-07-04 19:13:39');
INSERT INTO `demo`(`id`, `start_date`) VALUES (3, '2018-07-04 19:15:26');
INSERT INTO `demo`(`id`, `start_date`) VALUES (4, '2018-07-04 19:21:58');
INSERT INTO `demo`(`id`, `start_date`) VALUES (5, '2018-07-04 19:24:55');
INSERT INTO `demo`(`id`, `start_date`) VALUES (6, '2018-07-04 19:26:55');
INSERT INTO `demo`(`id`, `start_date`) VALUES (7, '2018-07-04 19:30:04');
INSERT INTO `demo`(`id`, `start_date`) VALUES (8, '2018-07-04 19:31:59');