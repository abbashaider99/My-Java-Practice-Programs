class arrayclass {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        System.out.println(arr.getClass().getName());
        System.out.println("It's also printing...below is runtimeexception...");
        // int[] arr1 = new int[-3]; Negative value exception...
        System.out.println(arr1);
        int[] arr2 = new int[2147483647];
        System.out.println(arr2);
        // int[] arr3 = new int[2147483648]; out of memory error...

    }
}