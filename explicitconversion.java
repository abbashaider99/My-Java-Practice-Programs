class explicitconversion{
    public static void main(String [] args){
        double d = 45.32;
        int i = (int)d; //explicit conversion...big data type to small data type, here data may be lost...
        System.out.println(i);
        int a = 54;
        double b = a;  //implicit conversion...where small type store in big data type, it can be done by compiler automatically...
        System.out.println(b);
    }
}