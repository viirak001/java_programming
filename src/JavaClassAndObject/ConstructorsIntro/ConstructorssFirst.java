package JavaClassAndObject.ConstructorsIntro;

    class Book{
        private Integer id;
        private String title;

        // Constructor
        public Book(){}
        public Book(Integer id, String title){
            this.id = id;
            this.title = title;
        }

        // setter : started : set...following void.
        public void setId(Integer id){
            this.id = id;
        }
        public void setTitle(String title){
            this.title = title;
        }

        // Getter : started : get...following on Data_type
        public int getId(){
            return this.id;
        }
        public String getTitle(){
            return this.title;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    '}';
        }
    }

public class ConstructorssFirst {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Hello");
        // call setter
        book1.setTitle("Hi");

        // print getter
        System.out.println("Value of Object 1 : " + book1.getTitle());

        Book book2 = new Book();
        // call setter
        book2.setId(12);

        // print getter
        System.out.println("Value of Object 2 : " + book2.getId());
    }
}
