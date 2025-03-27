package OPP_Object_Oriented_Programming.Encapsulations;

    class Product{
        ///  if u declare public or protected u don't create setter and getter. but u declare private u should
        private String name;

        // create setter
        public void setName(String name){
            this.name = name;
        }

        // Create getter : Getter following on Data-Type
        public String getName(){
            return this.name;
        }
    }
public class EncapIntro {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Vu");
//        System.out.println(product.getName());
        product.getName();
    }
}
