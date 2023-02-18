## 最終課題
 - CRUD機能をもったREST APIを作成してください

### Pokedex Application
 - https://github.com/aoha968/Java202211-final

### 環境
 - JDK:17
 - Docker:3.8
 - Spring Boot:3.0.1
    - Dependencies
        - Spring Web
        - Lombok
        - Spring Boot DevTools
        - Spring Security
        - MySQL Driver
        - Spring Data JPA
        - Thymeleaf
        - MyBatis Framework
        - Validation
    - Warning対策として以下も追加
        - org.apache.logging.log4j:log4j-core:2.19.0
        - org.apache.logging.log4j:log4j-api:2.19.0
        - org.springframework.ldap:spring-ldap-core
        - org.springframework.security:spring-security-ldap
        - com.unboundid:unboundid-ldapsdk
        - org.springframework.boot:spring-boot-starter-oauth2-client

### 起動手順
 ```
 % docker compose up --build
 IntelliJ からPokeApplication.java を実行
 ```
 Started PokeApplication が表示されてから、`http://localhost:8080`にアクセスすること

 ### 停止手順
 ```
 % docker compose down
 % docker volume rm pokepb_my-vol
 ```

### Swagger
 - `localhost:8001` でSwagger Editorを起動する。
 Swagger EditorはSwagger UIで表示するためのymlを作成するためのツール。ブラウザ上で編集・保存・記載した内容をリアルタイムで反映できる。
 - `localhost:8002` でSwagger UIを起動する。ymlで記載した内容を表示できる。

### プログラム仕様
 - `localhost:8080`でApplicationを起動する。
 - REST APIを定義するための仕様はopenapi.yml に記載。Swagger UIでも確認可能。

### テスト
#### 起動手順
```
 % docker-compose -f docker-compose-test.yml up --build
```
上記コマンドで起動後にtestフォルダを選択して右クリック >  カバレッジ付き実行 からテストを実行します。
![カバレッジ付き実行](https://user-images.githubusercontent.com/92103678/216756084-44e72fc1-8241-44c6-9e3d-9215066b8ad4.png")

#### 停止手順
```
 % docker compose down
 % docker volume rm pokepb_my-vol
```

### 制約事項
機能やデザイン面を考慮すればするほど沼にハマるため、最低限動作する程度の実装としています。
 - ログイン/ログアウト機能はお試し版のため、2段階認証やパスワードの制約は実施しない
 - 画面レイアウトのデザイン面(表示崩れなど)は担保しない。
 - ログイン/ログアウト機能は以下の理由によりテストを対象外とする
    - おまけ機能の位置付け
    - 現状のログイン/ログアウト機能として不十分であること

 ### 注意事項
 - 本アプリケーションは学習を目的としています。
 - 商用利用不可・二次利用不可の画像を使用しているため、学習目的の用途以外で使用しないこと
