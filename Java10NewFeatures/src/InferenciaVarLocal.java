import java.util.List;

public class InferenciaVarLocal {
    public static void main(String[] args) {
        //Regras
        // Só pode ser utilizado em cenarios em que a variavel é local e quando se inicia a variavel;
        // Pode ser utilizado em for

        var a1 ="Programando em"; // Local e inicializida
        String a2 = " Java";

        System.out.println(a1+a2);


        var listaDeFrutas = List.of("Banana", "Maça", "Abacaxi");

        //Enhaced for
        for (var fruta: listaDeFrutas){
            System.out.println(fruta);
        }

        //Laço tradicional
        for (var i=0; i< listaDeFrutas.size(); i++){
            System.out.println(listaDeFrutas.get(i));
        }

        ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();

        var ex = new ArrayIndexOutOfBoundsException();  // Com var fica com o código mais  enxuto e simplificado


    }
}
