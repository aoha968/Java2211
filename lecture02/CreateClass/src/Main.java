import java.util.Arrays;
import java.util.List;

public class Main {
    public static void changeSkill(List<Pokemon> pokemonList, List<String> skill, int index) {
        if(pokemonList.size() > index) {
            pokemonList.get(index).setSkill(skill);
        }
    }

    public static void changeMeow(List<Pokemon> pokemonList, String meow, int index) {
        if(pokemonList.size() > index) {
            pokemonList.get(index).setMeow(meow);
        }
    }

    public static void printMessage(List<Pokemon> pokemonList) {
        System.out.println("---------------------------------");
        for(Pokemon pokemon : pokemonList) {
            System.out.println("作成したポケモンは以下のようになりました");
            System.out.println("名称：" + pokemon.getName());
            System.out.println("タイプ：" + pokemon.getType());
            System.out.println("技：" + pokemon.getSkill());
            System.out.println("なきごえ：" + pokemon.getMeow());
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("ポケモンを作成します");
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
        printMessage(pokemonList);

        System.out.println("********************************");
        System.out.println("* " + pokemonList.get(2).getName() +"の技と鳴き声を変更します *");
        System.out.println("********************************");
        changeSkill(pokemonList, Arrays.asList("メガトンパンチ","メガトンキック","ほのおのキバ"),2);
        changeMeow(pokemonList, "ドゥワンイン",2);

        printMessage(pokemonList);

    }
}
