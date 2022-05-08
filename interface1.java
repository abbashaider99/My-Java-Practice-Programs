//things to be remember...
//1- use interface keyword before name
//2- Use public on implementing of the interface's methods in subclass, BTW compiler automatically write public and static before method in interface class.
//3- All the interface's methods should be defined in subclass otherwise compiler will give error, otherwise we can use abstract keyword
//before subclass name if any method is remain undefined.
//abstract means aadha adhura...

interface ServiceProvider{
     public  void m1();  //here if we do not write public then compiler will automatically write
     public void m2();
}

class SubServiceProvider implements ServiceProvider{
        public void m1(){  //here it's improtant to write public
            System.out.println("This is M1");
         }
      
 //all the methods should be implement otherwise we can write abstract before class SubServiceProvider. that means this is aadhi adhuri... 
}

class interface1{
public static void main(String[] args){
    SubServiceProvider s1 = new SubServiceProvider();
  
    s1.m1();
    //s1.m2();
}
}

