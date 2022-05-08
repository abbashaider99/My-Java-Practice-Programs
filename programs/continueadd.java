import java.util.Scanner;

class continueadd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the five numbers");
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            int num = input.nextInt();
            if (num < 0.0) {
                continue;
            }
            sum = sum + num;
        }
        System.out.println("Here is the sum of all positive numbers you entered: " + sum);
    }
}