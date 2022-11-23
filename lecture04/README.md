## 第4回課題
 - Streamを自分でも試してみましょう
 - デバッガーをつかってみましょう
 - 授業で使ったサンプルを利用してOKです
    - [Streamのサンプルコード](https://github.com/raisetech-for-student/stream-sample)
    - [デバッグのサンプルコード](https://github.com/raisetech-for-student/debug-sample)

### Stream
 - サンプルコードを利用してStreamの動きを確認
 - サンプルコードの一部を変更してターミナルに出力するように変更

### 出力結果
EnhancedForSample.java
```
[拡張for文]名前にaが含まれるかを判定します。
yamada：true
tanaka：true
yasuda：true
suzuki：false
iida：true
```
MethodReference.java
```
*** ラムダ式で実装 ***
YAMADA
TANAKA
YASUDA
SUZUKI
IIDA
*** Stream処理でメソッド参照する ***
YAMADA
TANAKA
YASUDA
SUZUKI
IIDA
```
SimpleForSample.java
```
[シンプルなfor文]名前にaが含まれるかを判定します。
yamada：true
tanaka：true
yasuda：true
suzuki：false
iida：true
```
StreamQuizz.java
```
Listに格納されている名前：[yamada, tanaka, yasuda, suzuki, iida]
アルファベット順に並び替え：[iida, suzuki, tanaka, yamada, yasuda]
yで始まる名前が何人いるかをカウント：2
yamadaさんがいるか：true
大文字表示に変換してList型に格納：[YAMADA, TANAKA, YASUDA, SUZUKI, IIDA]
```
StreamSample.java
```
aを含む名前を持つ人：[yamada, tanaka, yasuda, iida]
```


### デバッガー
 - サンプルコードを利用してデバッガを使用
 - ブレークポイント, ステップイン、ステップアウト、ステップオーバーを試行
 - また、上記実行時の変数の変化も確認

### 出力結果
ErrorMessageReadingSample.java
※nullをtoUpperCase（大文字変換）しているため、エラー発生。
```
null
TAKAHASHI
YAMAMOTO
NAKAMURA
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "name" is null
	at ErrorMessageReadingSample.main(ErrorMessageReadingSample.java:14)
```
ForLoop.java
```
**
****
******
********
**********
************
sumが30を超えたため処理を中断します。
```
