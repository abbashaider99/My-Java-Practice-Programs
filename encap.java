class encap2 {
    private int age;

    // private int num = 3;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class encap {

    public static void main(String[] args) {
        // here we will get and set and value in encap2 class...
        encap2 obj = new encap2();
        obj.setAge(22);
        System.out.println("Value is: " + obj.getAge());
        // System.out.println("Other value is"+ obj.num); //its not visible
    }
}