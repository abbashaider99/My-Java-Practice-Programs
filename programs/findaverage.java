import java.util.Scanner;

class findaverage {
    public static int myAverage(int a, int b, int c) {
        return ((a + b + c) / 3);
    }

    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        System.out.print("Average is: " + myAverage(a, b, c));
    }
}