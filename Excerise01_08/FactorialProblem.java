FactorialProblem.java

import java.util.Scanner;
import java.math.BigInteger;
// import Scanner class and BigInteger as factorials are very large numbers.

class FactorialExample {  
    public static void main(String args[]) {  
        // Prompt that user will see on the screen
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative number, please");
        int number = scanner.nextInt();

        // Now the system needs to check and see if the number entered by the user is negative or positive. 
        // Factorials cannot be negative 
        // Use an if/else statement 
        if (number < 0) {
            System.out.println("Factorials cannot be negative, please try again.");
        } else {
            BigInteger factorial = BigInteger.ONE;
            // Created BigInteger variable called factorial and set it to equal 1 as 0! = 1 

            // The for statement is only if the number is non-negative, now we can calculate the factorial
            for (int i = 1; i <= number; i++) {
                // this line of code takes the current factorial and multiplies it by the current number and saves the value in the variable factorial
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            // Print the result inside the else block so factorial is in scope
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }  
}