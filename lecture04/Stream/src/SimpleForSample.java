import java.util.ArrayList;
import java.util.List;

public class SimpleForSample {

    public static void main(String[] args) {

        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> result = new ArrayList<>();

        System.out.println("[シンプルなfor文]名前にaが含まれるかを判定します。");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + "：");
            if (names.get(i).contains("a")) {
                System.out.println(result.add(names.get(i)));
            } else {
                System.out.println("false");
            }

        }
    }
}
