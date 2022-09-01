import java.util.function.Function;

public class Exemplo2 {
    public static void main(String[] args) {
        String str3= "Java tópicos avançados";

        var x = 100;

        Function<String, String> concatena = (var s) -> s.concat(".");
    }
}
