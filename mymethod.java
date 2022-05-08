import java.util.Scanner;
class mathmaster{
    int addNumbers(int num1, int num2)  //method
    {
   int sum = num1+num2;
   return sum;
    }
}

class mymethod{
    public static void main(String[] args)   //main method means, here static means that we can access members without creating object of main method. 
    {
    Scanner takenum = new Scanner(System.in);  //creating object of Scanner class for taking input...
    System.out.println("Please enter first number");
    int a = takenum.nextInt();   //here nextInt() is the method defined in Scanner class, we are calling nextInt with object takenum. 
    System.out.println("Please enter second number");
    int b = takenum.nextInt();
    mathmaster obj = new mathmaster();
    int result = obj.addNumbers(a, b);
    System.out.println("Our result is: "+result);
    }
}