class a{
    void show(){
        System.out.println("This is class A");
    }
}

class b extends a{
    void display(){
        System.out.println("This is class B");
    }
}

class multilevelinherit extends b{
    public static void main(String[] args){
        multilevelinherit obj = new multilevelinherit();
        obj.show();  //method of a class...
        obj.display(); //method of b class...
        //A, b has extended the a class so the method of a class has inside the b class. here we have extended the b class that means here we have a and b class methods
    }
}