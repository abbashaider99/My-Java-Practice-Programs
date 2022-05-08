class switchcase {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            /*
             * switch (i) {
             * case 1:
             * System.out.println("Payment processing, please wait...");
             * case 2:
             * System.out.println("Received from bank, waiting for confirmation...");
             * case 3:
             * System.out.println("Transfering to your bank account...");
             * default:
             * System.out.println("Transfer success!");
             * }
             */
            if (i == 1) {
                System.out.println("Payment processing, please wait...");
            } else if (i == 2) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // e.printStackTrace();
                }
                System.out.println("Received from bank, waiting for confirmation...");
            } else if (i == 3) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    // e.printStackTrace();
                }
                System.out.println("Transfering to your bank account.");
            } else if (i >= 3) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    // e.printStackTrace();
                }
                System.out.println("Congratulations! Transfer success!");
            }
        }
    }
}