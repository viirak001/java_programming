package JavaClassAndObject.modelClass;

    // This is Class:
public class ProductClass {
    private Integer id;
    private String code;
    private String name;
    private Double price;
    private Integer qty;

    public void setProductInfo(Integer pId, String pCode, String pName, Double pPrice, Integer pQty){
        id = pId;
        code = pCode;
        name = pName;
        price = pPrice;
        qty = pQty;
    }

    public void getProductInfo(){
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Product Code : " + code);
        System.out.println("Product Price : " + price);
        System.out.println("Product Qty : " + qty);
    }
}
