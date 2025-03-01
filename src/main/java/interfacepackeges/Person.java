package interfacepackeges;

public interface Person
{

    public static void main(String[] args) {
        System.out.println("I am able to use main method");
    }
    default void walk() {
        System.out.println("Walking");
    }
}
