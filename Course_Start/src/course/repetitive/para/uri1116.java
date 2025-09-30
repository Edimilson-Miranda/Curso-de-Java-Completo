package course.repetitive.para;

import java.util.Locale;
import java.util.Scanner;

public class uri1116 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double x, y, divisao;
        for (int i = 0; i < N; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();


            if (y == 0){
                System.out.println("divisao impossivel");
            }
            else {
                divisao = x / y;

                System.out.println(divisao);
            }
        }
        sc.close();
    }
}
