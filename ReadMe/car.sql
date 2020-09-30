/*
Navicat MySQL Data Transfer

Source Server         : movie
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : travel

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2020-09-30 10:01:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `car_id` int(11) NOT NULL AUTO_INCREMENT,
  `car_num` int(11) DEFAULT NULL,
  `car_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES ('1', '1399', '1');
INSERT INTO `car` VALUES ('2', '525', '0');
INSERT INTO `car` VALUES ('3', '52525', '0');

-- ----------------------------
-- Table structure for hotel
-- ----------------------------
DROP TABLE IF EXISTS `hotel`;
CREATE TABLE `hotel` (
  `hotel_id` int(11) NOT NULL AUTO_INCREMENT,
  `hotel_name` varchar(255) DEFAULT NULL,
  `hotel_cost` int(11) DEFAULT NULL,
  `scenery_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`hotel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel
-- ----------------------------
INSERT INTO `hotel` VALUES ('1', '都江堰大酒店', '498', '1');
INSERT INTO `hotel` VALUES ('2', '都江堰宾馆', '298', '1');
INSERT INTO `hotel` VALUES ('3', '熊猫基地大酒店', '498', '2');
INSERT INTO `hotel` VALUES ('4', '熊猫基地宾馆', '298', '2');
INSERT INTO `hotel` VALUES ('5', '青城山大酒店', '498', '3');
INSERT INTO `hotel` VALUES ('6', '青城山宾馆', '298', '3');
INSERT INTO `hotel` VALUES ('7', '宽窄巷子大酒店', '498', '4');
INSERT INTO `hotel` VALUES ('8', '宽窄巷子宾馆', '298', '4');
INSERT INTO `hotel` VALUES ('9', '锦里大酒店', '498', '5');
INSERT INTO `hotel` VALUES ('10', '锦里宾馆宾馆', '298', '5');
INSERT INTO `hotel` VALUES ('11', '杜甫草堂大酒店', '498', '6');
INSERT INTO `hotel` VALUES ('12', '杜甫草堂宾馆', '298', '6');
INSERT INTO `hotel` VALUES ('13', '春熙路大酒店', '498', '7');
INSERT INTO `hotel` VALUES ('14', '春熙路宾馆', '298', '7');
INSERT INTO `hotel` VALUES ('15', '文殊院大酒店', '498', '8');
INSERT INTO `hotel` VALUES ('16', '文殊院宾馆', '298', '8');
INSERT INTO `hotel` VALUES ('17', '西岭雪山大酒店', '498', '9');
INSERT INTO `hotel` VALUES ('18', '西岭雪山宾馆', '298', '9');
INSERT INTO `hotel` VALUES ('19', '黄龙溪大酒店', '498', '10');
INSERT INTO `hotel` VALUES ('20', '黄龙溪宾馆', '298', '10');
INSERT INTO `hotel` VALUES ('21', '青羊宫大酒店', '498', '11');
INSERT INTO `hotel` VALUES ('22', '青羊宫宾馆', '298', '11');
INSERT INTO `hotel` VALUES ('23', '花舞人间大酒店', '498', '12');
INSERT INTO `hotel` VALUES ('24', '花舞人间宾馆', '298', '12');
INSERT INTO `hotel` VALUES ('25', '国色天乡大酒店', '498', '13');
INSERT INTO `hotel` VALUES ('26', '国色天乡宾馆', '298', '13');
INSERT INTO `hotel` VALUES ('27', '成都欢乐谷大酒店', '498', '14');
INSERT INTO `hotel` VALUES ('28', '成都欢乐谷宾馆', '298', '14');
INSERT INTO `hotel` VALUES ('29', '成都海昌极地海洋世界大酒店', '498', '15');
INSERT INTO `hotel` VALUES ('30', '成都海昌极地海洋世界宾馆', '298', '15');
INSERT INTO `hotel` VALUES ('31', '成都动物园大酒店', '498', '16');
INSERT INTO `hotel` VALUES ('32', '成都动物园宾馆', '298', '16');
INSERT INTO `hotel` VALUES ('33', '安仁古镇大酒店', '498', '17');
INSERT INTO `hotel` VALUES ('34', '安仁古镇宾馆', '298', '17');
INSERT INTO `hotel` VALUES ('35', '刘氏庄园大酒店', '498', '18');
INSERT INTO `hotel` VALUES ('36', '刘氏庄园宾馆', '298', '18');
INSERT INTO `hotel` VALUES ('37', '观音湖大酒店', '498', '19');
INSERT INTO `hotel` VALUES ('38', '观音湖宾馆', '298', '19');
INSERT INTO `hotel` VALUES ('39', '隆昌石牌坊旅游区大酒店', '498', '20');
INSERT INTO `hotel` VALUES ('40', '隆昌石牌坊旅游区宾馆', '298', '20');
INSERT INTO `hotel` VALUES ('41', '达州达县真佛山大酒店', '498', '21');
INSERT INTO `hotel` VALUES ('42', '达州达县真佛山宾馆', '298', '21');
INSERT INTO `hotel` VALUES ('43', '华蓥山黄花梨大酒店', '498', '22');
INSERT INTO `hotel` VALUES ('44', '华蓥山黄花梨宾馆', '298', '22');
INSERT INTO `hotel` VALUES ('45', '自贡井天池寺大酒店', '498', '23');
INSERT INTO `hotel` VALUES ('46', '自贡井天池寺宾馆', '298', '23');
INSERT INTO `hotel` VALUES ('47', '巴灵台大酒店', '498', '24');
INSERT INTO `hotel` VALUES ('48', '巴灵台宾馆', '298', '24');
INSERT INTO `hotel` VALUES ('49', '雅安杜鹃山大酒店', '498', '25');
INSERT INTO `hotel` VALUES ('50', '雅安杜鹃山宾馆', '298', '25');
INSERT INTO `hotel` VALUES ('51', '二滩水电站大酒店', '498', '26');
INSERT INTO `hotel` VALUES ('52', '二滩水电站宾馆', '298', '26');
INSERT INTO `hotel` VALUES ('53', '瓦屋山漂流大酒店', '498', '27');
INSERT INTO `hotel` VALUES ('54', '瓦屋山漂流宾馆', '298', '27');
INSERT INTO `hotel` VALUES ('55', '段家大院子大酒店', '498', '28');
INSERT INTO `hotel` VALUES ('56', '段家大院子宾馆', '298', '28');
INSERT INTO `hotel` VALUES ('57', '优乐小镇双语职业体验馆大酒店', '498', '29');
INSERT INTO `hotel` VALUES ('58', '优乐小镇双语职业体验馆宾馆', '298', '29');
INSERT INTO `hotel` VALUES ('59', '禹迹山大佛风景区大酒店', '498', '30');
INSERT INTO `hotel` VALUES ('60', '禹迹山大佛风景区宾馆', '298', '30');
INSERT INTO `hotel` VALUES ('61', '绵阳罗浮山漂流大酒店', '498', '31');
INSERT INTO `hotel` VALUES ('62', '绵阳罗浮山漂流宾馆', '298', '31');
INSERT INTO `hotel` VALUES ('63', '九寨沟日则沟大酒店', '498', '32');
INSERT INTO `hotel` VALUES ('64', '九寨沟日则沟宾馆', '298', '32');
INSERT INTO `hotel` VALUES ('65', '七里坪华生温泉酒店大酒店', '498', '33');
INSERT INTO `hotel` VALUES ('66', '七里坪华生温泉酒店宾馆', '298', '33');
INSERT INTO `hotel` VALUES ('67', '锦里结义搂大戏台大酒店', '498', '34');
INSERT INTO `hotel` VALUES ('68', '锦里结义搂大戏台宾馆', '298', '34');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_info` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `permission_id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '超级管理员');
INSERT INTO `permission` VALUES ('2', '游客');
INSERT INTO `permission` VALUES ('3', '管理员');
INSERT INTO `permission` VALUES ('4', '经理');
INSERT INTO `permission` VALUES ('5', '主管');
INSERT INTO `permission` VALUES ('7', '副主管');
INSERT INTO `permission` VALUES ('8', '总经理');

-- ----------------------------
-- Table structure for route
-- ----------------------------
DROP TABLE IF EXISTS `route`;
CREATE TABLE `route` (
  `route_id` int(11) NOT NULL AUTO_INCREMENT,
  `sceneryIdList` varchar(255) DEFAULT NULL,
  `route_name` varchar(255) DEFAULT NULL,
  `totalPrice` double(11,0) DEFAULT NULL,
  PRIMARY KEY (`route_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of route
-- ----------------------------
INSERT INTO `route` VALUES ('1', '8,9,2,7', '文殊院->春熙路', '168');
INSERT INTO `route` VALUES ('2', '1,6,10,11', '都江堰->青羊宫', '126');

-- ----------------------------
-- Table structure for scenery
-- ----------------------------
DROP TABLE IF EXISTS `scenery`;
CREATE TABLE `scenery` (
  `scenery_id` int(11) NOT NULL AUTO_INCREMENT,
  `scenery_name` varchar(255) DEFAULT NULL,
  `scenery_level` varchar(255) DEFAULT NULL,
  `ticket_price` double(11,0) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `scenery_address` varchar(255) DEFAULT NULL,
  `scenery_describe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`scenery_id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of scenery
-- ----------------------------
INSERT INTO `scenery` VALUES ('1', '都江堰', 'AAAAA', '20', 'dujiangyan.jpg', '四川省都江堰市公园路', '著名的古代水利工程都江堰，位于四川都江堰市城西，古时属都安县境而名为都安堰，宋元后称都江被誉为“独奇千古”的“镇川之宝”\r\n                        。两千年前，李冰父子面对桀骜不驯的岷江水，火攻玉垒化为离堆。鱼嘴堤分水、飞沙堰溢洪、宝瓶口引水，将逢雨必涝的西蜀平原，...');
INSERT INTO `scenery` VALUES ('2', '熊猫基地', 'AAAA', '39', 'xiongmaojidi.jpg', '四川省成都市成华区外北熊猫大道1375号', '成都大熊猫繁育研究基地（以下简称基地）地位于中国四川省成都市成华区外北熊猫大道1375号，距市中心10公里，距成都双流国际机场30余公里，是世界著名的大熊猫迁地保护基地、科研繁育基地、公众教育基地和教育旅游基地。基地占地面积1500亩。作为“大熊猫迁地保护生态示范工程”，以保护和繁育大熊猫、小熊猫等中国特有濒危野生动物而闻名于世。这里山峦含黛，碧水如镜，林涛阵阵，百鸟谐鸣，被誉为“国宝的自然天堂，我们的世外桃源”。');
INSERT INTO `scenery` VALUES ('3', '青城山', 'AAAAA', '10', 'qingchengshan.jpg', '四川省都江堰市西南', '青城山位于四川省成都市都江堰市西南，东距成都市区68千米，处于都江堰水利工程西南10千米处。景区面积200平方千米，最高峰老君阁海拔1260米，青城山分为前山和后山，群峰环绕起伏、林木葱茏幽翠，享有“青城天下幽”的美誉。');
INSERT INTO `scenery` VALUES ('4', '宽窄巷子', 'AAA', '10', 'kuanzhaixiangzi.jpg', '四川省成都市青羊区宽窄巷子窄巷子31号', '宽窄巷子位于四川省成都市青羊区长顺街附近，由宽巷子、窄巷子、井巷子平行排列组成，全为青黛砖瓦的仿古四合院落，这里也是成都遗留下来的较成规模的清朝古街道，与大慈寺、文殊院一起并称为成都三大历史文化名城保护街区。');
INSERT INTO `scenery` VALUES ('5', '锦里', 'AAA', '33', 'jinli.jpg', '四川省成都市武侯祠旁', '锦里是成都武侯祠博物馆（三国历史遗迹区、锦里民俗区、西区）的一部分，占地30000余平方米，建筑面积14000余平方米，街道全长550米，以明末清初川西民居作外衣，三国文化与成都民俗作内涵，集旅游购物、休闲娱乐为一体。');
INSERT INTO `scenery` VALUES ('6', '杜甫草堂', 'AAAA', '47', 'dufucaotang.jpg', '四川省成都市青羊区草堂路28号', '杜甫草堂，是中国唐代大诗人杜甫流寓成都时的故居，位于四川省成都市青羊区青华路38号。杜甫先后在此居住近四年，创作诗歌240余首。唐末诗人韦庄寻得草堂遗址，重结茅屋，使之得以保存，宋元明清历代都有修葺扩建。');
INSERT INTO `scenery` VALUES ('7', '春熙路', 'AAA', '10', 'chunxilu.jpg', '四川省成都市锦江区', '春熙路位于四川省成都市锦江区春熙路街道，覆盖北新街以东、总府路以南、红星路以西、东大街以北、南新街、中新街以及临街区域，面积大约20公顷。春熙路热闹繁华，现大约有商业网点700家，网点面积大约220000㎡，被业内誉为中国特色商业街。');
INSERT INTO `scenery` VALUES ('8', '文殊院', 'AAA', '20', 'wenshuyuan.jpg', '四川省成都市西北角', '文殊院位于成都市青羊区，文殊院始建于隋大业年间（605年—617年）。康熙三十六年（1697年）集资重建庙宇，改称文殊院。 [1]  是国务院确定的全国佛教重点寺院之一，中国长江上下游四大禅林之首，四川省重点文物保护单位；是集禅林圣迹、园林古建、朝拜观光、宗教修学于一体的佛教圣地。');
INSERT INTO `scenery` VALUES ('9', '西岭雪山', 'AAAAA', '99', 'xilingxueshan.jpg', '四川省成都市大邑县西岭镇', '西岭雪山，位于四川省成都市大邑县境内，距成都仅95公里，总面积483平方公里，属世界自然遗产、大熊猫栖息地、AAAA级旅游景区、国家重点风景名胜区。因唐代大诗人杜甫的千古绝句“窗含西岭千秋雪，门泊东吴万里船”而得名。景区内有终年积雪的大雪山，海拔5364米，为成都第一峰。');
INSERT INTO `scenery` VALUES ('10', '黄龙溪', 'AAAA', '49', 'huanglongxi.jpg', '四川省成都市双流县黄龙镇', '黄龙溪镇，隶属于四川省成都市双流区。黄龙溪镇有2100余年历史，位于成都平原南部、成都市双流区南端，与仁寿、彭山、新津接壤。距成都市中心39公里，距双流机场（东升街道）35公里，距天府新区华阳街道28公里。是天府新区核心区15分钟经济圈，属于天府新区文化生态休闲区。');
INSERT INTO `scenery` VALUES ('11', '青羊宫', 'AAA', '10', 'qingyanggong.jpg', '四川省成都市西北郫县城西南部', '青羊宫位于四川省成都市一环路西二段，被誉为“川西第一道观”、“西南第一丛林”，也是全国著名的道教宫观之一。青羊宫主要建筑有山门、三清殿、唐王殿等。宫内混元殿高大雄伟，八卦亭是其中保存最完整、造型最华贵的建筑，供奉着老子骑着青牛的塑像。青羊宫内最宝贵的文物是一部《道藏辑要》，是世界上保存最完整的版本，成为研究道教的珍贵资料');
INSERT INTO `scenery` VALUES ('12', '花舞人间', 'AAAA', '40', 'huawurenjian.jpg', '四川省成都市新津县新蒲路', '花舞人间占地3000余亩，位于四川成都南郊新津区 [1]  ，距离成都市区仅30余公里，是赏花、玩水，体验低碳休闲度假的国家4A级旅游景区。景区拥有郁金香节、杜鹃花节、鲁冰花节、向日葵节、百合花节、野菊花节、花粉节、兰花红叶节等多个主题花节庆，使得景区365天花开不断，被誉为“西南赏花首选地”！');
INSERT INTO `scenery` VALUES ('13', '国色天乡', 'AAAA', '35', 'guosetianxiang.jpg', '四川省成都市温江区万春镇', '国色天乡位于成都市温江区万春镇，这里距成都市区约15公里，平原沃野，也是13万亩花卉业的基地，由于项目请来了世界的设计公司，在发展规划和定位上放眼世界，资源的整合和利用不仅仅局 限于成都，在规划、营销和建设上是大手笔。而且把生态建设、文化建设和旅游产业发展紧密结合，形成独具特色、内涵丰富的情景互动式旅游，彰显了旅游产品个性，提升了旅游感染力，使得该项目在市郊旅游圈中的位置凸显了出来。');
INSERT INTO `scenery` VALUES ('14', '成都欢乐谷', 'AAAA', '175', 'chengduhuanlegu.jpg', '四川省成都市金牛区西华大道16号', '成都欢乐谷是成都市文化产业重点项目和旅游产业重点项目，位于成都市金牛区西华大道16号，距天府广场6.6公里，至成都各个主要人流区只需10～20分钟。成都欢乐谷是继深圳欢乐谷、北京欢乐谷之后，欢乐谷连锁品牌走向全国的第三站。');
INSERT INTO `scenery` VALUES ('15', '成都海昌极地海洋世界', 'AAAA', '88', 'chengduhaichangjidihaiyangshijie.jpg', '四川省成都市双流县', '成都海昌极地海洋公园位于天府新区华阳天府大道南段， AAAA级景区。占地面积24万平方米，属于南方地区地理区域。亚热带季风性湿润气候。它是集旅游、休闲、度假、购物、娱乐等多种方式为一体的中国主题公园式极地海洋公园。');
INSERT INTO `scenery` VALUES ('16', '成都动物园', 'AAA', '10', 'chengdudongwuyuan.jpg', '四川省成都市北郊', '成都市动物园位于四川省成都市北二环与三环路之间，川陕路右侧，紧邻昭觉寺汽车中心站，与川西名寺昭觉寺隔墙相望，距城区4公里。全园占地面积17.73公顷，绿化覆盖率为88.41%。成都动物园始建于1953年，是经成都市编委批准的差额预算事业单位。经过近50年的建设与发展，已建有30余组各种造型的动物馆舍，已成为常年展出各种兽类、两栖爬行、鸟类以及观赏金鱼等国家保护的珍稀濒危野生动物300余种、3000余只（头）的专类公园。年接待游人180万人次。');
INSERT INTO `scenery` VALUES ('17', '安仁古镇', 'AAA', '37', 'anrenguzhen.jpg', '四川省成都大邑安仁古镇', '安仁古镇地处成都平原西部，距成都41公里、双流国际机场38公里、大邑县城8公里，处于成温邛高速公路和川西旅游环线上。安仁古镇历史悠久，早在唐武德三年（公元620年）就建安仁县（早于大邑建县50多年），隶属于剑南道邛州，据《太平寰宇记》载由“取仁者安仁之意”而得名，当时的县治就在今天的安仁镇，因古为“安仁”县治，故得名。直至元朝二十一年（公元1284年），安仁县建置撤销，其区域划归大邑县。');
INSERT INTO `scenery` VALUES ('18', '大邑刘氏庄园博物馆', 'AAA', '35', 'liushizhuangyuanbowuguan.jpg', '四川省成都市大邑县安仁镇', '大邑刘氏庄园博物馆（Dayi Liushi Manorial Museum）位于四川省成都市大邑县安仁镇金桂街15号，为中国近现代社会的重要史迹和代表性建筑之一。大邑刘氏庄园博物馆博物馆占地7万余平方米，建筑面积约21055平方米，为川西坝子建筑风格。博物馆的建筑、馆藏、泥塑、遗存是认识和研究中国半殖民地半封建社会政治、经济、文化以及四川军阀史、民俗学、近代民居建筑的重要实物，也是中国近现代社会发展史的一个断面。');
INSERT INTO `scenery` VALUES ('19', '观音湖', 'AAA', '26', 'guanyinhu.jpg', '四川省遂宁市船山区犀牛提码头', '观音湖风景区位于孝昌县的东北部的小悟乡境内，距武汉天河国际机场76公里，距孝感市区54公里，距孝昌县城15公里，距京珠高速公路仅6公里。观音湖碧波千顷，山水一色，风光旖旎。大、小悟山、四方山环湖屏障、金盆水库一脉相连。小悟山既是悠久...[阅读全文');
INSERT INTO `scenery` VALUES ('20', '隆昌石牌坊旅游区', 'AAA', '27', 'lognchangshipaifang.jpg', '四川省内江隆昌县金鹅镇南北二关', '隆昌石牌坊旅游区由南关石牌坊古镇、莲峰公园、北关景区组成。南关石牌坊古镇，面积60亩，于2005年投资1亿元倾力打造，2006年10月1日正式对外营运。石牌坊古镇以城南石牌坊景观为中心，以千年古驿道为中轴线，“三横三竖、六碑六牌&rdquo...[阅读全文]');
INSERT INTO `scenery` VALUES ('21', '达州达县真佛山', '三', '53', 'shenfosi.jpg', '四川省达州达县福善镇真佛山景区管理处', '真佛山位于达县城南30余公里的七里峡山脉中段的福善乡境内，海拔910米，全山面积约3000余亩，是一座远近闻名的佛教胜地。据县志记载，清乾隆年间，农民蒋德化一面修行悟道，一面行医种药，人称“蒋善人”、“蒋活佛”，自建“德化寺”。后绥定...[阅读全文');
INSERT INTO `scenery` VALUES ('22', '华蓥山', '三', '24', 'huaqinshan.jpg', '四川省广安华蓥市红岩乡华蓥山旅游区', '华蓥山黄花梨农业旅游示范点位于华蓥市禄市镇国家级科技示范园区梨业园内，距华蓥市区8公里，隶属华蓥山黄花梨公司。该公司是由1999年中国十大杰出青年农民、全国三八绿色奖章获得者欧阳晓玲创办的大型农业企业。示范点内有观光梨业园区3000余...[阅读全文]');
INSERT INTO `scenery` VALUES ('23', '自贡井天池寺', '四', '72', 'tianchisi.jpg', '四川省自贡市贡井区艾叶乡竹林村', '天池寺坐落在自贡市贡井区艾叶乡竹林村，寺前有久负盛名的大公井遗址，寺后有天心窝山，寺左有尖峰岭山，寺右为云盘山。该寺建于明朝洪武年间，距今已有六百多年历史。 天池寺内因有一大池，故名天池寺。天池寺周围建有一丈多高、三尺余宽的石...[阅读全文');
INSERT INTO `scenery` VALUES ('24', '巴灵台', '三', '23', 'balingtai.jpg', '四川省巴中市平昌县灵山镇境内', '巴灵台又称巴灵寨，位于四川省巴中市平昌县灵山镇，地处三巴（巴东、巴西、巴中）腹地，距平昌县城28公里，主峰海拔760余米，台上东西长约300米，南北最宽处约25米，最窄处仅3米，面积约6000平方米，四面峻峭，由巨石垒成，山顶突起如台，远观...[阅读全文]');
INSERT INTO `scenery` VALUES ('25', '雅安杜鹃山', '四', '35', 'dujuanshan.jpg', '四川省雅安市荥经县杜鹃山', '荥经县杜鹃山原始森林公园（泡草湾）距县城30公里，拥有原始森林9628公顷，这里冬无严寒，夏无酷暑，年平均温度13℃，是我省保护最好、典型物种最丰富的亚热带常绿阔叶林带。“珙桐花开鸽飞舞，春来杜鹃映山红，熊猫戏竹金鸡鸣，休闲度假好去...[阅读全文');
INSERT INTO `scenery` VALUES ('26', '二滩水电站', '三', '35', 'ertanshuidianzhan.jpg', '四川省雅砻江干流下游河段上', '位于攀枝花市境内的二滩水电站拥有世界第三、中国第一高的双曲拱坝、亚洲最大的地下厂房洞室群、装机330万千瓦，是20世纪全面建成的国内最大水电站。电站建成后留下了大量的旅游景点供游人参观游览，1998年第一台机组投产以来共接待游客近百万...[阅读全文]');
INSERT INTO `scenery` VALUES ('27', '瓦屋山', '三', '26', 'wawushan.jpg', '四川省眉山市洪雅县瓦屋山', '瓦屋山国家森林公园行政隶属四川盆地西沿的眉山市洪雅县，距成都180公里，占地面积105万亩，由瓦屋山原始森林猎奇探险景区、玉屏人工林海度假区、八面山寻古揽胜区等系列景区组成。空气清新，能见度高，宛如仙境，迷魂凼是其最大魅力。核心景区瓦屋山系中国历史文化名山，是道教发祥地之一，被誉为“中国鸽子花的故乡”，“世界杜鹃花的王国”。目前已荣获全国重点生态旅游景区，全国森林公园十大标兵单位，全国文明森林公园、省级自然保护区、四川森林康养示范基地、中国森林康养试点建设单位、中国森林养生基地、中国森林氧吧等称号。');
INSERT INTO `scenery` VALUES ('28', '段家大院子', '三', '25', 'duanjaidayuanzi.jpg', '四川省德阳市广汉市段家大院子', '段家大院子又称段家老鸹林，坐落于鸭子河畔、三星堆旁（今四川省广汉市高坪镇）。清朝乾隆年间，段氏族人由湖广入川，世代耕居于此。昔日房宅毗连，林木参天，百鸟群集，人居生态环境极佳，尤以老鸹最多，故名段家老鸹林。后来到二十世纪中期...[阅读全文');
INSERT INTO `scenery` VALUES ('29', '峨眉山', '五', '36', 'emeishan.jpg', '四川省峨眉山', '峨眉山位于中国四川峨眉山市境内，景区面积154平方公里，最高峰万佛顶海拔3099米。地势陡峭，风景秀丽，有 秀甲天下 之美誉。气候多样，植被丰富，共有3000多种植物，其中包括世界上稀有的树种。山路沿途有较多猴群，常结队向游人讨食，胜为峨...[阅读全文]');
INSERT INTO `scenery` VALUES ('30', '禹迹山大佛风景区', 'AAA', '30', 'yujishandafo.jpg', '四川省南充市南部县碑院镇', '禹迹山是大禹治水时留下的足迹，拥有千年历史也同时赢得了众多称号，“嘉陵第一名山”、“阆南县地”等。禹迹山大佛高18米，与乐山大佛、大足卧佛并称为“巴蜀三大佛”，是中国最大的石刻圆雕立佛。[阅读全文]');
INSERT INTO `scenery` VALUES ('31', '乐山大佛', 'AAAAA', '25', 'leshandafo.jpg', '四川省乐山市', '乐山大佛地处四川省乐山市，岷江、青衣江、大渡河三江汇流处，与乐山城隔江相望。乐山大佛雕凿在岷江、青衣江、大渡河汇流处的岩壁上，依岷江南岸凌云山栖霞峰临江峭壁凿造而成，又名凌云大佛，为弥勒佛坐像。 乐山大佛是唐代摩...[阅读全文]');
INSERT INTO `scenery` VALUES ('32', '九寨沟', 'AAAAA', '40', 'jiuzhaigou.jpg', '四川省九寨沟县境内', '九寨沟风景名胜区位于四川省阿坝藏族羌族自治州南坪县境内，距离成都市400多公里，是一条纵深40余公里的山沟谷地，因周围有9 个藏族村寨而得名，总面积约620平方公里，大约有52％的面积被茂密的原始森林所覆盖。林中夹生的箭竹和各种奇花异草...[阅读全文]');
INSERT INTO `scenery` VALUES ('33', '海螺沟', 'AAAAA', '45', 'hailuogou.jpg', '四川省甘孜藏族自治州泸定县磨西镇', '海螺沟位于四川省甘孜藏族自治州泸定县磨西镇，贡嘎山东坡，是青藏高原东缘的极高山地。距离成都280公里。海螺沟位于贡嘎雪峰脚下，以低海拔现代冰川著称于世。晶莹的现代冰川从高峻的山谷铺泻而下；巨大的冰洞、险峻的冰桥，使人如入神话中的水晶宫。');
INSERT INTO `scenery` VALUES ('34', '碧峰峡', 'AAAAA', '100', 'bifengxia.jpg', '四川省雅安市下里乡', '碧峰峡位于雅安市北8公里，景区为两条峡谷，左峡长7公里，右峡长6公里，呈“V”字形，宽30-70米，海拔700-1971米，峡壁相对高度100-200米。植被、峡景和瀑布是碧峰峡景区的鲜明特色。峡内林木葱郁，苍翠欲滴，峰峦叠嶂，崖壑峥嵘，...[阅读全文]');
INSERT INTO `scenery` VALUES ('35', '剑门关', 'AAAAA', '100', 'jianmenguan.jpg', '四川省广元市剑阁县河东街64号', '剑门关，世称天险，是首批国家级“剑门蜀道风景名胜区”的核心景区，也是国家级“森林公园”。 剑门关位于剑阁县境内，紧临成（都）绵（阳）广（元）高速公路和宝（鸡）成（都）铁路，集雄、奇、幽、秀的自然风光于一体，汇汉、唐、宋、明、清...[阅读全文]');
INSERT INTO `scenery` VALUES ('36', '朱德故里', 'AAAAA', '15', 'zhudeguli.jpg', '四川省南充市仪陇县马鞍镇', '朱德故里景区核心区地处仪陇县马鞍镇，由“入口区——纪念区——民俗区——背景区——体验区”五大部分组成。景区现有国家重点文物保护单位3处（朱德故居，朱德诞生地，丁氏庄园），省级文...[阅读全文]');
INSERT INTO `scenery` VALUES ('37', '阆中', 'AAAAA', '20', 'langzhong.jpg', '四川省阆中市张飞南路', '阆中古城处在阆中市内、嘉陵江边。阆中市是巴蜀之要冲、川北之重镇，有近2千平方公里，约90万人口，古称阆苑。 阆中古城被号称为全国四大古城之一(另外三处是云南丽江、山西平遥、安徽歙县)，它是我国保存最完整的古城，完全按照唐代天文风水...[阅读全文]');
INSERT INTO `scenery` VALUES ('38', '武侯祠', 'AAAA', '60', 'wuhouci.jpg', '四川省成都市武侯区武侯祠大街231号', '成都武侯祠，位于四川省成都市南门武侯祠大街，是中国惟一的君臣合祀祠庙，由武侯祠、汉昭烈庙及惠陵组成，人们习惯将三者统称为武侯祠。成都武侯祠始建于公元223年修建惠陵（刘备的陵寝）之时，其中，武侯祠（诸葛亮的专祠）建于唐以前，初与...[阅读全文]');
INSERT INTO `scenery` VALUES ('39', '洛带古镇', 'AAAA', '20', 'luodaiguzheng.jpg', '四川省成都市龙泉镇北10公里', '洛带古镇位于龙泉镇北10公里，坐落在龙泉山脉中段的二峨山麓。建于三国蜀汉时期，传说因蜀汉后主刘禅的玉带落入镇旁的八角井中而得名,镇上居民中客家人有2万多人，占全镇人数的9成; 故有中国西部客家第一镇之称。他们常用一种叫客家话的方言,...[阅读全文]');
INSERT INTO `scenery` VALUES ('40', '三圣花乡', 'AAAA', '50', 'sanshenghuaxiang.jpg', '四川省成都锦江区三圣花乡', '“三圣花乡”坐落于素有“中国花木之乡”之称的四川成都市锦江区三圣街道办事处，总面积达15000亩,涉及五个村（红砂村、幸福村、驸马村、万福村、江家堰村），是全国建设社会主义新农村的典范。如今的“三圣花乡”是一个以观光休闲农业和乡村...[阅读全文]');
INSERT INTO `scenery` VALUES ('41', '望月楼 \r\n望月楼 \r\n望月楼', 'AAA', '10', 'wangyuelou.jpg', '四川省攀枝花市米易挂榜乡', '从成昆铁路路经米易挂榜乡，凭窗西望，万绿从中，一座红色亭阁亭亭玉立，它便是攀枝花市的省级文件保护单位望月楼。 望月楼以木构榫结，四方形底层及上两层六方形楼阁，六角攒尖顶有机连结，承托得四平八稳。虽经二百年风雨和道光三年、十年、...[阅读全文]');
INSERT INTO `scenery` VALUES ('42', '蜀南竹海', 'AAAA', '40', 'shunanzhuhai.jpg', '四川省宜宾市', '蜀南竹海原名万岭箐，位于四川南部宜宾市境内，方圆120平方公里，中心景区44平方公里，共8大景区两大序景区134处景点，生长着楠竹、水竹、人面竹、琴丝竹等乡土竹子58种，引种了巨龙竹、黄金间碧玉竹等竹子300多种，共有竹子427种、7万余亩，...[阅读全文]');
INSERT INTO `scenery` VALUES ('43', '黄荆老林', 'AAAA', '50', 'huangjinlaolin.jpg', '四川省古蔺县黄荆乡', '黄荆老林景区是北纬28°线上最后的处女地，位于古蔺县北部，属云贵高原向四川盆地过渡带的赤水河流域，面积433平方公里，平均海拔1300多米，是典型的白垩系红色砂岩中山峡谷丹霞地貌区，也是地球同纬度（北纬28°C）唯一保存完好的亚热...[阅读全文]');
INSERT INTO `scenery` VALUES ('44', '四姑娘山', '四', '70', 'sigulaingshan.jpg', '四川省小金县和汶川县交界处', '四姑娘山位于小金县和汶川县交界处，由横断山脉中四座毗连的山峰组成，根据当地藏民的传说，是四个冰清玉洁的姑娘的化生，因而得名四姑娘山。 四姑娘山以雄峻挺拔闻名，山体陡峭，直指蓝天，冰雪覆盖，银光照人。山麓森林茂密，绿草如茵，清澈...[阅读全文]');
INSERT INTO `scenery` VALUES ('45', '光雾山', '四', '85', 'guangwushan.jpg', '四川省巴中市南江县光雾山镇', '诡异神奇、原始荒美的光雾山――诺水河国家重点风景名胜区，位于川陕交界的米仓山南麓万倾秀丽林海中，居秦岭巴山之结合部，位南北气候之分水岭的特殊地理，构成了山高林密，地广人稀的原始自然生态。 光雾山――诺水河风景名胜区气势雄伟辽...[阅读全文]');
INSERT INTO `scenery` VALUES ('46', '诺水河', '三', '60', 'luoshuihe.jpg', '四川省巴中市通江县诺水河镇洞天景区', '狮子洞，宏伟华丽，俨然一座独特的地下宫殿。该洞特色鲜明，洞内石柱、石塔、石灯、石笋特别巨大、十分壮观。洞中景点紧凑，由“群仙聚会”等八个大厅组成，犹如一幅幅连绵不绝的神奇画卷。洞内可游面积10万平方米，主洞深2000余米...[阅读全文]');
INSERT INTO `scenery` VALUES ('47', '广汉三星堆博物馆', '四', '90', 'sanxingduibowuguan.jpg', '四川省广汉三星堆博物馆', '三星堆博物馆位于全国重点文物保护单位三星堆遗址东北角，地处历史文化名城广汉城西鸭子河畔。南距省会成都约40公里，北离新华不工业城亢德阳26公里，是我国一座在弄的现代化历史博物馆。博物馆于是1992年8月奠基，1997年，10月落成开放。主馆...[阅读全文]');
INSERT INTO `scenery` VALUES ('48', '凌云山', '四', '58', 'linyunshan.jpg', '四川省南充市高坪区老君镇', '凌云山位于南充市高坪区老君镇，以凌云山道教城、白山佛教城、图山儒家文化中心为主体，方圆近20平方公里；凌云山传统文化源远流长，据出土文物考证和史书记载，自东汉明帝时起，道、儒、佛三家竞相在此建宫造庙，文革前仍留存有数十座规模宏...[阅读全文]');
INSERT INTO `scenery` VALUES ('49', '牛背山', '三', '20', 'niubeishan.jpg', '四川省雅安市荥经县境内', '牛背山位于四川省雅安市荥经县境内，与泸定县交界，属二郎山分支，是青衣江、大渡河的分水岭，山顶海拔3600米，因山顶一面悬崖有巨石突出酷似牛头，山脊细长貌似牛背而得名 牛背山海拔3660米左右，它四面环山中间突起的独特地理位置，使它获得...[阅读全文]');
INSERT INTO `scenery` VALUES ('50', '米易龙潭溶洞', '三', '50', 'miyilongtairongdong.jpg', '四川省攀枝花市米易县宁华乡龙潭沟', '龙潭溶洞风景区是四川省级风景名胜区，以龙潭溶洞为主，龙吟峡谷、天然盆景园、野生植物园、龙肘山顶风光相匹配，构成山水秀丽、风光奇特、格调高雅的自然风景胜地。 龙潭溶洞为攀西第一洞，一洞两景，前似龙宫，后若天宫，钟乳石七彩斑澜，洞...[阅读全文]');

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team` (
  `team_id` int(11) NOT NULL AUTO_INCREMENT,
  `end_time` int(11) DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `team_name` varchar(255) DEFAULT NULL,
  `tourguid_id` int(11) DEFAULT NULL,
  `route_id` int(11) DEFAULT NULL,
  `car_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`team_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of team
-- ----------------------------
INSERT INTO `team` VALUES ('1', '1', '2020-09-14 14:19:35', '一号', '1', '1', '1');
INSERT INTO `team` VALUES ('2', '2', '2020-09-15 14:19:35', '二号plus', '0', '0', '2');
INSERT INTO `team` VALUES ('3', '2', '2020-09-17 14:19:35', '三号', '0', '0', '3');

-- ----------------------------
-- Table structure for tourguid
-- ----------------------------
DROP TABLE IF EXISTS `tourguid`;
CREATE TABLE `tourguid` (
  `tourguid_id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `tourguid_name` varchar(255) DEFAULT NULL,
  `tourguid_sex` varchar(255) DEFAULT NULL,
  `tourguid_state` int(11) DEFAULT NULL,
  `tourguid_tel` varchar(255) DEFAULT NULL,
  `tourguid_describe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tourguid_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tourguid
-- ----------------------------
INSERT INTO `tourguid` VALUES ('1', '30', '熊杉', '女', '0', '13008080888', '专业专注、用心服务、真诚的服务、合理的价格!');
INSERT INTO `tourguid` VALUES ('2', '36', '王凌川', '男', '1', '17758309921', '都说人的一生总是在路上。漫漫长路，何不体会别样风情。 本人从事旅游行业10多年，将会为你推荐合适的旅游线路。经验服务。');
INSERT INTO `tourguid` VALUES ('3', '38', '朱弘', '男', '0', '13659140399', '相信我们， 我们会做的更好！');
INSERT INTO `tourguid` VALUES ('4', '35', '徐春梅', '女', '1', '19968704311', '从事旅游服务多年，熟悉四川省内以及省外和出境游线路');
INSERT INTO `tourguid` VALUES ('5', '28', '黄玲燕', '女', '0', '17756409835', '我们会每天进步一点，努力做的更好，加油，我们的团队！');
INSERT INTO `tourguid` VALUES ('6', '29', '葛晓蔓', '女', '0', '15876438876', '从事旅游行业数年，我一定会为您设计出最完美的行程，让你尝美食，赏美景');
INSERT INTO `tourguid` VALUES ('7', '30', '张思寻', '男', '1', '13658170422', '诚信第一，客户至上');
INSERT INTO `tourguid` VALUES ('8', '39', '胡皓', '男', '0', '17745342212', '四川旅游景点丰富，真诚为你设计个性旅游方案');
INSERT INTO `tourguid` VALUES ('9', '34', '顾琳', '女', '0', '15567563342', '喜欢与人接触,对美食无法抵抗。从小的梦想就是在旅行社工作，为的就是能免费环游世界。');
INSERT INTO `tourguid` VALUES ('10', '27', '妮静美朵', '女', '0', '13432990845', '做旅游我明白游客喜欢什么样的出行，相信定为您设计出满意的旅游方案');
INSERT INTO `tourguid` VALUES ('11', '33', '张静', '男', '0', '110', '无');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `user_pwd` varchar(100) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `permission_id` int(11) DEFAULT NULL,
  `user_age` varchar(255) DEFAULT NULL,
  `user_idCard` varchar(255) DEFAULT NULL,
  `user_sex` varchar(255) DEFAULT NULL,
  `user_tel` varchar(255) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'SuperAdmin', '123', null, null, '1', '30', null, '男', '110', '0');
INSERT INTO `user` VALUES ('2', 'yjq', '123', null, null, '2', '21', null, '女', '1839', '0');
INSERT INTO `user` VALUES ('3', 'zyq', '123', null, null, '2', '23', null, '男', '1778', '0');
INSERT INTO `user` VALUES ('4', 'whc', '123', null, null, '2', '23', null, '男', '1684', '0');
INSERT INTO `user` VALUES ('5', 'zy', '123', null, null, '2', '21', null, '男', '1874', '0');
INSERT INTO `user` VALUES ('6', 'cyj', '123', null, null, '2', '23', null, '男', '1598', '0');
INSERT INTO `user` VALUES ('7', 'qw', '123', null, null, '2', '23', null, '男', '1897', '0');
INSERT INTO `user` VALUES ('8', 'lisa2', '123', null, null, '2', '22', null, '女', '1365', '0');
INSERT INTO `user` VALUES ('9', 'lisa3', '123', null, null, '0', '25', null, '男', '1100', '0');
INSERT INTO `user` VALUES ('10', 'yjqtql', '2390420d540c1cd18bea78604e0bc170', null, null, '0', null, null, null, '1234567', '0');
INSERT INTO `user` VALUES ('11', 'yjqztql', '18613e22070e9c728f2859acf870635d', null, null, '0', null, null, null, '', '0');
INSERT INTO `user` VALUES ('12', 'yjqtailihail', '4d8818fbb46782a69d53abc8c9487233', null, null, '0', null, null, null, '123', '0');
