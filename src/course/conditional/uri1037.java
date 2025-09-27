package course.conditional;

import java.util.Locale;
import java.util.Scanner;

public class uri1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double codigo;

        codigo = sc.nextDouble();
        if (codigo < 0 || codigo > 100.0){
            System.out.println("Fora de Intervalo");
        }
        else if (codigo <= 25.0){
            System.out.println("Intervalo [0,25] ");
        }
        else  if (codigo <= 50.0){
            System.out.println("Intervalo [25,50]");
        }
        else if (codigo < 75.0){
            System.out.println("Intervalo [50,75]");
        }
        else{
            System.out.println("Intervalo [75,100]");
        }

        sc.close();
    }
}
