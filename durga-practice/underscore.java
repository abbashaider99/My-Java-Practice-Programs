class underscore {
    public static void main(String[] args) {
        double a = 123_45.567;
        int i = 12_345;
        double d = 1_234.567;
        double d1 = 1__23__45__6_7.8_9__0_7; // VALID-- we can use more than one underscore
        // double d2 = 1__23__45__6_7_.8_9__0_7; INVALID--
        // double d3 = 1__23__45__6_7.8_9__0_7_; INVALID--
        // double d4 = _1__23__45__6_7.8_9__0_7; INVALID--
        // double d5 = 1__23__45__6_7._8_9__0_7; INVALID--

        System.out.println(a);
        System.out.println(i);
        System.out.println(d);
        System.out.println(d1);
    }
}

// compilere automatically removes the underscore during compilation time, its
// good for readibiltiy
// only. this don't make effect on program 12_34 is equal to 1234