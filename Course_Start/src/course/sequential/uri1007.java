package course.sequential;

import java.util.Scanner;

public class uri1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declarando as variaveis para verificar as diferença entre elas.
        int a, b, c, d, soma;

        // solicitado a entrada de dados por usuario computar.
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        // calculando a os dados que foram inserido.
        soma = a * b - c * d;

        //finalizado os calculo mostrar na tela os resultados.
        System.out.println("DIFERENCA  = " + soma);
        sc.close();
    }
}
