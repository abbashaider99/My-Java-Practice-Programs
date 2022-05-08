class datatypes {
    public static void main(String[] args) {

        // ................byte..................1 byte(8 bits) //
        byte b = 127; // values in byte can be stored -128 to 127
        // byte bb = 128; it cannot compile because its more then the value it can
        // store in byte. So, compile time error.
        System.out.println("This is byte result: " + b);
        // System.out.println(bb);
        // byte c = 5.7; cannot convert from double to byte.
        // System.out.println(c);
        // -----------------------------------------------------------------------------------------------//

        // ................Short...............2 bytes(16 bits)//
        short s = 32767; // range -32768 to 32767
        System.out.println("This is short result: " + s);
        // -----------------------------------------------------------------------------------------------//

        // ....................int...................4 bytes (32 bits)//
        int i = 2147483647; // range -2147483648 to 2147483647
        // int ii = 2147483648; its out of range...
        System.out.println("This is int result: " + i);
        // -----------------------------------------------------------------------------------------------//

        // ................long.................8 bytes(64 bits)// when int may not
        // store big value then we should go for long, e.g speed of light, sun distance
        // etc.
        long l = 126000 * 60 * 60 * 24 * 999;
        System.out.println("This is long result: " + l);
        // -----------------------------------------------------------------------------------------------//

        // ....................float............4 bytes(32 bits) 4 to 5 decimal points//
        // float f = 1.7e38; // range -1.7e38 to 1.7e38
        // float pointf = 21.1;
        // System.out.println("This is result of float: " + f);
        // System.out.println("This is showing decimal pointing in float: " + pointf);
        // -----------------------------------------------------------------------------------------------//

        // ....................double...........8 bytes (64 bits) 14 to 15 demical
        // points//
        double d = 3.4e38; // range -3.4e38 to 3.4e38
        double pointd = 987.12345678987654321;
        System.out.println("This is result of double: " + d);
        System.out.println("This is showing decimal pointing in double: " + pointd);
        // -----------------------------------------------------------------------------------------------//

        // .......................boolean........NA [Virtual machine dependent], Range:
        // NA [But allowed values : true/flase]

        boolean bo = true;
        // boolean bb = 0; error, cannot convert from int to boolean.
        System.out.println("This is the result of boolean: " + bo);
        // System.out.println("This is the result of boolean bb" + bb);

    }
}