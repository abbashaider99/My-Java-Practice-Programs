class construct {
    public construct() {
        // default constructor
    }

    public construct(int a) {
        // parametarized constructor
        System.out.println(a);

    }

    public construct(String b) {
        // parametarized constructor
        System.out.println(a);
    }

    public construct(int a, int b) {
        // multi parametarized constructor
        System.out.println(a + b);
    }

    int a;

    public static void main(String[] args) {
        construct obj = new construct(5);
        construct obj1 = new construct("Abbas");
        construct obj2 = new construct(4, 3);

    }
}