import java.util.Locale;
import java.util.Scanner;

public class ScannerResearch {

    public static void scannerRe(){

        String s = "gfg 2 geeks!";

        // new scanner with the
        // specified String Object
        Scanner scanner = new Scanner(System.in);

        // use US locale to interpret Ints in a string
        scanner.useLocale(Locale.US);

        // iterate till end
        while (scanner.hasNext()) {

            // check if the scanner's
            // next token is a Int with a radix 3
            System.out.print("" + scanner.hasNextInt(3));

            // print what is scanned
            System.out.print(" -> " + scanner.next() + "\n");
        }

        // close the scanner
        scanner.close();
    }
}
