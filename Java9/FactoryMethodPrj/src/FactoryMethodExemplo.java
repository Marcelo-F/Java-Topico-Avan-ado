import java.util.List;
import java.util.Set;

public class FactoryMethodExemplo {
    public static void main(String[] args) {
        //Set não pode aceitar dados repetidos e os inserts não são feitos necessariamente na ordem que se esta na lista.
        //Set<String> lista = Set.of("Banana", "maça", "Pera", "Banana","maça", "Pera"); //Erro
        Set<String> lista = Set.of("Banana", "maça", "Pera"); //sucesso

        for (String s : lista){
            System.out.println(s);
        }
    }
}
