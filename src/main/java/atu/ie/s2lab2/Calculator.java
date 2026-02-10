package atu.ie.s2lab2;
/* I need to send 2 numbers and select the type of calculation I want to make.
 * I must receive the result of the operation
 * HOw am I going to do this?*/

import org.springframework.stereotype.Service;

/* Here I'm going to handle all the calculations */

@Service
public class Calculator {
//Are this functions?
//Should I add addition, subtraction etc. as fields?
    public double add(double firstNumber, double secondNumber)
   {
    return firstNumber + secondNumber;
   }
   public double subtract(double firstNumber, double secondNumber)
   {
    return firstNumber - secondNumber;
   }
   public double multiply(double firstNumber, double secondNumber)
   {
    return firstNumber * secondNumber;
   }
   public double divide(double firstNumber, double secondNumber)
   {
    return firstNumber / secondNumber;
   }
}
