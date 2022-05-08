import java.util.Scanner;
import java.lang.String;
class userinput{
    public static void main(String[] args){
        Scanner takeuser = new Scanner(System.in);
        
        System.out.println("Please enter your name.");
        String myname = takeuser.next();
        System.out.println("Please enter your age to check whether you can vote or not.");
        int age = takeuser.nextInt();
        
        if(age>=18)
        {
            System.out.println(myname + ", Yeah! You're eligible to vote.");
        }
        else
        {
            System.out.println(myname + ", Sorry, You're not eligible to vote.");
        }
    }
}
