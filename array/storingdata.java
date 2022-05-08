
//here we'll ask the name of student then numbers he got in all the subject and we will calculate all the numerbers and display using array.
import java.util.Scanner;
import java.lang.String;

class storingdata {
    public static void main(String[] args) {

        System.out.println("Hey, What is your good name?");
        Scanner obj = new Scanner(System.in);
        String name = obj.next();
        System.out
                .println("Thank you, " + name + "\n Now, you will be need to enter your marks you got in all subjects");
        System.out.println("Please enter your Maths marks");
        int maths = obj.nextInt();
        System.out.println("Great! Now enter your English marks");
        int english = obj.nextInt();
        System.out.println("Enter your Java marks");
        int java = obj.nextInt();
        int total = maths + english + java;
        System.out.println(name + ",Total marks you have gotten: " + total);

    }
}