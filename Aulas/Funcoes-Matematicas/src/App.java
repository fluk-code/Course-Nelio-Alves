public class App {
    public static void main(String[] args) throws Exception {
        double x, y, z, A, B, C;
        x = 3.0;
        y = 4.0;
        z = -5.0;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadade de " + x + " é " + A);
        System.out.println("Raiz quadade de " + y + " é " + B);
        System.out.println("Raiz quadade de 25 é " + C);


        A = Math.pow(x, y);
        B = Math.pow(y, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " é " + A);
        System.out.println(x + " elevado ao quadrado é " + B);
        System.out.println("5 elevado ao quadrado é " + C);


        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " é " + A);
        System.out.println("Valor absoluto de " + z + " é " + B);


        double a, b, c;
        double X1, X2, bascaraDelta;

        a = 1;
        b = 2;
        c = 3;
        bascaraDelta = Math.pow(b, 2.0) - 4*a*c;
        System.out.println("denta = " + bascaraDelta);

        X1 = ((b * (-1)) + Math.sqrt(bascaraDelta)) / (2.0 * a);
        System.out.println("X1 = " + X1);

        X2 = ((b * (-1)) - Math.sqrt(bascaraDelta)) / (2.0 * a);
        System.out.println("X2 = " + X2);
    }
}
