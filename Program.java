//import stuff here
import java.util.Scanner;
import java.lang.Math.*;    
//Your code here
public class Program8 {
    public static void main (String [] args){
    Scanner myScanner = new Scanner (System.in);
    int number1 = 0;
    int number2 = 0;
    
    System.out.println("Enter number 1: ");
    number1 = myScanner.nextInt();
    System.out.println("Enter number 2: ");
    number2 = myScanner.nextInt();
    
    int sum = number1 + number2;
    System.out.println("The sum is " + sum);
    
    int difference = number1 - number2;
    System.out.println("The difference is " + difference);
    
    
    int product = number1*number2;
    System.out.println("The product is " + product);
    
    double average = (number1+number2)/2;
    System.out.println("The average is " + average);
    
    int absVal = Math.abs(difference);
    System.out.println("The distance is " + absVal);
    
    if (number1 > number2) {
        System.out.println("The maximum is " + number1);
    }
    else if (number2 > number1){
        System.out.println("The maximum is " + number2);
    }
    else { 
        System.out.print("No max or min");
    }
    if (number1<number2) {
        System.out.println("The minimum is " + number1);
    }
    else if (number2>number1) {
        System.out.println("The minimum is " + number2);
    }
    else { 
        System.out.print("No max or min");
    }
    
    
    
    
    
}
}

//Paste console output below:
/*
Enter number 1: 
13
Enter number 2: 
20
The sum is 33
The difference is -7
The product is 260
The average is 16.5
The distance is 7
The maximum is 20
The minimum is 13


*/
