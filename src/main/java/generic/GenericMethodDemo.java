package generic;

public class GenericMethodDemo
{
    public static void main(String[] args) {
        String[] array={"abc","xyz"};
        printArray(array);
        Integer[] array1={1,2,3,4,5};
        printArray(array1);
    }

    public static <T> void printArray(T[] array)
    {
     for(T s : array)
     {
         System.out.println(s);
     }
    }
}
