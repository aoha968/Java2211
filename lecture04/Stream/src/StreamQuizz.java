import java.util.List;
import java.util.stream.Collectors;

public class StreamQuizz {

    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        System.out.println("Listに格納されている名前：" + names);

        List<String> sortedResult = names.stream().sorted().toList();
        System.out.println("アルファベット順に並び替え：" + sortedResult);

        long count = names.stream().filter(name -> name.startsWith("y")).count();
        System.out.println("yで始まる名前が何人いるかをカウント：" + count);

        boolean hasYamada = names.stream().anyMatch(name -> name.equals("yamada"));
        System.out.println("yamadaさんがいるか：" + hasYamada);

        System.out.println("大文字表示に変換してList型に格納：" + names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList()));
    }
}
