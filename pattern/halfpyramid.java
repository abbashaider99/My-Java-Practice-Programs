class halfpyramid {
    public static void main(String[] args) {
        int n = 10;
        int m = 50;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // code here...
                if (i == j || i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// required output

// *
// **
// ***
// ****
// Other solution

/*
 * for(int i=1; i<=5;i++){
 * for(int j=1; j<=i;j++){
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 */