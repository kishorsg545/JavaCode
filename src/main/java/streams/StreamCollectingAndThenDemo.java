package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectingAndThenDemo
{
    public static void main(String[] args)
    {
        List<Product> productList= Arrays.asList(new Product("Apple",10000),
                                                new Product("Sum sang",10000),
                                                new Product("BlackBarry",20000),
                                                new Product("Sony",30000));


        String maxproductPrices=productList.stream().
                collect(Collectors.collectingAndThen
                        (Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                                (product-> product.isPresent()?product.get().getName():"None")));

        System.out.println(maxproductPrices);
    }
}
