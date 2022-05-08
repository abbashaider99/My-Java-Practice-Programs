import java.util.*;

class vote {
    public static void canVote(int age) {
        if (age >= 18) {
            System.out.println("Great, You are eligible to vote");
            return;
        } else {
            System.out.println("Sorry, You are not eligible to vote. you're below 18");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please your age");
        int age = obj.nextInt();
        canVote(age);

    }
}