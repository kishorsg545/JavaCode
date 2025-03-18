package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningByDemo
{
    public static void main(String[] args) {
        List<Product> productList= Arrays.asList(new Product("Apple",10000),
                new Product("Sum sang",10000),
                new Product("BlackBarry",20000),
                new Product("Sony",30000));

        Map<Boolean,List<Product>> product1=productList.stream().
                collect(Collectors.partitioningBy(product->product.getPrice()>20000));
        System.out.println(product1);
    }
}
