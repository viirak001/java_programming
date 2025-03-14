package JavaClassAndObject.HomeObject;

    // import the productClass to use :
import JavaClassAndObject.modelClass.ProductClass;

    // This is Object :
public class ProductObject02 {
    public static void main(String[] args) {

        // Insert the value :
        ProductClass product1 = new ProductClass();
        product1.setProductInfo(1, "A-001", "Coca-Cola", 1.5, 500);

        // output the result :
        product1.getProductInfo();
    }
}
