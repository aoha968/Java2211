import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("ポケモンを作成します");
        // ポケモンを作成
        List<Pokemon> pokemonList = List.of(new Pokemon("ヒトカゲ",
                                                            List.of("ほのおタイプ"),
                                                            Arrays.asList("ひっかく","ひのこ"),
                                                            "ペェェェヨォォォーーーッッッ"),
                                            new Pokemon("リザード",
                                                            List.of("ほのおタイプ"),
                                                            Arrays.asList("かえんほうしゃ","きりさく","なきごえ"),
                                                            "ベェェェヨォーッ"),
                                            new Pokemon("リザードン",
                                                            Arrays.asList("ほのおタイプ", "ひこうタイプ"),
                                                            Arrays.asList("そらをとぶ","しっぽをふる","つばさでうつ","かみつく"),
                                                            "バァァヴァァァッッ！")
                                            );
        // 作成したポケモンを表示
        for(Pokemon pokemon : pokemonList) {
            System.out.println(pokemon.toString());
        }

        // リザードンの技と鳴き声を更新
        System.out.println("********************************");
        System.out.println("* " + pokemonList.get(2).getName() +"の技と鳴き声を変更します *");
        System.out.println("********************************");
        pokemonList.get(2).setSkill(Arrays.asList("メガトンパンチ","メガトンキック","ほのおのキバ"));
        pokemonList.get(2).setMeow("ドゥワンイン");

        // 作成したポケモンを表示
        for(Pokemon pokemon : pokemonList) {
            System.out.println(pokemon.toString());
        }
    }
}
