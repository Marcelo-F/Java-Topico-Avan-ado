import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class EscreveArquivo {
    public static void main(String[] args) {
        String caminho ="meutexto.txt";
        String meuTexto="Curso Java Tópicos Avançados";


//
//        try(FileWriter myWriter = new FileWriter(caminho)){
//            myWriter.write(meuTexto);
//
//        }catch (IOException e){
//
//        }

//        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminho))){
//            bufferedWriter.write(meuTexto);
//        }catch (IOException e){
//
//        }

        try {
            Files.writeString(new File(caminho).toPath(), meuTexto, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
