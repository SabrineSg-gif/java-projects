import java .util.Scanner;
public class Main {
    public static void main (String[]args){

        //coumpound interests calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCoumpounded;
        int years;
        double amount;


        System.out.print("Enter the principal amount:");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate in (%):");
        rate =scanner.nextDouble() /100 ;

        System.out.print("Enter the number of times compounded per year  :");
        timeCoumpounded =scanner.nextInt();

        System.out.print("Enter the number of years:");
        years =scanner.nextInt();

        amount = principal* Math.pow(1+rate/timeCoumpounded,timeCoumpounded*years);

        System.out.printf("The amount after %d years is $%.2f",years,amount);

        scanner.close();




    }

}
