package course.conditional;

import java.util.Locale;

public class ternaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        /* if (preco < 20.0){
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.05;
        }*/
        System.out.println(desconto);
    }
}
