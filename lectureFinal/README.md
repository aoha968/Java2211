## 最終課題
 - CRUD機能をもったREST APIを作成してください

### Pokedex Application
 - https://github.com/aoha968/Java202211-final

### 起動手順
 ```
 % docker compose up --build
 IntelliJ からPokeApplication.java を実行
 ```

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

### 制約事項
機能やデザイン面を考慮すればするほど沼にハマるため、最低限動作する程度の実装としています。
 - ログイン/ログアウト機能はお試し版のため、2段階認証やパスワードの制約は実施しない
 - 画面レイアウトのデザイン面(表示崩れなど)は担保しない。

 ### 注意事項
 - 本アプリケーションは学習を目的としています。
 - 商用利用不可・二次利用不可の画像を使用しているため、学習目的の用途以外で使用しないこと
