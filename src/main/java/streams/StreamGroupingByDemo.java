package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByDemo
{
    public static void main(String[] args) {
        List<Product> productList= Arrays.asList(new Product("Apple",10000),
                new Product("Sum sang",10000),
                new Product("BlackBarry",20000),
                new Product("Sony",30000));

        Map<Integer,List<Product>> product=productList.stream().collect(Collectors.groupingBy(Product::getPrice));
        System.out.println(product);
    }
}
