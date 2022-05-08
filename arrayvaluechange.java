class arrayvaluechange{
    public static void main(String[] args){
        int[] a = {3,2,4,2,5};
        //Before update values...
        for(int b : a){
            System.out.println(b);
        }

        //After update values
        System.out.println("------------After upadate------------");
        a[1] = 43;
        for(int b : a){
            System.out.println(b);
        }
    }
}