class bakwas{
    void showNumber(int a){
    System.out.println("Here is the number: "+a);
    }
    void showNumber(int a, int b){
        System.out.println("Here are the numbers: "+a+" and "+b);
    }
}

class methodoverloading1{
    public static void main(String[] args){

        int a=5, b=10;
           bakwas obj = new bakwas();
           obj.showNumber(a);
           obj.showNumber(a,b);
    }
}