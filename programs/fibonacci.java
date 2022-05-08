import java.util.Scanner;

class fibonacci {

    public static void calculate(int n) {
        int product = 0;
        for (int i = 0; i <= n; i++) {
            // product = product + i;

            System.out.print(product + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        calculate(n);
    }
}