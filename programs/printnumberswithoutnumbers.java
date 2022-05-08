class printnumberswithoutnumbers {
    public static void main(String[] args) {
        // printing numbers 0-100 without using number in program
        String s = "A";
        String s1 = "..........";

        for (int i = s.length(); i <= s1.length() * s1.length(); i++) {
            System.out.println(i);
        }
        System.out.println("Program ended...!!!");
    }

}