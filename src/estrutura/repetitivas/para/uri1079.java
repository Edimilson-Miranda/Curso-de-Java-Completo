package estrutura.repetitivas.para;

import java.util.Locale;
import java.util.Scanner;

public class uri1079 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double a, b, c, media;
        for (int i = 0; i < N; i++){
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            media = (a * 2.0 + b * 3.0 + c * 5.0) /10;

            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
