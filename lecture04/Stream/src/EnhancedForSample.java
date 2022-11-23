import java.util.ArrayList;
import java.util.List;

public class EnhancedForSample {

    public static void main(String[] args) {

        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> result = new ArrayList<>();

        System.out.println("[拡張for文]名前にaが含まれるかを判定します。");
        int nameIndex = 0;
        for (String name : names) {
            System.out.print(names.get(nameIndex++) + "：");
            if (name.contains("a")) {
                System.out.println(result.add(name));
            } else {
                System.out.println("false");
            }
        }
    }
}
