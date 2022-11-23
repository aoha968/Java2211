import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.printf("""
                ---------------------------
                +      String型のList      +
                ---------------------------
                """);
        List<String> pokemonList = new ArrayList<>();

        pokemonList.add("ヒポポタス");
        pokemonList.add("ドクケイル");
        pokemonList.add("ヤルキモノ");
        pokemonList.add("グラードン");
        pokemonList.add("ふしぎなタマゴ");
        pokemonList.add("なぞのタマゴ");

        System.out.println("あなたの手持ちのポケモンを表示");
        try {
            pokemonList.forEach(System.out::println);

            // 手持ちできる数を超える
            System.out.println("*** ７匹目のポケモンを表示させる ***");
            System.out.println(pokemonList.get(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("*** 所持できるポケモンは６匹まで！ ***");
        }

        System.out.printf("""
                ---------------------------
                +      String型のMap       +
                ---------------------------
                """);
        Map<String, String> pokemon = new HashMap<>();

        pokemon.put("ピジョット", "エサを 探すとき 水面 すれすれを 滑るように 飛んで コイキングなどを わしづかみにする。");
        pokemon.put("スターミー", "きかがくてきな ボディーから うちゅうせいぶつ ではないかと じもとでは うたがわれている。");
        pokemon.put("イシツブテ", "まるくて もちやすいので つかんで あいてに なげて ぶつける イシツブテ がっせんが できる。");
        pokemon.put("ユンゲラー", "あるあさのこと。 ちょうのうりょく しょうねんが ベッドから めざめると ユンゲラーに へんしん していた。");
        pokemon.put("カイリュー", "大きな 体格で 空を 飛ぶ。地球を 約16時間で 1周してしまう。");

        System.out.println("ポケモンの図鑑説明を表示");
        System.out.println("ピジョットの図鑑説明：" + pokemon.get("ピジョット"));
        System.out.println("スターミーの図鑑説明：" + pokemon.get("スターミー"));
        System.out.println("イシツブテの図鑑説明：" + pokemon.get("イシツブテ"));
        System.out.println("ユンゲラーの図鑑説明：" + pokemon.get("ユンゲラー"));
        System.out.println("カイリューの図鑑説明：" + pokemon.get("カイリュー"));

        try {
            // 強制的にUnKnownPokemonExceptionの例外を発生させる
            System.out.println("*** 未知のポケモンの図鑑説明を表示させる ***");
            System.out.println("*** UnKnownPokemonException例外処理開始 ***");
            throw new UnKnownPokemonException("E0001", "未知のポケモンです。");
        } catch (UnKnownPokemonException ex) {
            // UnKnownPokemonException発生時
            System.out.println(ex.getCode() + ":" + ex.getMessage());   // 独自エラーコード/メッセージを表示
        } finally {
            System.out.println("*** UnKnownPokemonException例外処理終了 ***");
        }
    }
}
