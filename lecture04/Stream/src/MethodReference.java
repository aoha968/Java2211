import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        System.out.println("*** ラムダ式で実装 ***");
        names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));

        System.out.println("*** Stream処理でメソッド参照する ***");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
