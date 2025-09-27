package course.sequential;

import java.util.Locale;
import java.util.Scanner;

public class uri1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary, hour, sum;
        int number;

        number = sc.nextInt();
        hour = sc.nextDouble();
        salary = sc.nextDouble();

        sum = hour * salary;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", sum);

        sc.close();
    }
}
