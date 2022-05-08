abstract class moterbike{
    abstract void brake();
}

class sportsbike extends moterbike{
       void brake()
       {
           System.out.println("This is Sportsbike brake");
       }
}
class drivebike extends moterbike{
      void brake(){
          System.out.println("This is Drivebike brake");
      }
}

class abstractclass1{
    public static void main(String[] args){
        //abstractclass1 abc = new abstractclass1();
        //abs.brake();
        sportsbike sb = new sportsbike();
        sb.brake();
        drivebike db = new drivebike();
        db.brake();

        //moterbike mb = new moterbike(); we cannot instantiat or create object of this class because its abstract class.
        //mb.brake();
    }
}
