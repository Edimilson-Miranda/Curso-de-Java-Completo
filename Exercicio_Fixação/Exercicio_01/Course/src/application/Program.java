package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;
/*
    Fazer um programa para ler os valores da largura e altura de retângulo.
    Em seguida, mostrar na tela o valor de sua área, perímentro e diagonal.
    Usar uma classe como mostrado.
------------------------------------------
               Rectangle
 ------------------------------------------
             -Width: double
             -Height: double
------------------------------------------
             +Area(): double
             +Perimeter(): double
             +Diagonal(): double
-------------------------------------------
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(); // chamado a classe Rectangle.
        System.out.println("Enter rectangle width and height: "); // solicitando  a entrada de dados do programar
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        // formatando a saída de dados para ter duas casa decimal após o ponto.
        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
