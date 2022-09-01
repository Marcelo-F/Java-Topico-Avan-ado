import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Digite o dia da semana: ");
        Scanner input = new Scanner(System.in);

        String dia = input.nextLine();

        input.close();
        String resultado ="";
//      Modo antigo

//        switch (dia){
//            case "segunda":
//                resultado = "dia útil";
//                break;
//            case "terça":
//                resultado = "dia útil";
//                break;
//            case "quarta":
//                resultado = "dia útil";
//                break;
//            case "quinta":
//                resultado = "dia útil";
//                break;
//            case "sexta":
//                resultado = "dia útil";
//                break;
//            case "sabado":
//                resultado = "Final de semana";
//                break;
//            case "doming":
//                resultado = "Final de semana";
//                break;
//            default:
//                resultado ="dia invalido";
//        }

        // Modo com Switch Expression
        System.out.println(resultado);
        resultado = switch (dia){
            case "segunda", "terça","quarta", "quinta","sexsta" ->"dia útil";
            case "sabado","domingo" ->"Fim de semana";
            default -> "dia invalido";
        };
    }

}
