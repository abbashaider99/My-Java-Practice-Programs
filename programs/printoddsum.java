import java.util.*;

class printoddsum {
    public static int mySum(int a) {
        int sum = 0;
        for (int i = a; i >= 1; i--) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        System.out.println("Result is: " + mySum(a));
    }
}