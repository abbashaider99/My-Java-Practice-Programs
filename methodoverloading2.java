class methodoverloading2{
    public void m1(int a){  //here m1(int) is the signature
        System.out.println(a);
    }
    public void m1(String s){  //here m1(String) is the signature
        System.out.println(s);
    }
    public static void main(String[] args){
    methodoverloading2 m = new methodoverloading2();
    m.m1(30);
    m.m1("Abbas");
    }
}

//in method overloading, method name should be same but different parameter its called method overload, its not possible in C language.
//Compiler create the method table in which it stores the methods name and parameters, by which it understand that all methods are taking different types of arguments.
//if the compiler see that the any methods having same name and with same parameter then it through the compile time errors.