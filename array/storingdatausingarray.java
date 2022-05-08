
// inserting data using one dimensional array...
import java.util.Scanner;

class storingdatausingarray {
    static int num;

    public static void main(String[] args) {
        System.out.println("How many numbers you want to add");
        Scanner obj = new Scanner(System.in);
        int i = obj.nextInt();
        int[] arr = new int[i];
        for (int a = 0; a <= i; a++) {
            int num = i + 1;
        }
        System.out.println("Total is: " + num + "," + i);
        // checking whether our given i number or the length is equal or not...
        if (i == arr.length) {
            System.out.println("Its equal");
        } else {
            System.out.println("Its not equal bro");
        }

    }
}
