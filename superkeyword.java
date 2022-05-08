class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    public static void show(int a) {
        System.out.println(a);
        System.out.println(super.a);
    }
}

class superkeyword {
    public static void main(String[] args) {
        B obj = new B();
        B.show(30);
    }
}