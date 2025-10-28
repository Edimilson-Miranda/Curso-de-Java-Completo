package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;


/*
    Fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informando o valor
    de deposito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta
    após cada operação.

    ---------------------------------------------
                     Account
    ---------------------------------------------
                 - number:Int
                 -holder: String
                 -balance: Double
    ----------------------------------------------
          + deposit(amount: double): void
          + withdraw(amount: double): voide
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char choose = sc.next().charAt(0);
        if (choose == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(number, holder, initialDeposit);
        }
        else {
            bankAccount = new BankAccount(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);
        sc.close();
    }
}
