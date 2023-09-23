public class App {
    public static void main(String[] args) throws Exception {
        int a, b;
        double resultadoCasting;
        double resultado;

        a = 5;
        b = 2;

        resultado =  a / b;
        resultadoCasting = (double) a / b;

        System.out.printf("resultado cating double = %f", resultadoCasting);
        System.out.println("");
        System.out.printf("resultado cating double = %f", resultado);
        System.out.println("");

        double c;
        int d;

        c = 5.25;
        d = (int) c;
        System.out.println(d);
    }
}
