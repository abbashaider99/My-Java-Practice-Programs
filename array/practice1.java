class practice1 {
    public static void main(String[] args) {
        int[] arr; // declaring
        arr = new int[3]; // creating
        arr[0] = 36; // initialize
        arr[1] = 54;
        arr[2] = 2432;
        System.out.println("Here are separating array: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
        // Now here we can do everything in one line....array declaring, array creating,
        // array initializing...

        int[] arr1 = { 36, 54, 2432 }; // if we knows the value then we don't need to creating, we can
                                       // directly assing the values.
        System.out.println("Here are in one line array: " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
        String[] str = { "Abbas", "Haider", "Baqri" }; // String always in double quotes...
        System.out.println("This is the String array: " + str[0] + " " + str[1] + " " + str[2]);

        char[] ch = { 'A', 'B', 'B', 'A', 'S' }; // char also in single quotes...
        System.out.println("This is the char array: " + ch[0] + ch[1] + ch[2] + ch[3] + ch[4]);
    }
}