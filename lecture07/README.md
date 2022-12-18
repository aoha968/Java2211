## 第7回課題
 - 授業で扱った実装例を参考にHTTPメソッドのGET/POST/PATCH/DELETEのリクエストを扱えるControllerを実装しましょう。
 - オリジナルの仕様を加えてみましょう。
    - 例）http://localhost:8080/names?name=koyama のようにクエリ文字列を受け取れるようにする
    - 名前以外にも生年月日を受け取れるよう実装する
    - バリデーションについて調べてnameが空文字、null、20文字以上の場合はエラーとする

### プログラム仕様
 - PostmanからGET/POST/PATCH/DELETEのリクエストを受け付けるプログラムです。
 - GET
    - http://localhost:8080/api/v1/employees を要求すると全てのEmployeeデータを取得します
    - http://localhost:8080/api/v1/employees/(id指定) を要求するとidに紐づいたEmployeeデータを取得します
    - Employeeデータはid,firstName,LastName,emailId で構成
 - POST
    - 以下のようなJSON形式で指定して、http://localhost:8080/api/v1/employees を要求すると登録します
        ```
        {
            "firstName": "Saburou",
            "lastName": "Sato",
            "emailId": "saburoup@gmail.com"
        }
        ```
 - PATCH
     - 以下のようなJSON形式で指定して、http://localhost:8080/api/v1/employees/(id指定) を要求すると更新します
        ```
        {
            "firstName": "Sirou",
            "lastName": "Takagi",
            "emailId": "sirou@gmail.com"
        }
        ```
 - DELETE
    - http://localhost:8080/api/v1/employees/(id指定) を要求すると削除します
 - バリデーション
    - first_name / lastName
        - 空白は受け付けない
        - 20文字以上は受け付けない
    - emailId
        - 空白は受け付けない
        - メール形式でないものは受け付けない(xxx@xxx.xxx)
    - GET/POST/PATCH/DELETE
        - 以下は受け付けずエラーメッセージを返却する
            - 存在しないidを指定
            - 登録済みのメールアドレスをPOST


### 環境変数の設定
以下の環境変数を設定すること
実行 > 実行構成の変数 > 環境変数 で設定します。
```
spring.datasource.url=${SPRING_DATASOURCE_URL}：jdbc:mysql://localhost:3306/データベース名?allowPublicKeyRetrieval=true&useSSL=false
spring.datasource.username=${SPRING_DATASOURCE_USERNAME}：mysqlのユーザー名
spring.datasource.password=${SPRING_DATASOURCE_PASSWORD}：mysqlのパスワード
```
![環境変数](https://user-images.githubusercontent.com/92103678/208294019-d93ce884-1e49-406d-a19d-28e95c88b3fd.png)


### 実行結果
#### 成功
 - GET(全件取得)
<img width="1077" alt="GET(全件取得)" src="https://user-images.githubusercontent.com/92103678/208294134-b804718c-413b-4ef7-9e2e-2353bc330c4e.png">
 - GET(id指定)成功
<img width="1088" alt="GET(id指定)成功" src="https://user-images.githubusercontent.com/92103678/208294135-b3f51a36-7f5c-40ca-ba0c-04a252dbb755.png">
 - POST成功
<img width="1078" alt="POST成功" src="https://user-images.githubusercontent.com/92103678/208294137-8cb67d57-2e61-4ac9-bfb1-416ca74296e0.png">
 - PATCH成功
<img width="1079" alt="PATCH成功" src="https://user-images.githubusercontent.com/92103678/208294131-33d364f3-2b5d-4594-97dd-5f973b1e098e.png">
 - DELETE成功
<img width="1085" alt="DELETE成功" src="https://user-images.githubusercontent.com/92103678/208294128-1dd7a26f-7ba0-4e67-b70a-b89fb3658a1b.png">

#### 失敗
 - GET(id指定)失敗
<img width="1091" alt="GET(id指定)失敗" src="https://user-images.githubusercontent.com/92103678/208294126-8eead1d8-cd61-47be-ae57-a884f4f8d2d2.png">
 - POST(空欄あり)
<img width="1085" alt="POST(空欄あり)" src="https://user-images.githubusercontent.com/92103678/208294132-7cd46286-1a82-475a-84e3-ff6c5c9fdcc9.png">
 - POST(メールアドレス重複)
<img width="1084" alt="POST(メールアドレス重複)" src="https://user-images.githubusercontent.com/92103678/208294136-e69c013a-f126-4231-9b26-28ef4ac72ed0.png">
 - PATCH失敗
<img width="1078" alt="PATCH失敗" src="https://user-images.githubusercontent.com/92103678/208294121-2696d17c-ce23-4f0e-8ab6-bc961a158953.png">
 - DELETE失敗
<img width="1079" alt="DELETE失敗" src="https://user-images.githubusercontent.com/92103678/208294114-00e5a890-1029-4b40-9995-4dc7eb2108bc.png">
