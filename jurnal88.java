
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jurnal88 {

   
   public static void main(String[] args) throws IOException {
      BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int banyakBilangan = 0;
        int a = 1;
        int b = 1;
        int c;
        int i;
        System.out.print("Input = ");
        try {
            input = dataInput.readLine();
            banyakBilangan = Integer.parseInt(input);
        } catch (NumberFormatException error) {
            System.out.println("Error !!");
        }
        System.out.print("Output = " + a + " " + b + " ");
        for (i = 0; i < banyakBilangan - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("");
    }
}