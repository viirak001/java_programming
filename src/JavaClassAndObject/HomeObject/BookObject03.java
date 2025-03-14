package JavaClassAndObject.HomeObject;

import JavaClassAndObject.modelClass.BookClass;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;

public class BookObject03 {
    public static void main(String[] args) {
        BookClass book = new BookClass();
        book.setBookInfo(1, UUID.randomUUID().toString(),
                "Tom and Jerry","This  is cartoon book",
                Date.from(Instant.now()), new TreeSet<>(List.of("Jame","Jonh")));
//        book.getBookInfo(); // or
        System.out.println(book);
    }
}
