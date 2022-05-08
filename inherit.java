class Animal{
    void eat(){
        System.out.println("I can eat");
    }
}
class inherit extends Animal{
    void eat(){    //here i override the eat method
        System.out.println("I can eat meat");
    }
    
    void show(){
        System.out.println("Humans loves me a lot.");
    }
   public static void main(String[] args){
       inherit obj = new inherit();
         obj.eat();
         obj.show();
   }
}