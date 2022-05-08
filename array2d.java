class array2d{
    public static void main(String[] args){
        int[][] a = {{2,3,4}, {6,8,7,5,2}};
        
        //printing the length of array...
        System.out.println(a.length);

        //printing the values inside the 2d array...
         for(int[] b : a){
             for(int c : b){
                 System.out.println(c);
                 }
         }
    }
}