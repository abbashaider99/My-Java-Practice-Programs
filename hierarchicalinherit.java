class a{
    void show(){
        System.out.println("This is the super class A");
    }
}

class b extends a{
    void display(){
        
        System.out.println("This is class B");
    }
}

class hierarchicalinherit extends a{
    public static void main(String[] args){
      hierarchicalinherit obj = new hierarchicalinherit();
      obj.show();
      b obj1 = new b();
      obj1.display();
    }
}