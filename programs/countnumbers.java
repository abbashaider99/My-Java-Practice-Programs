import java.util.*;

class countnumbers {

    public static void myCount(int count) {
        int p = 0, n = 0, z = 0;

        for (int i = 1; i <= count; i++) {
            Scanner take = new Scanner(System.in);
            int num = take.nextInt();
            if (num > 0) {
                p = p + 1;
            } else if (num < 0) {
                n = n + 1;
            } else {
                z = z + 1;
            }
        }
        System.out.println("Positive: " + p + ", Negative: " + n + ", Zero: " + z);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number when you wants to end the program");
        int count = s.nextInt();
        myCount(count);
    }
}