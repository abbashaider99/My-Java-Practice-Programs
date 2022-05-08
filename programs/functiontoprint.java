import java.util.Scanner;

import java.lang.*;
import java.util.*;

class functiontoprint {
    public static void printMyName(String name) {
        System.out.println("Hey, " + name);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = obj.next();
        printMyName(name);
    }
}