class postpre{
    public static void main(String[] args){
        int a=5, b=5;
        int result1, result2;

        //Orignal value of A
        System.out.println("Value of A: " + a);
        result1 = ++a;
        System.out.println("Preincrement of A: " + result1);
        result2 = a++;
        System.out.println("Postincrement of A: " + result2);
        
        System.out.println("---------------------------------");

        //Orignal value of B
        System.out.println("Value of B: " + b);
        result1 = --a;
        System.out.println("Predecrement of B: " + result1);
        result2 = a--;
        System.out.println("Postdecrement of B: " + result2);

        System.out.println("---------------------------");
        System.out.println(20);
    }
}