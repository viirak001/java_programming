package JavaClassAndObject.modelClass;

import java.util.Date;
import java.util.Set;

public class BookClass {
        private Integer id;
        private String uuid;
        private String title;
        private String description;
        private Date publishedDate;
        private Set<String> authors;
        // set info
        public void setBookInfo(Integer id, String bUuid, String bTitle,
                                String bDescription, Date bPublishedDate,
                                Set<String> bAuthors) {
            this.id = id;// using this keyword to identify, it's the class's
            this.uuid = bUuid;
            this.title = bTitle;
            this.description = bDescription;
            this.publishedDate = bPublishedDate;
            this.authors = bAuthors;
        }
        public void getBookInfo(){
            System.out.println("Book ID: "  + this.id);
            System.out.println("Book uuid: " + this.uuid);
            System.out.println("Book title: " + this.title);
            System.out.println("Book Description: " + this.description);
            System.out.println("Book publishedDate: " + this.publishedDate);
            System.out.println("Authors: "  +this.authors);
        }

        // Right Click > Generate > toString :
    @Override
    public String toString() {
        return "BookClass{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishedDate=" + publishedDate +
                ", authors=" + authors +
                '}';
    }
}
