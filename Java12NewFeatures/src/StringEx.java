public class StringEx {
    public static void main(String[] args) {
        String text = "Olá mundo!\n Este é o módulo Java 12";

        //Adiciona 4 espaço em branco
        text = text.indent(4);

        System.out.print(text);

        //Remove 1 espaço em branco

        text = text.indent(-1);

        System.out.print(text);


        String textoInvertido = text.transform(s -> new StringBuilder(s).reverse().toString());

        System.out.println(textoInvertido);
    }
}
