package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1002 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double t, area, raio;

        raio = sc.nextDouble();

        t = 3.14159;

        area = t * raio * raio;

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
