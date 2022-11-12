public class Main {
    public static void main(String[] args) {
        // 変数定義
        String split = "--------------------------------------";
        String greeting = "Hello world!";
        String blessing = "RaiseTech 受講生1500人突破 おめでとう！";

        System.out.println(split);
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println(greeting);
            }else{
                System.out.print(greeting + ", ");
            }
            if(i == 10){
                System.out.println(split);
                System.out.println(blessing);
                System.out.println(split);
            }
        }
    }
}
