class test {
    void show() {
        System.out.println("Hey bro, this is class test.");
    }
}

class predefinedclassasvariable {
    public static void main(String[] args) {
        test obj = new test();
        obj.show();
        int test = 10;
        int show = 20;
        // int String = 22;
        String String = "Twenty Two";
        System.out.println("Using class name and method name as varibale, Value in class varibale name is " + test
                + " and value in method varibale name is " + show); // we can also use class name and methods name as a
                                                                    // variable but its not good practice, it can be
                                                                    // confusing for us.
        System.out.println("My age is " + String);
    }
}