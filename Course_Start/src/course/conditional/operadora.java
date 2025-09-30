package course.conditional;

import java.util.Locale;
import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minuts;

        minuts = sc.nextInt();

        double sum = 50.0;
        if (minuts > 100){
            sum += (minuts - 100) * 2.0;
        }
        System.out.printf("Valor da conta  = R$ %.2f%n", sum);


        sc.close();
    }
}
