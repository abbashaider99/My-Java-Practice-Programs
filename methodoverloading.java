import java.lang.String;
class bakwas{
    String showNumber(int a){
        return String.format("%d",a);
    }
   String showNumber(double a){
       return String.format("%.3f",a);
    } 
    String showNumber(String a){
      return String.format(a);
    }
    
}

class methodoverloading{
  public static void main(String[] args){
    bakwas obj = new bakwas();
    System.out.println(obj.showNumber(5));
    System.out.println(obj.showNumber(45.2));
    System.out.println(obj.showNumber("541"));
  }

}

