package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int codigo1, numeroPeca1, codigo2, numeroPeca2;
        double valorUnitario1, valorUnitario2, sum;


        codigo1 = sc.nextInt();
        numeroPeca1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        numeroPeca2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();

        sum = valorUnitario1 * numeroPeca1 + valorUnitario2 * numeroPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", sum);

        sc.close();
    }
}
