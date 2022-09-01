record Retangulo(double largura,double altura){

        }

public class Records {
    public static void main(String[] args) {
        //Quando o compilador encontra a plavavra o pojo, ele fará
        // a criação de construção, getters, equals, hashCode e toString.
        // Objetivo é minimizar os erros de implementação
        // Não pode estender ou ser estendido
        // Não pode abstratos
        //Não pode haver variaveis de instancia de estrutura
        // Permiti implementar interfaces

        Retangulo r1 = new Retangulo(300.0,200.0);

        System.out.println( r1.altura());
        System.out.println( r1.largura());

    }

}
