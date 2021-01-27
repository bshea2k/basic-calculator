//basicCalculator.java
//Shea, Kimborowicz
//Computes basic functions

import java.util.Scanner;

public class basicCalculator {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double numberOne, numberTwo;
      String operator;
      System.out.print("Please enter your first number: ");
      numberOne = input.nextDouble();
      System.out.print("Please enter your second number: ");
      numberTwo = input.nextDouble();
      System.out.print("Please enter your operator in the forms of \"+\", \"-\", \"/\", and \"*\": ");
      operator = input.next();
      
      if (operator.equals("*")){
         System.out.println(numberOne * numberTwo);
      }else if (operator.equals("+")){
         System.out.println(numberOne + numberTwo);
      }else if (operator.equals("-")){
         System.out.println(numberOne - numberTwo);
      }else if (operator.equals("/")){
         System.out.println(numberOne / numberTwo);
      } else
         System.out.println("You did not put in a correct operator");
      
   }
}
