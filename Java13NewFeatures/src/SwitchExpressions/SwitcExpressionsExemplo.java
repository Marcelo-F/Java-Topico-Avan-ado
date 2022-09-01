package SwitchExpressions;

import java.util.Scanner;

public class SwitcExpressionsExemplo {

    public static void main(String[] args) {

        System.out.println("Digite o dia da semana: ");
        Scanner input = new Scanner(System.in);

        String dia = input.nextLine();

        input.close();
        String resultado = switch (dia){
            case "segunda":
                yield "dia útil";  // comando yield substitui o break

            case "terça":
                yield "dia útil";

            case "quarta":
                yield "dia útil";

            case "quinta":
                yield "dia útil";

            case "sexta":
                yield "dia útil";

            case "sabado":
                yield "Final de semana";

            case "doming":
                yield "Final de semana";

            default:
                yield "dia invalido";
        };

        System.out.println(resultado);
    }




}
