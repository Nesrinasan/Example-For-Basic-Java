package factoryDesignPattern;

/**
 * Created by Universal on 2/26/2018.
 */
public class ProductFactory {

    public IProduct makeProduct(enumPproductType enumPproductType) {

        IProduct product = null;
        if (enumPproductType.name().equals("product_one")) {

            product = new Product();

        } else if (enumPproductType.name().equals("product_two")) {
            product = new Product2();
        }
        return product;
    }
}
