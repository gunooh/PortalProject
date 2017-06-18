#
# TABLE STRUCTURE FOR: reply
#

DROP TABLE IF EXISTS reply;

CREATE TABLE `reply` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `comment` varchar(500) NOT NULL,
  `good` bigint(20) NOT NULL DEFAULT '0',
  `bad` bigint(20) NOT NULL DEFAULT '0',
  `time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO reply (`id`, `name`, `comment`, `good`, `bad`, `time`) VALUES (1, 'nesciunt', 'Cumque ut aut aliquid facilis excepturi vel vero asperiores.', 0, 0, '2017-06-10 15:04:35');
INSERT INTO reply (`id`, `name`, `comment`, `good`, `bad`, `time`) VALUES (2, 'occaecati', 'Veritatis debitis ratione et.', 0, 0, '2017-06-09 10:54:36');
INSERT INTO reply (`id`, `name`, `comment`, `good`, `bad`, `time`) VALUES (3, 'veniam', 'Error quis sint adipisci impedit est omnis dolorum.', 0, 0, '2017-05-21 19:12:50');


#
# TABLE STRUCTURE FOR: user
#

DROP TABLE IF EXISTS user;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userid` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `exp` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO user (`id`, `userid`, `password`, `exp`) VALUES (1, 'est', 'a9b228a1cbf37ed3581907066b0aaefda85a0574', 'Recusandae odit natus aut aut praesentium.');
INSERT INTO user (`id`, `userid`, `password`, `exp`) VALUES (2, 'et', '342948fc22d8853389420ac42c5317f18b3c9522', 'Aut voluptas veniam eaque incidunt.');
INSERT INTO user (`id`, `userid`, `password`, `exp`) VALUES (3, 'quo', 'b774679b266c3247f451919fc3c1ae6e7b6cc083', 'Rerum quia ea perferendis ad ex.');


