package estrutura.repetitivas.enquanto;

import java.util.Scanner;

public class uri1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool, gasolina, diesel, codigo;

        codigo = sc.nextInt();

        alcool = 0;
        gasolina = 0;
        diesel = 0;
        while (codigo != 4){
            if (codigo == 1){
                alcool += 1;
            }
            else if (codigo == 2){
                gasolina += 1;
            }
            else if(codigo == 3) {
                diesel += 1;
            }
            codigo = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
