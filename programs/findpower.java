import java.util.*;

class findpower {
    public static int myPower(int b, int e) {
        int product = 1;
        for (int i = 1; i <= e; i++) {
            product = product * b;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a base number");
        int b = s.nextInt();
        System.out.println("Enter the exponent number");
        int e = s.nextInt();
        System.out.println("Result is: " + myPower(b, e));

    }
}