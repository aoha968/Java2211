import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String name;        // 名前
    private List<String> types;  // タイプ
    private List<String> skills; // 技
    private String meow;        // 鳴き声

    public Pokemon(String name, List<String> types, List<String> skills, String meow) {
        this.name = name;
        this.types = types;
        this.skills = skills;
        this.meow = meow;
    }

    public String getName() {
        return name;
    }

    public List<String> getType() {
        return types;
    }

    public List<String> getSkill() {
        return skills;
    }

    public void setSkill(List<String> skills) {
        this.skills = skills;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    @Override
    public String toString(){
        return  """
                作成したポケモンは以下のようになりました
                名称：%s
                タイプ：%s
                技：%s
                なきごえ：%s
                ---------------------------------\
                """.formatted(name, types, skills, meow);
    }
}
