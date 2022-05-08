class finalkeyword{
    public static void main(String[] args){
     final int a=40;
     System.out.println(a); //it will run if we don't update a.
    // a = 30;  //commenting this to run the code...
     System.out.println(a); //it won't work because final keyword already initialized.
    }
}