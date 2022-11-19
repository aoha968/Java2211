import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String name;        // 名前
    private List<String> type;  // タイプ
    private List<String> skill; // 技
    private String meow;        // 鳴き声

    public Pokemon(String name, List<String> type, List<String> skill, String meow) {
        this.name = name;
        this.type = type;
        this.skill = skill;
        this.meow = meow;
    }

    public String getName() {
        return name;
    }

    public List<String> getType() {
        return type;
    }

    public List<String> getSkill() {
        return skill;
    }

    public void setSkill(List<String> skill) {
        this.skill = skill;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }
}
