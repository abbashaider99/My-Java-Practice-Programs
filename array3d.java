class array3d{
    public static void main(String[] args){
        int[][][] a = {{{3,4,5},{5,4,7,6},{7,3,2}},{{4,2,5,3},{6,4,2,4,9}}, {{5,2,5,3},{6,4,2,45}}};
        
        //printing the total lenght in array...

        System.out.println(a.length);

        //printing the values in array...

        for(int[][] b : a){
            for(int[] c : b){
                for(int d : c){
                    System.out.print(d);
                    System.out.print(", ");
                }
            }
        }
    }
}