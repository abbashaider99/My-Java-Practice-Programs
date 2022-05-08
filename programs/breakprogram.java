class breakprogram {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                // System.out.print(i);
                continue; // continue help us to leave particuler iteration.
            }
            if (i == 8) {
                System.out.print(i);
                break; // break help us to terminate the complete loop
            }

            System.out.print(i + ", ");
        }
    }
}