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
      operator = input.nextLine();
      
      if (operator == "*"){
      System.out.println(numberOne * numberTwo);
      }if (operator == "+"){
      System.out.println(numberOne + numberTwo);
      }if (operator == "-"){
      System.out.println(numberOne - numberTwo);
      }if (operator == "/"){
      System.out.println(numberOne / numberTwo);
      }
      
   }
}
