package primitivedatatypes;

public class BytesClass
{
    public static void main(String[] args)
    {
        byte a = 14;
        byte b = 37;
        byte c = (byte)(a + b);
        System.out.println("sum = " + c);
        /*As you see, you must explicitly convert the sum of a and b to a byte. Otherwise,
        the compiler assumes that the result is an int, which would cause a compilation
        error (you can not assign an int to the variable c),whose type is byte.*/
        short a1 = 100;
        short b2 = 100;
        short c3 = (short)(a1 + b2);
        System.out.println("sum = " + c);

    }
}
