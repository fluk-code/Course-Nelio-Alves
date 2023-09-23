import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // // Leitura de string
        // String x;
        // x = sc.next();
        // System.out.println("Voce digitou: " + x);

        // //  Leitura de int
        // int y;
        // y = sc.nextInt();
        // System.out.println("Voce digitou: " + y);

        // //  leitura de double
        // double z;
        // z = sc.nextDouble();
        // System.out.printf("Voce digitou: %.2f%n", z);

        // //  leitura de character
        // char c;
        // c = sc.next().charAt(0);
        // System.out.println("Voce digitou: " + c);

        // // Ler varios dados na msma linha
        // x = sc.next();
        // y = sc.nextInt();
        // z = sc.nextDouble();

        // System.out.println("Voce digitou: ");
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

        
        //  Leitura até a quebra de lina
        int x;
        String s1, s2, s3;
        
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
