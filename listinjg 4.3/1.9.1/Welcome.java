import java.util.Scanner; 2 3public class ComputeLoan { 4public static void main(String[] args) { 5// Create a Scanner 6      Scanner input = new Scanner(System.in); 7 8// Enter annual interest rate in percentage, e.g., 7.25% 9      System.out.print("Enter annual interest rate, e.g., 7.25%: ");10double annualInterestRate = input.nextDouble();1112// Obtain monthly interest rate13double monthlyInterestRate = annualInterestRate / 1200;1415// Enter number of years16      System.out.print(17"Enter number of years as an integer, e.g., 5: ");18int numberOfYears = input.nextInt();1920// Enter loan amount21      System.out.print("Enter loan amount, e.g., 120000.95: ");22double loanAmount = input.nextDouble();2324// Calculate payment25doublemonthlyPayment = loanAmount * monthlyInterestRate / (126        - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));