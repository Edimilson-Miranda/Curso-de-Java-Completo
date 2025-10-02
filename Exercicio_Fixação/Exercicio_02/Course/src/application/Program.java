package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

/*
        Exercicio 2
    
    Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
    Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida,aumentar
    o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado
    pela porcentagem) e mostrar novamente os dados do funcionário.Use a classe projetada.

    -------------------------------------------
               Employee
    -------------------------------------------
             -name: String
          -grossSalary: double
              -tax: double
    --------------------------------------------
            +netSalary: double
    +increaseSalary(percentage : double) : void
    ---------------------------------------------
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employer = new Employee();
        System.out.print("Name: ");
        employer.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employer.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employer.tax = sc.nextDouble();

        System.out.println("Employee: " + employer);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employer.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employer);
        sc.close();
    }
}
