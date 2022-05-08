class factorial {

    static int Factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = Factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}