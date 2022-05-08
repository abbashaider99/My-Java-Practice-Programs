class arrayforeach {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 5, 7, 6, 7 };
        String s = "Abbas";

        for (int a : arr) { // arr[0], arr[1],arr[2],...arr[n];
            System.out.println(a);
        }
        System.out.println("String length is: " + s.length());
    }
}