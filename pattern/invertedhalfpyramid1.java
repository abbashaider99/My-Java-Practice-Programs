class invertedhalfpyramid1 {
    public static void main(String[] args) {
        int n = 5;
        // outer loop

        for (int i = 1; i <= n; i++) {
            // inner loop to print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}