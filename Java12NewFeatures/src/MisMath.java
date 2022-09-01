import java.io.File;
import java.nio.file.Files;

public class MisMath {
    public static void main(String[] args) {
        File f1= new File("texto1.txt");
        File f2= new File("texto2.txt");


       long resultado =  Files.mismatch(f1.toPath(),f2.toPath());

       System.out.println(resultado);
    }
}
