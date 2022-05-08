class dog{
    void show(){
        System.out.println("This is dog class");
    }
    dog(){
        System.out.println("This is constructor");
    }
}

class cat extends dog{
    void show(){
        super.dog();
        super.show();
       System.out.println("This is apni class overridded...cat");
    }
}

class overridesuper{
    public static void main(String[] args){
       cat obj = new cat();
       obj.show();    
    }
}