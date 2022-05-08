import java.util.Scanner;

class percentage {
    float calculate(float fnum, float snum) {
        return (fnum * (snum / 100));
    }
}

class findpercentage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you want to find the percentage");
        float fnum = input.nextFloat();
        System.out.println("How much percentage you want to find");
        float snum = input.nextFloat();

        percentage obj = new percentage();
        System.out.println("Here is the result: " + obj.calculate(fnum, snum));

    }
}