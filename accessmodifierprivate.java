class abbas{
    int mymethod(){
      private int number = 5; //if this is private then it won't be visible outside this class.
        int number2 = 4;
        return number + number2;
    }
}
class accessmodifierprivate{
    public static void main(String[] args){
        abbas obj = new abbas();
        int num = obj.mymethod();
        System.out.println("Member/Field is: "+num);
}
}