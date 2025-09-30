package course.conditional;

import java.util.Scanner;

public class multiplosUri1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        if (x % y == 0 || y % x == 0){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
}
