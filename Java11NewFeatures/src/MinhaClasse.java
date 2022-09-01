import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MinhaClasse {
    public static void main(String[] args) {
        String str1= "";
        String str2= "";
        String str3= "Java tópicos avançados";
        String str4= "Java \n tópicos \n avançados";
        String str5= "Java  tópicos  avançados";

        //isblank() retorna false ou true para string vazia
        //lines() retornar string colocando o collect e collector.toList ele traz o valor dessa string sem a quebra das linhas
        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());
        System.out.println(str3.isBlank());
        System.out.println(str4.lines().collect(Collectors.toList()));
        System.out.println(str5.repeat(3));



    }
}
