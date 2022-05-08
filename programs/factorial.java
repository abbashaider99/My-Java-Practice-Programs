import java.util.Scanner;

class factorial {
    public static void myFactorial(int a) {
        if (a < 0) {
            System.out.print("Invalid number");
            return;
        }

        int result = 1;
        for (int i = a; i >= 1; i--) {
            result = result * i;

        }
        System.out.println("Your factorial is: " + result);
        return;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = obj.nextInt();
        myFactorial(a);
    }
}