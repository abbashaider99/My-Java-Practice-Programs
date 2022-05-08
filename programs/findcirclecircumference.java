import java.util.*;

class findcirclecircumference {
    public static float myCircum(float radius) {
        float result = 2 * 3.14f * radius;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a radius of circle");
        Scanner obj = new Scanner(System.in);
        float radius = obj.nextFloat();
        System.out.println("Circumference of circle is: " + myCircum(radius));
    }
}