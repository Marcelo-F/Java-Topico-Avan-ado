import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {
    public static void main(String[] args) {
        NumberFormat nf =CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.Long);

        System.out.println( nf.format(50000));

    }
}
