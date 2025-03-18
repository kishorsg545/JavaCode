package streams;

import java.util.List;
import java.util.Optional;

public class StreamFindMatchOperationDemo
{
    public static void main(String[] args) {
        List<Item> item= getItems();
        // Check if all items in stock
        boolean allInStock=item.stream().allMatch(Item::isInStock);
        System.out.println(allInStock);

        // Check if any item is on sale
        boolean anyOnSale =item.stream().anyMatch(Item::isOnSale);
        System.out.println(anyOnSale);

        // Check if any item is out of stock
        boolean anyOutOfStock =item.stream().anyMatch((item1->!item1.isInStock()));
        System.out.println(anyOutOfStock);

        // Check if all items are less than or equal to 5000
        boolean isAnyCostlyProduct = item.stream().noneMatch(item2 -> item2.getPrice()>5000);
        System.out.println(isAnyCostlyProduct); // true

        // Fetch a random item that has price greater than 1000
        Optional<Item> randomItemOptional = item.stream().filter(item3 -> item3.getPrice()>1000).findAny();
        System.out.println(randomItemOptional);

        // Fetch first item that has price greater than 1000
        Optional<Item> firstItemOptional = item.stream().filter(item4 -> item4.getPrice()>1000).findFirst();
        System.out.println(firstItemOptional);
    }

    private static List<Item> getItems()
    {
        return List.of(
                new Item("Laptop",1200,true,false),
                new Item("Smartphone", 800, true, true),
                new Item("Headphones", 150, false, true),
                new Item("Camera", 2000, true, true),
                new Item("Smartwatch", 300, true, false)

        );
    }
}
