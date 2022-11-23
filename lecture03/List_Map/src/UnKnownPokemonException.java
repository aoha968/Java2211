public class UnKnownPokemonException extends Exception{
    private String code;     //独自エラーコード
    private String message;  //独自エラーメッセージ
    UnKnownPokemonException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
