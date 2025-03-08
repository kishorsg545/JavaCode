package generic;

public class GenericCodeDemo
{
    public static void main(String[] args) {
        GenericPair<Integer, String> pair = new GenericPair<>(1, "Hello");
        pair.setFirst(2);
        pair.setSecond("World");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
