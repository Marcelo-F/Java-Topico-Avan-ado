import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExemplo {
    public static void main(String[] args) throws IOException {
        TryCatchExemplo.lerArquivoCOmBlocoTryCatchFinnaly("file.txt");
        TryCatchExemplo.leArquivoBLocoTryComRecurso("file.txt");
        TryCatchExemplo.leArquivoBLocoTryComRecursoJava9("file.txt");
    }

    //antes do java 7
    public static void lerArquivoCOmBlocoTryCatchFinnaly(String path) throws IOException {
        System.out.println("Chamando função de exemplo a ANTES do java 7");
        String linha ="";
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            while((linha = br.readLine())!= null){
                System.out.println(linha);
            }
        }
        catch (IOException e){
            throw e;
        }
        finally {
            if(br != null){
                br.close();
            }
        }
        System.out.println("Finalizando função de exemplo a ANTES do java 7");
    }

    // A partir do java 7
    public static void leArquivoBLocoTryComRecurso(String path) throws IOException {

        System.out.println("Chamando função de exemplo a partir do java 7");
        String linha = "";

        try (BufferedReader br = new BufferedReader( new FileReader(path))){
            while ((linha = br.readLine())!= null){
                System.out.println(linha);
            }
        }

        System.out.println("Finalizando função de exemplo a partir do java 7");
    }


    // A partir do java 9
    public static void leArquivoBLocoTryComRecursoJava9(String path) throws IOException {
        System.out.println("Chamando função de exemplo a partir do java 9");
        String linha = "";

        BufferedReader br = new BufferedReader( new FileReader(path));

        try (br){
            while ((linha = br.readLine())!= null){
                System.out.println(linha);
            }
        }

        System.out.println("Chamando função de exemplo a partir do java 9");
    }
}
