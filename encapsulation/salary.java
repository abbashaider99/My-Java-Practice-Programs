import java.util.Scanner;

class creditSalary {
    private int amount; // amount can not be access without getter and setter method because its
                        // private, so nobody can access.

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            amount = -amount;
        } else {
            this.amount = amount;
        }
    }
}

class salary {
    public static void main(String[] args) {
        System.out.println("Please enter the salary amount");
        Scanner obj = new Scanner(System.in);
        int value = obj.nextInt(); // taking input

        creditSalary creObj = new creditSalary(); // creating object of salary class.
        creObj.setAmount(value); // accessing and passing the value in setamount method
        System.out.println("Credit Salary Amount Is: " + creObj.getAmount()); // printing the salary amount...

    }
}
