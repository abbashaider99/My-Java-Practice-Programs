class integralliteral {
    public static void main(String[] args) {
        int a = 10; // decimal form
        System.out.println("Decimal form: " + a);
        int b = 010; // octal form (base-10), allowed digits are 0-7
        System.out.println("Octal form: " + b);
        int c = 0x10beef; // hexa decimal form,here x and X are same (not case sensitive),base 16, allowed
        // digits (0-9), (a-f)
        System.out.println("Hexadecimal form: " + c);
        float f = 123.456f; // by default every floating point literal is of double type and hence we cannot
                            // assign directly to the variable, suffix with F or f.
        System.out.println("Floating point literal: " + f);
        // representing the float how many digits will be print after decimal point
        float ff = 10.0f / 3;
        System.out.println("Here is representing float: " + ff);
        // representing the double that how many digits will be print after decimal
        // points
        double d = 10.0 / 3; // we can suffix d or not.
        System.out.println("Here is representing double: " + d);

        // printing boolean value
        boolean bu = true;
        System.out.println("Here is the value of boolean: " + bu);

    }
}