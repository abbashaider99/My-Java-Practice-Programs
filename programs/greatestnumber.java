import java.util.*;

class greatestnumber {
    public static void myNum(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greatest number");
        } else {
            System.out.println(b + " is greatest number");
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println("Please enter two nnumbers");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        myNum(a, b);
    }
}