package interfacepackeges;

public interface Hero
{
    default void walk() {
        System.out.println("Walking");
    }
}
