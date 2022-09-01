import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class LeArquivos {
    public static void main(String[] args) {
        String caminho = "meutexto.txt";


//        try(FileReader myReader = new FileReader(caminho)){
//            int i;
//
//            while((i=myReader.read())!= -1)
//                System.out.println((char)i);
//        }catch (IOException e){
//
//        }
//
//
//        try(BufferedReader bufferedWriter = new BufferedReader(new FileReader(caminho))){
//            String s;
//            while((s = bufferedWriter.readLine())!= null)
//                System.out.println(s);
//
//        }catch (IOException e){
//
//        }
//
        try {
            String s = Files.readString(new File(caminho).toPath(), StandardCharsets.ISO_8859_1);
            System.out.print(s);
        } catch (IOException e) {
            System.out.println(e);
        }

    }


}
