//primitive data types
//typecasting 
//printf
public class A_java {
    public static void main(String[] args) {
        prime type =new prime();
        castingtype modify =new castingtype();
        printformat form = new printformat();
        type.printDataType();
        modify.castings();
        form.specifiers();
    }
}
class prime{
     // byte : It is 1 byte(8-bits) integer data type. Value range from -128 to 127.
        // Default value zero. example: byte b=10;

        // short : It is 2 bytes(16-bits) integer data type. Value range from -32768 to
        // 32767. Default value zero. example: short s=11;

        // int : It is 4 bytes(32-bits) integer data type. Value range from -2147483648
        // to 2147483647. Default value zero. example: int i=10;

        // long : It is 8 bytes(64-bits) integer data type. Value range from
        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Default value zero.
        // example: long l=100012;

        // float : It is 4 bytes(32-bits) float data type. Default value 0.0f. example:
        // float ff=10.3f;

        // double: It is 8 bytes(64-bits) float data type. Default value 0.0d. example:
        // double db=11.123;

        // char: It is 2 bytes(16-bits) unsigned unicode character. Range 0 to 65,535.
        // example: char c=’a’;
        // A program to illustrate primitive data types in Java

        // declare and initialize variables of different primitive data types
        byte b = 127; // a byte variable
        short s = 32767; // a short variable
        int i = 2147483647; // an int variable
        long l = 9223372036854775807L; // a long variable with L suffix
        float f = 3.14f; // a float variable with f suffix
        double d = 1.7976931348623157E308d; // a double variable with d suffix
        char c = 'Z'; // a char variable with single quotes
        boolean bool = false; // a boolean variable with true or false value

       void printDataType(){
         // print the values and sizes of the variables
        System.out.println("The value of b is " + b);

        System.out.println("The value of s is " + s);

        System.out.println("The value of i is " + i);

        System.out.println("The value of l is " + l);

        System.out.println("The value of f is " + f);

        System.out.println("The value of d is " + d);

        System.out.println("The value of c is " + c);

        System.out.println("The value of bool is " + bool);
       }

}

class castingtype extends prime{
    void castings(){
        // A program to illustrate widening and narrowing type casting in Java

        // demonstrate widening type casting
        // widening type casting is when a lower data type is converted to a higher one
        // this is also called implicit conversion or casting down
        // this is done automatically by the compiler and no information is lost
        System.out.println("Widening type casting examples:");
        double x = b; // assign a byte value to a double variable
        System.out.println("The value of x after widening from byte to double is " + x);
        float y = s; // assign a short value to a float variable
        System.out.println("The value of y after widening from short to float is " + y);
        long z = i; // assign an int value to a long variable
        System.out.println("The value of z after widening from int to long is " + z);
        int w = c; // assign a char value to an int variable
        System.out.println("The value of w after widening from char to int is " + w);

        // demonstrate narrowing type casting
        // narrowing type casting is when a higher data type is converted to a lower one
        // this is also called explicit conversion or casting up
        // this is done manually by the programmer using the cast operator
        // some information may be lost
        System.out.println("Narrowing type casting examples:");
        int p = (int) d; // cast a double value to an int value
        System.out.println("The value of p after narrowing from double is " + p);
        char q = (char) i; // cast an int value to a char value
        System.out.println("The value of q after narrowing from int is " + q);
        short r = (short) l; // cast a long value to a short value
        System.out.println("The value of r after narrowing from long is " + r);
        byte o = (byte) s; // cast a short value to a byte value
        System.out.println("The value of o after narrowing from short is " + o);
    }
}
class printformat{
    void specifiers(){
        
        // the prinf use in different cases The printf() method is part of the
        // PrintStream class and is used to format output to the console or any output
        // stream. It's similar to the C programming language's printf() function.

        // syntax
        // public PrintStream printf(String format, Object... args)

        /*
         * Format Specifiers:
         * Format specifiers begin with a % character and are used to specify the data
         * type and format of the arguments. Some common format specifiers include:
         * 
         * %d: Decimal integer
         * %f: Floating-point number
         * %s: String
         * %c: Character
         * %b: Boolean
         * %x: Hexadecimal
         */

        // Integer Specifier (%d)
        int intValue = 42;
        System.out.printf("Integer value: %d%n", intValue);

        // Floating-Point Specifier (%f)
        double doubleValue = 3.14159;
        System.out.printf("Double value with 2 decimal places: %.2f%n", doubleValue);

        // String Specifier (%s)
        String stringValue = "Java Programming";
        System.out.printf("String value: %s%n", stringValue);

        // Character Specifier (%c)
        char charValue = 'A';
        System.out.printf("Character value: %c%n", charValue);

        // Boolean Specifier (%b)
        boolean boolValue = true;
        System.out.printf("Boolean value: %b%n", boolValue);

        // Hexadecimal Specifier (%x)
        int hexValue = 255;
        System.out.printf("Hexadecimal value: %x%n", hexValue);

        // Octal Specifier (%o)
        int octalValue = 63;// octal of 63 is 77
        System.out.printf("Octal value: %o%n", octalValue);

        // Scientific Notation (%e)
        double scientificValue = 12345.6789;
        System.out.printf("Scientific notation: %e%n", scientificValue);
        // more specific use for scientific values
        double largeNumber = 1234567890.123456789;
        double smallNumber = 0.0000000123456789;
        // Displaying large and small numbers using scientific notation
        System.out.printf("Large number in scientific notation: %.3e%n", largeNumber);
        System.out.printf("Small number in scientific notation: %.3e%n", smallNumber);

        // Width and Padding (%20s)
        String paddedString = "Padded";
        System.out.printf("Padded string with width 20: %20s%n", paddedString);
        // different paddling cases
        System.out.printf("Word1%10sWord2%n", "");
        System.out.printf("LeftAligned%-10sRightAligned%n", "");

        // Negative Width (-%10d)
        int negativeWidthValue = 123;
        System.out.printf("Negative width for integer: %-10d%n", negativeWidthValue);

        // Leading Zeros (%06d)
        int leadingZerosValue = 789;
        System.out.printf("Integer with leading zeros: %06d%n", leadingZerosValue);

        // Combination of Specifiers
        int combinationInt = 123;
        double combinationDouble = 456.789;
        System.out.printf("Combination of values: Int = %d, Double = %.2f%n", combinationInt, combinationDouble);

        // "type interpretation"

        // Format specifiers like %d, %f, %s, %x, etc., specify how the corresponding
        // values will be represented or displayed in the output. They do not change the
        // actual data type of the variables.

        // When you use a format specifier like %f for an integer value in printf(), the
        // output will attempt to interpret the integer as a floating-point number

        int intVal = 42;
        // Using %f format specifier for an integer value
        System.out.printf("Integer value with %%f specifier: %f%n",(float) intVal);

        // Casting the integer to a double
        int doublyValue = 40;
        System.out.println("Double value after casting:" +(double) doublyValue);
        // with speciefier
        System.out.printf("Double value after casting: %f" ,(double) doublyValue);
    }
}