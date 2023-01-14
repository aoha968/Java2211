DROP TABLE IF EXISTS names;

CREATE TABLE names (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 PRIMARY KEY(id)
);

INSERT INTO names (id, name) VALUES (1, "koyama");
INSERT INTO names (id, name) VALUES (2, "tanaka");

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  published_year int NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO movies (id, name, published_year) VALUES (1, "名探偵コナン 時計じかけの摩天楼", 1997);
INSERT INTO movies (id, name, published_year) VALUES (2, "名探偵コナン 14番目の標的", 1998);
INSERT INTO movies (id, name, published_year) VALUES (3, "名探偵コナン 世紀末の魔術師", 1999);
INSERT INTO movies (id, name, published_year) VALUES (4, "名探偵コナン 瞳の中の暗殺者", 2000);
INSERT INTO movies (id, name, published_year) VALUES (5, "名探偵コナン 天国へのカウントダウン", 2001);
INSERT INTO movies (id, name, published_year) VALUES (6, "名探偵コナン ベイカー街の亡霊", 2002);
INSERT INTO movies (id, name, published_year) VALUES (7, "名探偵コナン 迷宮の十字路", 2003);
INSERT INTO movies (id, name, published_year) VALUES (8, "名探偵コナン 銀翼の奇術師", 2004);
INSERT INTO movies (id, name, published_year) VALUES (9, "名探偵コナン 水平線上の陰謀", 2005);
INSERT INTO movies (id, name, published_year) VALUES (10, "名探偵コナン 探偵たちの鎮魂歌", 2006);
INSERT INTO movies (id, name, published_year) VALUES (11, "名探偵コナン 紺碧の棺", 2007);
INSERT INTO movies (id, name, published_year) VALUES (12, "名探偵コナン 戦慄の楽譜", 2008);
INSERT INTO movies (id, name, published_year) VALUES (13, "名探偵コナン 漆黒の追跡者", 2009);
INSERT INTO movies (id, name, published_year) VALUES (14, "名探偵コナン 天空の難破船", 2010);
INSERT INTO movies (id, name, published_year) VALUES (15, "名探偵コナン 沈黙の15分", 2011);
INSERT INTO movies (id, name, published_year) VALUES (16, "名探偵コナン 11人目のストライカー", 2012);
INSERT INTO movies (id, name, published_year) VALUES (17, "名探偵コナン 絶海の探偵", 2013);
INSERT INTO movies (id, name, published_year) VALUES (18, "名探偵コナン 異次元の狙撃手", 2014);
INSERT INTO movies (id, name, published_year) VALUES (19, "名探偵コナン 業火の向日葵", 2015);
INSERT INTO movies (id, name, published_year) VALUES (20, "名探偵コナン 純黒の悪夢", 2016);
INSERT INTO movies (id, name, published_year) VALUES (21, "名探偵コナン から紅の恋歌", 2017);
INSERT INTO movies (id, name, published_year) VALUES (22, "名探偵コナン ゼロの執行人", 2018);
INSERT INTO movies (id, name, published_year) VALUES (23, "名探偵コナン 紺青の拳", 2019);
INSERT INTO movies (id, name, published_year) VALUES (25, "名探偵コナン 緋色の弾丸", 2021);
INSERT INTO movies (id, name, published_year) VALUES (26, "名探偵コナン ハロウィンの花嫁", 2022);
INSERT INTO movies (id, name, published_year) VALUES (27, "名探偵コナン 黒鉄の魚影", 2023);
