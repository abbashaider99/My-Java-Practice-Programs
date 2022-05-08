import java.util.*;

class area {
    float circle(int radius) {
        return (3.14f * radius * radius);
    }

    float square(int side) {
        return (side * side);
    }

    float rectangle(int l, int b) {
        return (l * b);
    }

    float triangle(int base, int height) {
        return ((base * height) / 2);
    }

}

class findarea {
    public static void main(String[] args, int i) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        area a = new area();
        System.out.println(
                "To find Area, Press 1 for CIRCLE, Press 2 for SQUARE, Press 3 for RECTANGLE, Press 4 for TRIANGLE");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("You choosed to find the Area of Circle");
                System.out.println("Please enter the radius of circle");
                int radius = input.nextInt();
                System.out.println("Area of circle with given Radius " + radius + " is: " + a.circle(radius));
                break;
            case 2:
                System.out.println("You choosed to find the Area of Square");
                System.out.println("Please enter the side of square");
                int side = input.nextInt();
                System.out.println("Area of Square with given side " + side + " is " + a.square(side));
                break;
            case 3:
                System.out.println("You choosed to find the Area of Rectangle");
                System.out.println("Please enter the Length of Rectangle");
                int length = input.nextInt();
                System.out.println("Please enter the Breath of Rectangle");
                int breath = input.nextInt();
                System.out.println("Area of Rectangle with Length " + length + " and breath " + breath + " is "
                        + a.rectangle(length, breath));
                break;
            case 4:
                System.out.println("You choosed to find the Area of Triangle");
                System.out.println("Please enter the base of Triangle");
                int base = input.nextInt();
                System.out.println("Pleas enter the height of Triangle");
                int height = input.nextInt();
                System.out.println("Area of Triangle with base " + base + " and height " + height + " is "
                        + a.triangle(base, height));
        }
    }
}