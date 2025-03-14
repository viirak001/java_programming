package JavaClassAndObject.HomeWorkContruction;

import java.time.Instant;
import java.util.*;

public class MovieObject {
    public static void main(String[] args) {
        List<MovieClass> movielist = new ArrayList<>();

        movielist.add(new MovieClass(1, UUID.randomUUID().toString(), "KungFu_1", "KungFu Tiger 1", Date.from(Instant.now()), Arrays.asList("Drama1")));
        movielist.add(new MovieClass(2, UUID.randomUUID().toString(), "KungFu_2", "KungFu Tiger 2", Date.from(Instant.now()), Arrays.asList("Drama2")));
        movielist.add(new MovieClass(3, UUID.randomUUID().toString(), "KungFu_3", "KungFu Tiger 3", Date.from(Instant.now()), Arrays.asList("Drama3")));
        movielist.add(new MovieClass(4, UUID.randomUUID().toString(), "KungFu_4", "KungFu Tiger 4", Date.from(Instant.now()), Arrays.asList("Drama4")));
        movielist.add(new MovieClass(5, UUID.randomUUID().toString(), "KungFu_5", "KungFu Tiger 5", Date.from(Instant.now()), Arrays.asList("Drama5")));

        System.out.println(movielist);
    }
}
