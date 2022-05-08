import java.lang.String;
import java.util.Scanner;
import java.lang.*;
import java.util.*;

//Making calculator using switch case
class switchcase{
    public static void main(String[] args){
    int a, b, c=0, num;
    System.out.println("What you want to perform, Enter 1 for additon, 2 for Substraction, 3 for multiplication");
    Scanner userinput = new Scanner(System.in);
    num = userinput.nextInt();
    System.out.println("Enter two numbers");
    a = userinput.nextInt();
    b = userinput.nextInt();
    switch (num)
    {
        case 1:  c = a+b;
        break;

        case 2: c = a-b;
        
        break;

        case 3: c = a*b;
        break;
        default: System.out.println("Please enter a valid number");
    }
      System.out.println("Result is: " +c);
    }
}