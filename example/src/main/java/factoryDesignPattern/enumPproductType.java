package factoryDesignPattern;

/**
 * Created by Universal on 2/26/2018.
 */
public enum enumPproductType
{
    product_one (Product.class.getName (), Product.class),
    product_two (Product2.class.getName (), Product2.class);

    private final String _productClassName;
    private final Class<?> _classType;

    enumPproductType(String _productClassName, Class<?> _classType) {
        this._productClassName = _productClassName;
        this._classType = _classType;

    }

    public String get_productClassName() {
        return _productClassName;
    }

    public Class<?> get_classType() {
        return _classType;
    }
}
