## 第6回課題
 - Spring Bootを使って画面にHello Worldを表示してみる
 - 作成したソースコードをGitHubにpushする
 - Hello Worldを表示したプロジェクトに自分で考えた変更を加えてみる
    - 例：リクエストで受け取った国（japan、us、france、korea）ごとに出すメッセージをかえる
    - 例：現在時刻を表示する
 - 自分で考えた変更を新しいブランチでにコミットして、GitHubにpushする
 - GitHub上でPull Requestを作ってみる

### プログラム仕様
 - http://localhost:8080/hello アクセス時に"hello world"と表示する
 - http://localhost:8080/current-time?area="クエリパラメータ" アクセス時にクエリパラメータの現在時刻を表示する
 - "現在の[クエリパラメータ]の日時はYYYY/MM/DD HH:MM" の形式で表示

#### クエリパラメータ仕様
 - "japan", "europe", "los_angeles", "new_york", "hawai" のパラメータを指定可能
 - 小文字、大文字を含んだ文字列でも動作可能
    - 例）Los_Angels, euRoPe など
 - 指定範囲外のクエリパラメータを指定した場合は日本時間を表示
