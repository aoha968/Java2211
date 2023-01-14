## 第9回課題
 - MyBatisでたとえば、以下のようなR（Read）の実装をしてみましょう。あくまでも例ですので自分で仕様を考えて実装してもOKです。
 - `localhost:8080/names` にアクセスするとDBに登録されている名前をレスポンスとして返す。
```
[
    "koyama",
    "tanaka",
    "suzuki"
]
``` 
 - `localhost:8080/movies?published_year=2000` にアクセスするとDBに登録されている映画から2000年に
公開された映画をレスポンスとして返す。
```
[
     "アルマゲドン",
    "トイ・ストーリー2"
]
```

### プログラム仕様
 - `localhost:8080/names` にアクセスするとDBに登録されている名前をレスポンスとして返却する
 - `localhost:8080/movies` にアクセスするとDBに登録されている映画リスト(id、name, publishedYear)をレスポンスとして返却する
 - `localhost:8080/movies/searchPublishedYear?year={公開された年}` にアクセスするとDBに登録されている映画名をレスポンスとして返却する
 - `localhost:8080/movies/searchPublishedYear?year={公開された年}` で映画名がない場合は空で返却する

### 実行結果
 - `localhost:8080/names`
 ```
[
    "koyama",
    "tanaka"
]
 ```
 - `localhost:8080/movies`
 ```
[
    {
        "id": 1,
        "name": "名探偵コナン 時計じかけの摩天楼",
        "publishedYear": 1997
    },
    {
        "id": 2,
        "name": "名探偵コナン 14番目の標的",
        "publishedYear": 1998
    },
    {
        "id": 3,
        "name": "名探偵コナン 世紀末の魔術師",
        "publishedYear": 1999
    },
    {
        "id": 4,
        "name": "名探偵コナン 瞳の中の暗殺者",
        "publishedYear": 2000
    },
    {
        "id": 5,
        "name": "名探偵コナン 天国へのカウントダウン",
        "publishedYear": 2001
    },
    {
        "id": 6,
        "name": "名探偵コナン ベイカー街の亡霊",
        "publishedYear": 2002
    },
    {
        "id": 7,
        "name": "名探偵コナン 迷宮の十字路",
        "publishedYear": 2003
    },
    {
        "id": 8,
        "name": "名探偵コナン 銀翼の奇術師",
        "publishedYear": 2004
    },
    {
        "id": 9,
        "name": "名探偵コナン 水平線上の陰謀",
        "publishedYear": 2005
    },
    {
        "id": 10,
        "name": "名探偵コナン 探偵たちの鎮魂歌",
        "publishedYear": 2006
    },
    {
        "id": 11,
        "name": "名探偵コナン 紺碧の棺",
        "publishedYear": 2007
    },
    {
        "id": 12,
        "name": "名探偵コナン 戦慄の楽譜",
        "publishedYear": 2008
    },
    {
        "id": 13,
        "name": "名探偵コナン 漆黒の追跡者",
        "publishedYear": 2009
    },
    {
        "id": 14,
        "name": "名探偵コナン 天空の難破船",
        "publishedYear": 2010
    },
    {
        "id": 15,
        "name": "名探偵コナン 沈黙の15分",
        "publishedYear": 2011
    },
    {
        "id": 16,
        "name": "名探偵コナン 11人目のストライカー",
        "publishedYear": 2012
    },
    {
        "id": 17,
        "name": "名探偵コナン 絶海の探偵",
        "publishedYear": 2013
    },
    {
        "id": 18,
        "name": "名探偵コナン 異次元の狙撃手",
        "publishedYear": 2014
    },
    {
        "id": 19,
        "name": "名探偵コナン 業火の向日葵",
        "publishedYear": 2015
    },
    {
        "id": 20,
        "name": "名探偵コナン 純黒の悪夢",
        "publishedYear": 2016
    },
    {
        "id": 21,
        "name": "名探偵コナン から紅の恋歌",
        "publishedYear": 2017
    },
    {
        "id": 22,
        "name": "名探偵コナン ゼロの執行人",
        "publishedYear": 2018
    },
    {
        "id": 23,
        "name": "名探偵コナン 紺青の拳",
        "publishedYear": 2019
    },
    {
        "id": 25,
        "name": "名探偵コナン 緋色の弾丸",
        "publishedYear": 2021
    },
    {
        "id": 26,
        "name": "名探偵コナン ハロウィンの花嫁",
        "publishedYear": 2022
    },
    {
        "id": 27,
        "name": "名探偵コナン 黒鉄の魚影",
        "publishedYear": 2023
    }
]
 ```
  - `localhost:8080/movies/searchPublishedYear?year=1997`
 ```
[
    "名探偵コナン 時計じかけの摩天楼"
]
 ```
 - `localhost:8080/movies/searchPublishedYear?year=1996`
 ```
[]
 ```
