use aizawa;

-- 職業紹介者マスタのサンプルデータ
insert into staff values(1234,'藤谷勉','フジタニツトム',2,'95C3W4hW',current_timestamp,'7584',current_timestamp,'1254',0);
insert into staff values(3451,'森下健三郎','モリシタケンザブロウ',1,'mW1G9w7',current_timestamp,'6547',current_timestamp,'1452',0);
insert into staff values(4500,'大西奈央','オオニシナオ',2,'rMKpetBc',null,'1245',current_timestamp,'4564',0);


-- 求職者マスタのサンプルデータ
insert into jobseeker values(1234,'結城武治','ユウキタケジ','1991/7/27','1','27','633-0234','奈良県宇陀市榛原高塚1-4-4','','745263141','8028916797','1','1','学歴1','1','2','3','4','','3','1','1000','1800','1000000','0','0','0','0','0','0','0','-2m6YgDU',current_timestamp,'tt',current_timestamp,'tt',0);
insert into jobseeker values(2245,'秋葉達雄','アキバタツオ','1964/1/20','1','54','623-0025','京都府綾部市月見町3-7-4-4','','777463775','8057721419','1','2','学歴2','2','3','4','5','4','4','1','1000','1700','1200000','0','0','0','0','0','0','0','9Q4S9"',current_timestamp,'tt',current_timestamp,'tt',0);
insert into jobseeker values(3145,'玉田陽子','タマダヨウコ','1966/3/30','2','52','522-0005','滋賀県彦根市小野町4-12-12','','749638094','9004399284','2','1','学歴3','3','4','5','6','1','5',null,'9000','2000','300000','0','0','0','2','0','0','0','Uo9xu8VZ',current_timestamp,'tt',current_timestamp,'tt',0);


-- 職種マスタのサンプルデータ
insert into job values('A',01,011,'議会議員');
insert into job values('A',01,012,'管理的国家公務員');
insert into job values('A',02,013,'管理的地方公務員');
insert into job values('B',05,051,'自然科学系研究者');
insert into job values('C',25,000,'一般事務従事者');


-- 業種マスタのサンプルデータ
insert into jobcategory values('A',00,000,'農業，林業');
insert into jobcategory values('A',01,011,'米作農業');
insert into jobcategory values('A',01,012,'畜産農業');
insert into jobcategory values('B',00,000,'漁業');
insert into jobcategory values('C',00,000,'鉱業，採石業，砂利採取業');


-- マッチング事例のサンプルデータ
insert into matchingcase (kyujinno,jobseekerid,staffid,interviewdt,enterdt,assessment,note,createuserid,updateuserid)
values(12457-44446666,1234,5677,'2014-7-8','2014-5-5',1,'','1111','2222');
insert into matchingcase (kyujinno,jobseekerid,staffid,interviewdt,enterdt,assessment,note,createuserid,updateuserid)
values(45141-45445554,4745,1453,'2013-4-8','2017-4-4',2,'','4741','1422');
insert into matchingcase (kyujinno,jobseekerid,staffid,interviewdt,enterdt,assessment,note,createuserid,updateuserid)
values(41244-95544575,1234,5677,'2017-4-9','2011-2-12',1,'','7777','1111');


