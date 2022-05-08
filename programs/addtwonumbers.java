import java.util.Scanner;
class addtwonumbers{

    int addnum(int a, int b)
    {
     return(a+b);
    }


    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number to perform addition");
        int fnum = obj.nextInt();
        System.out.println("Enter second number to perform addition");
        int snum = obj.nextInt();
        addtwonumbers obj1 = new addtwonumbers();
        System.out.println("Addition is: "+obj1.addnum(fnum,snum));

    }
}

