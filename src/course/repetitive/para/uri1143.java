package course.repetitive.para;

import java.util.Scanner;

public class uri1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){

            int one = i;
            int two = i * i;
            int three = i * i * i;

            System.out.printf("%d %d %d%n", one, two, three);
        }
        sc.close();
    }
}
