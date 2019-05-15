/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.5.60 : Database - db_2xuanke
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_2xuanke` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_2xuanke`;

/*Table structure for table `t_admin` */

DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `userPw` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `t_admin` */

insert  into `t_admin`(`userId`,`userName`,`userPw`) values (1,'admin','admin'),(16,'123','123');

/*Table structure for table `t_kebiao` */

DROP TABLE IF EXISTS `t_kebiao`;

CREATE TABLE `t_kebiao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kecheng_id` int(11) DEFAULT NULL,
  `shijian` varchar(50) DEFAULT NULL,
  `jieci` varchar(50) DEFAULT NULL,
  `jiaoshi` varchar(50) DEFAULT NULL,
  `laoshi_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

/*Data for the table `t_kebiao` */

insert  into `t_kebiao`(`id`,`kecheng_id`,`shijian`,`jieci`,`jiaoshi`,`laoshi_id`) values (26,3,'星期一','3-4','多媒体教室',9),(27,6,'星期一','1-2','多媒体教室',8),(28,8,'星期一','9-10','多媒体教室',3),(24,2,'星期五','1-2','多媒体教室',2),(25,12,'星期三','5-6','多媒体教室',7),(23,1,'星期三','7-8','多媒体教室',1);

/*Table structure for table `t_kecheng` */

DROP TABLE IF EXISTS `t_kecheng`;

CREATE TABLE `t_kecheng` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bianhao` varchar(50) DEFAULT NULL,
  `mingcheng` varchar(255) DEFAULT NULL,
  `keshi` varchar(50) DEFAULT NULL,
  `del` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `t_kecheng` */

insert  into `t_kecheng`(`id`,`bianhao`,`mingcheng`,`keshi`,`del`) values (1,'C001','C++程序设计基础','40','no'),(2,'C002','C语言程序设计','38','no'),(3,'J001','JSP动态网站开发技术','40','no'),(6,'J002','JAVA程序设计','40',NULL),(8,'P001','Pthyon入门','40',NULL),(9,'M001','数学','40',NULL),(11,'Y001','语文','40',NULL),(12,'L001','历史','50',NULL),(13,'Z001','政治','40',NULL);

/*Table structure for table `t_laoshi` */

DROP TABLE IF EXISTS `t_laoshi`;

CREATE TABLE `t_laoshi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bianhao` varchar(50) DEFAULT NULL,
  `xingming` varchar(50) DEFAULT NULL,
  `xingbie` varchar(50) DEFAULT NULL,
  `nianling` varchar(50) DEFAULT NULL,
  `zhicheng` varchar(50) DEFAULT NULL,
  `loginname` varchar(50) DEFAULT NULL,
  `loginpw` varchar(50) DEFAULT NULL,
  `del` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `t_laoshi` */

insert  into `t_laoshi`(`id`,`bianhao`,`xingming`,`xingbie`,`nianling`,`zhicheng`,`loginname`,`loginpw`,`del`) values (1,'001','文之秀','男','25','教授','001','000000','no'),(2,'002','马老师','男','52','助教','002','000000','no'),(3,'003','张幸福','男','45','讲师','003','000000','no'),(7,'004','张三','男','28','讲师','test','test',NULL),(8,'005','李四','男','28','讲师','005','000000',NULL),(9,'006','王世充','男','28','讲师','wangshichong','123456',NULL);

/*Table structure for table `t_xuesheng` */

DROP TABLE IF EXISTS `t_xuesheng`;

CREATE TABLE `t_xuesheng` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `xuehao` varchar(50) DEFAULT NULL,
  `xingming` varchar(50) DEFAULT NULL,
  `xingbie` varchar(50) DEFAULT NULL,
  `nianling` varchar(50) DEFAULT NULL,
  `banji` varchar(50) DEFAULT NULL,
  `loginname` varchar(50) DEFAULT NULL,
  `loginpw` varchar(50) DEFAULT NULL,
  `del` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `t_xuesheng` */

insert  into `t_xuesheng`(`id`,`xuehao`,`xingming`,`xingbie`,`nianling`,`banji`,`loginname`,`loginpw`,`del`) values (1,'2015001','刘亮','男','21','计算机专业001班','2015001','000000','no'),(2,'2015002','张昂','男','19','计算机专业001班','2015002','000000','no'),(3,'2015003','李斯','男','18','计算机专业001班','2015003','000000','no'),(4,'2015004','张三','男','18','计算机专业001班','2015004','000000',NULL),(5,'2015005','哈哈','男','19','计算机','2015005','000000',NULL),(6,'2015006','花花','女','18','JAVA17-3','huahua','huahua',NULL);

/*Table structure for table `t_xuesheng_kebiao` */

DROP TABLE IF EXISTS `t_xuesheng_kebiao`;

CREATE TABLE `t_xuesheng_kebiao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `xuesheng_id` int(11) DEFAULT NULL,
  `kebiao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

/*Data for the table `t_xuesheng_kebiao` */

insert  into `t_xuesheng_kebiao`(`id`,`xuesheng_id`,`kebiao_id`) values (1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,6,6),(56,1,28),(55,1,26),(54,6,26),(53,6,28),(52,6,23),(51,6,27),(50,6,23),(49,6,25),(48,6,24);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