-- 求人票のサンプルデータ
insert into kyujin values(12457-44446666,'1235-12-11','2018-12-14','1111-222222-1','12','000','012','011','C','A','A','000','A','エービーシーカブシキガイシャ','ABC株式会社','112-1144','兵庫県尼崎市南城内4-4-15','','635-0083','奈良県大和高田市永和町2-14','奈良駅','議員','1','あああああ','6','1','1233-1-2','2345-12-15','大卒','','','20','70','100000','200000','1','9999','9999','9999','1000000000','','','','','1234','','','1','14','45','',current_timestamp,'7584',current_timestamp,'1254',0);
insert into kyujin values(52555-74554555,'1425-4-7','2010-8-14','1111-333333-1','25','011','000','051','A','C','B','000','B','カブシキガイシャビーアール','株式会社br','225-1145','大阪府枚方市中宮東之町1-13-13','','558-1475','和歌山県有田郡有田川町清水1-9-9ヴィレッジ清水216','和歌山駅','','1','uyyuuyy','4','1','2525-10-09','4571-4-27','高卒','','','21','65','100000','3000000','1','9999','9999','9999','2000000000','','','','','4545','','','1','20','60','',current_timestamp,'7584',current_timestamp,'1254',0);
insert into kyujin values(5845-44774587,'2017-1-8','2011-6-14','5545-444444-1','47','051','012','011','B','A','A','000','C','カブシキガイシャ123','株式会社123','455-2554','和歌山県日高郡日高町原谷4-18-1','','147-4444','奈良県北葛城郡河合町星和台4-2','河内町駅','','1','4525','4','1','2514-5-09','2008-3-27','大卒','','','23','60','800000','4000000','1','4444','5555','6666','4000000000','','','','','1475','','','1','20','70','',current_timestamp,'4754',current_timestamp,'1453',0);


-- 特性マスタのサンプルデータ
insert into `character` (`character`) values('positive');
insert into `character` (`character`) values('negative');


-- 求職者特性のサンプルデータ
insert into jscharacter values(1112,1);
insert into jscharacter values(3456,2);


-- 求職者職歴のサンプルデータ
insert into jscareer values(1424,'エンジニア',201206,201209);
insert into jscareer values(1424,'システムマネージャー',201509,201609);
insert into jscareer values(4575,'製造業',201101, 201202);

-- 採番のサンプルデータ
insert into saiban values(0,0,0);

-- 都道府県のデータ
insert into todouhuken values (01,'北海道');
insert into todouhuken values (02,'青森県');
insert into todouhuken values (03,'岩手県');
insert into todouhuken values (04,'宮城県');
insert into todouhuken values (05,'秋田県');
insert into todouhuken values (06,'山形県');
insert into todouhuken values (07,'福島県');
insert into todouhuken values (08,'茨城県');
insert into todouhuken values (09,'栃木県');
insert into todouhuken values (10,'群馬県');
insert into todouhuken values (11,'埼玉県');
insert into todouhuken values (12,'千葉県');
insert into todouhuken values (13,'東京都');
insert into todouhuken values (14,'神奈川県');
insert into todouhuken values (15,'新潟県');
insert into todouhuken values (16,'富山県');
insert into todouhuken values (17,'石川県');
insert into todouhuken values (18,'福井県');
insert into todouhuken values (19,'山梨県');
insert into todouhuken values (20,'長野県');
insert into todouhuken values (21,'岐阜県');
insert into todouhuken values (22,'静岡県');
insert into todouhuken values (23,'愛知県');
insert into todouhuken values (24,'三重県');
insert into todouhuken values (25,'滋賀県');
insert into todouhuken values (26,'京都府');
insert into todouhuken values (27,'大阪府');
insert into todouhuken values (28,'兵庫県');
insert into todouhuken values (29,'奈良県');
insert into todouhuken values (30,'和歌山県');
insert into todouhuken values (31,'鳥取県');
insert into todouhuken values (32,'島根県');
insert into todouhuken values (33,'岡山県');
insert into todouhuken values (34,'広島県');
insert into todouhuken values (35,'山口県');
insert into todouhuken values (36,'徳島県');
insert into todouhuken values (37,'香川県');
insert into todouhuken values (38,'愛媛県');
insert into todouhuken values (39,'高知県');
insert into todouhuken values (40,'福岡県');
insert into todouhuken values (41,'佐賀県');
insert into todouhuken values (42,'長崎県');
insert into todouhuken values (43,'熊本県');
insert into todouhuken values (44,'大分県');
insert into todouhuken values (45,'宮崎県');
insert into todouhuken values (46,'鹿児島県');
insert into todouhuken values (47,'沖縄県');










