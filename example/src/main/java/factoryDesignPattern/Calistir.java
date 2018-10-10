package factoryDesignPattern;

/**
 * Created by Nesrin ÜLGAY on 2/26/2018.
 */
public class Calistir {

    public static void main(String[] args) {

        ProductFactory productFactory = new ProductFactory ();
        IProduct product = productFactory.makeProduct(enumPproductType.product_one);
        System.out.println(product.getUrunFiyat());

        IProduct product1 = productFactory.makeProduct(enumPproductType.product_two);
        Product2 product2 = (Product2) product1;
        System.out.println(product1.getUrunFiyat());
        System.out.println(product2.getKategoriAd());

    }
}
