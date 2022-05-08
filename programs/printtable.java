import java.util.*;
import java.lang.*;

class printtable {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.println("Please input number to print table");
        int tablenum = numInput.nextInt();
        System.out.println("Till the number");
        int last = numInput.nextInt();

        for (int i = 1; i <= last; i++) {
            int result = i * tablenum;
            System.out.println(tablenum + " * " + i + " = " + result);
        }
    }
}