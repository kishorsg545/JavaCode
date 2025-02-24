package strings;

public class StringClass
{
    public static void main(String[] args)
    {
        String s3 = "Hello World";
        String s2 = new String("Hello World").intern();
        System.out.println(s2==s3);
        String s4="hello".concat("world");
        System.out.println(s4.length());
        String s5="\"hello\"";
        System.out.println(s5);
        boolean s6=s3.equals(s2);
        System.out.println(s6);
        int comparing="hello".compareTo("hello");
        int value=42;
        String s10=String.valueOf(value);
        System.out.println(s10);
        System.out.println(comparing);
        char s7=s3.charAt(0);
        System.out.println(s7);
        String s8=s3.substring(0,5);
        System.out.println(s8);
        String s9=s3.replace('l','k');
        System.out.println(s9);
        String s11="hello    ".trim();
        System.out.println(s11);
        System.out.println(s11.substring(0,1));
        String s12="hello worldfun";
        String[] s13=s12.split(" ");
        for(String s14:s13)
        {
            System.out.println(s14);
        }
        String s15=String.join(" ",s13);
        System.out.println(s15);
        //%s,%d,%f,%b
        StringBuffer s16=new StringBuffer();
        StringBuffer hello = s16.append("hello");//Thread safe
        System.out.println(hello.toString());
        StringBuffer rev = s16.reverse();
        System.out.println(rev);
        StringBuilder  s17=new StringBuilder();//not thread safe

        String s18="345632.00";
        double v = Double.parseDouble(s18);
        System.out.println(v);
    }}
