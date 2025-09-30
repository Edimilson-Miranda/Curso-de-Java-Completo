package course.repetitive.enquanto;

import java.util.Scanner;

public class uri1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.println("Informe a senha para ter acesso: ");
        senha = sc.nextInt();
        while (senha != 2002){
            System.out.print("Senha Invalida! Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido! ");
        sc.close();
    }
}
