import java.util.*;

class mycal {
    int division(int a, int b) {
        return (a / b);
    }

    int multiplication(int a, int b) {
        return (a * b);
    }

    int addition(int a, int b) {
        return (a + b);
    }

    int substraction(int a, int b) {
        return (a - b);
    }
}

class calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the iteration number: ");
        int it = sc.nextInt();
        int score_count = 0;
        for (int i = 1; i <= it; i++) {
            Random random = new Random();
            int a = random.nextInt(50);
            int b = random.nextInt(50);
            int sys_result = a + b; // result by system.
            System.out.println("Addition of " + a + ", " + b + "?");
            int user_input = sc.nextInt(); // taking user input
            if (sys_result == user_input) {
                score_count = score_count + 1;
                System.out.println("You are right");
            } else {
                System.out.println("Sorry, You are wrong. Right answer is: " + sys_result);
            }
        }

        System.out.println("Your score is: " + score_count + " out of " + it);

    }
}