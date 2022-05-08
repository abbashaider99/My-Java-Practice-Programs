final class bakwasbaat{  //here if i am trying to final keyword then I am unable to inherit this whole class.
    void show(){
        System.out.println("Hey, there! I am Abbas");
    }
}

class finalclass extends bakwasbaat{
    public static void main(String[] args){
       finalclass obj = new finalclass();
       obj.show();
    }
}

//final variable--> We cannot change the value of final varibale anywhere.
//final method--> We can extend the method but cannot modify the final method in new class.
//final class--> We cannot inherit the final class anywhere outside the class.

