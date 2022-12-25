## 第8回課題
 - 下記のハンズオンをやってみましょう！
 - https://github.com/raisetech-for-student/docker-mysql-hands-on

## 実行結果
```
% docker -v
Docker version 20.10.21, build baeda1f
% git clone git@github.com:raisetech-for-student/docker-mysql-hands-on.git
Cloning into 'docker-mysql-hands-on'...
remote: Enumerating objects: 61, done.
remote: Counting objects: 100% (61/61), done.
remote: Compressing objects: 100% (47/47), done.
remote: Total 61 (delta 24), reused 25 (delta 8), pack-reused 0
Receiving objects: 100% (61/61), 16.44 KiB | 4.11 MiB/s, done.
Resolving deltas: 100% (24/24), done.
% ls
docker-mysql-hands-on
% cd docker-mysql-hands-on
% ls
Dockerfile		conf			renovate.json
README.md		docker-compose.yml	sql
% docker compose up -d
[+] Building 50.5s (10/10) FINISHED
 => [internal] load build definition from Dockerfile                       0.0s
 => => transferring dockerfile: 218B                                       0.0s
 => [internal] load .dockerignore                                          0.0s
 => => transferring context: 2B                                            0.0s
 => [internal] load metadata for docker.io/library/mysql:8.0-debian        3.3s
 => [auth] library/mysql:pull token for registry-1.docker.io               0.0s
 => [1/4] FROM docker.io/library/mysql:8.0-debian@sha256:e0a793ddd093df3  17.0s
 => => resolve docker.io/library/mysql:8.0-debian@sha256:e0a793ddd093df31  0.0s
 => => sha256:e0a793ddd093df31139fc695ed889fdd3ec910c76ddf318 320B / 320B  0.0s
 => => sha256:3f4ca61aafcd4fc07267a105067db35c0f0ac630 31.40MB / 31.40MB  13.8s
 => => sha256:6c71b14b90321c4c925c97bde825eb21b3c97f7f6b9 1.74kB / 1.74kB  0.8s
 => => sha256:8b20239cd5b3eb4255955404db9ddf231a20a91b74c 4.41MB / 4.41MB  0.9s
 => => sha256:ac248facf748e93a1022552d4f15311ef8bd8be7ba8 2.83kB / 2.83kB  0.0s
 => => sha256:e3b748431f76159ff04ec985c63bf42dae5206be3ae 7.13kB / 7.13kB  0.0s
 => => sha256:69a92a8be7b81fc7d582c733edcb95ffe26bd8ff252 1.42MB / 1.42MB  1.2s
 => => sha256:ed87af8210d03be6cf68e7ddc53ca53f0b7cb5d2526d8b3 149B / 149B  1.2s
 => => sha256:89326f0fbca735cd9db355568c579a062d4e4f1a1 12.66MB / 12.66MB  2.0s
 => => sha256:d2d532ea748ea86b00b0defbd158232a20f45862f46 2.54kB / 2.54kB  1.5s
 => => sha256:46e4e09af7ec7aa3580ada1847200f65da4879d557475f2 251B / 251B  1.7s
 => => sha256:0d62f3c764f6b95a24939111413263a1dd1e0ff 127.65MB / 127.65MB  9.1s
 => => sha256:edad28c75e273ba1d4fade07eba864f0ad81767b605529a 846B / 846B  2.2s
 => => sha256:5a2005ac0b2c3804a85b1ef7cfc06d078e2ecce524d 5.39kB / 5.39kB  2.5s
 => => sha256:0ff97e27ba8e3f53c701cbd1841c5e91dfe25863598c0d0 121B / 121B  2.8s
 => => extracting sha256:3f4ca61aafcd4fc07267a105067db35c0f0ac630e1970f3c  0.4s
 => => extracting sha256:6c71b14b90321c4c925c97bde825eb21b3c97f7f6b9f73ad  0.0s
 => => extracting sha256:8b20239cd5b3eb4255955404db9ddf231a20a91b74c52e8a  0.1s
 => => extracting sha256:69a92a8be7b81fc7d582c733edcb95ffe26bd8ff252e0516  0.0s
 => => extracting sha256:ed87af8210d03be6cf68e7ddc53ca53f0b7cb5d2526d8b35  0.0s
 => => extracting sha256:89326f0fbca735cd9db355568c579a062d4e4f1a151dee77  0.3s
 => => extracting sha256:d2d532ea748ea86b00b0defbd158232a20f45862f4693dd6  0.0s
 => => extracting sha256:46e4e09af7ec7aa3580ada1847200f65da4879d557475f2f  0.0s
 => => extracting sha256:0d62f3c764f6b95a24939111413263a1dd1e0ffcf895cb67  1.8s
 => => extracting sha256:edad28c75e273ba1d4fade07eba864f0ad81767b605529a4  0.0s
 => => extracting sha256:5a2005ac0b2c3804a85b1ef7cfc06d078e2ecce524d07697  0.0s
 => => extracting sha256:0ff97e27ba8e3f53c701cbd1841c5e91dfe25863598c0d09  0.0s
 => [internal] load build context                                          0.0s
 => => transferring context: 371B                                          0.0s
 => [2/4] RUN apt-get update                                              16.7s
 => [3/4] RUN apt-get -y install locales-all                              12.9s
 => [4/4] COPY ./conf/mysql/my.cnf /etc/my.cnf                             0.0s
 => exporting to image                                                     0.5s
 => => exporting layers                                                    0.5s
 => => writing image sha256:1883b4c364221df4197a93c60b4f259eba57b0dc2104b  0.0s
 => => naming to docker.io/library/docker-mysql-hands-on-db                0.0s

Use 'docker scan' to run Snyk tests against images to find vulnerabilities and learn how to fix them
[+] Running 3/3
 ⠿ Network docker-mysql-hands-on_default  Created                          0.0s
 ⠿ Volume "docker-mysql-hands-on_my-vol"  Created                          0.0s
 ⠿ Container docker-mysql-hands-on        Started                          0.3s
% docker ps
CONTAINER ID   IMAGE                      COMMAND                  CREATED              STATUS              PORTS                               NAMES
303928b8a985   docker-mysql-hands-on-db   "docker-entrypoint.s…"   About a minute ago   Up About a minute   33060/tcp, 0.0.0.0:3307->3306/tcp   docker-mysql-hands-on
% docker compose exec db mysql -uroot -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.31 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| movie_list         |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.09 sec)

mysql> use movie_list;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+----------------------+
| Tables_in_movie_list |
+----------------------+
| movies               |
+----------------------+
1 row in set (0.03 sec)

mysql> select * from movies;
+----+--------------------------------+-----------------------------+
| id | name                           | director                    |
+----+--------------------------------+-----------------------------+
|  1 | ショーシャンクの空に           | フランク・ダラボン          |
|  2 | この世界の片隅に               | 片渕須直                    |
+----+--------------------------------+-----------------------------+
2 rows in set (0.01 sec)

mysql> insert into movies (name, director) values ("ゴッドファーザー", "フランシス・フォード・コッポラ");
Query OK, 1 row affected (0.01 sec)

mysql> select * from movies;
+----+--------------------------------+-----------------------------------------------+
| id | name                           | director                                      |
+----+--------------------------------+-----------------------------------------------+
|  1 | ショーシャンクの空に           | フランク・ダラボン                            |
|  2 | この世界の片隅に               | 片渕須直                                      |
|  3 | ゴッドファーザー               | フランシス・フォード・コッポラ                |
+----+--------------------------------+-----------------------------------------------+
3 rows in set (0.01 sec)

mysql> exit
Bye
% docker compose down
[+] Running 2/1
 ⠿ Container docker-mysql-hands-on        Removed                                                                                                                   0.8s
 ⠿ Network docker-mysql-hands-on_default  Removed                                                                                                                   0.1s
% docker ps
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES
% docker ps
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES
```
