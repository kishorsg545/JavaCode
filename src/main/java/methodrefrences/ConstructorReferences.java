package methodrefrences;

public class ConstructorReferences
{
    public static void main(String[] args)
    {
        InterfaceProduct product=(a,b)->new Product(a,b);
        System.out.println(product.getProduct("Apple",3.4));

        InterfaceProduct product1=Product::new;
        System.out.println(product1.getProduct("Apple",3.4));
    }
}
