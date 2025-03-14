package JavaClassAndObject.HomeWorkContruction;

import java.util.*;

public class MovieClass {
        private Integer id;
        private String uuid;
        private String title;
        private String description;
        private Date time;
        private List<String> categories;

        public MovieClass(Integer id, String uuid, String title, String description, Date time, List<String>categories){
            setMovieDetail(id, uuid, title, description, time, categories);
        }


        public void setMovieDetail(Integer id, String uuid, String title, String description, Date time, List<String> categories) {
            this.id = id;
            this.uuid = uuid;
            this.title = title;
            this.description = description;
            this.time = time;
            this.categories = categories;
        }

        @Override
        public String toString() {
            return "ListClass{" +
                    "id=" + id +
                    ", uuid=" + uuid +
                    ", title='" + title + '\'' +
                    ", description='" + description + '\'' +
                    ", time=" + time +
                    ", categories='" + categories + '\'' +
                    '}';
        }

}

