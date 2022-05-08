class parent {
    void showdetails() {
        System.out.println("This is parent");
    }
}

class child extends parent {
    void showdetail() {
        System.out.println("This is child with inherit parent class");
    }
}

class differentobj {
    public static void main(String[] args) {

        // same class reference variable type storing the same class's object.
        parent p = new parent();
        p.showdetails();

        // parent class's reference type storing the object of sub class.
        parent e = new child();
        e.showdetails();

        child c = (child) e;
        c.showdetail();

        // but here child class type reference type cannot store the parent's class
        // object.
        // child c = new parent(); //this cannot be done...forming the error...
        // c.showdetails(); //this cannot be done...forming the error...
    }
}