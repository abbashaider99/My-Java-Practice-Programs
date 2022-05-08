class arraysum {
    public static void main(String[] arr) {
        int[] num = { 23, 54, 6, 7 };
        int total = 0;
        for (int sum : num) {
            total += sum;
        }

        // e.g. here is the sum of total numbers in array...
        System.out.println("Total sum is: " + total);

        // finding the average of sum...
        int arrayLength = num.length;
        System.out.println("Average is: " + (double) total / (double) arrayLength);
    }
}