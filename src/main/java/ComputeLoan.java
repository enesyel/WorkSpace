import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Enter annual interest rate
        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        //Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        //Enter number of years
        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();
        //Enter loan amount
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        //Calculate Payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12))));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);
    }
}
