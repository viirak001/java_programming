package JavaClassAndObject.ConstructorsIntro;

import java.util.UUID;

class Animal{
        private Integer id;
        private String uuid;
        private String name;
        private String color;
        private String gender;

        // constructor have parameter
        public Animal(Integer id, String uuid, String name, String color, String gender){
            this.id = id;
            this.uuid = uuid;
            this.name = name;
            this.color = color;
            this.gender = gender;
        }

        // constructor don't have parameter
        public Animal(){}

        // create setter following on object...
        public void setId(Integer id){
            this.id = id;
        }

        public void setUuid(String uuid){
            this.uuid = uuid;
        }

        public void setName(String name){
            this.name = name;
        }
        public void setColor(String color){
            this.color = color;
        }
        public void setGender(String gender){
            this.gender = gender;
        }

        // create getter follow on datatype...
        public int getId(){
            return id;
        }

        public String getUuid(){
            return uuid;
        }

        public String getName(){
            return name;
        }

        public String getColor(){
            return color;
        }

        public String getGender(){
            return gender;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "id=" + id +
                    ", uuid='" + uuid + '\'' +
                    ", name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }


public class practice1 {
    public static void main(String[] args) {
        // Animal have parameter : has value
        Animal animals = new Animal(1, UUID.randomUUID().toString(), "Cat", "Black", "Srey");
        System.out.println("Animal : " + animals);

        // because Animal is a constructor don't have parameter: also output : Is null
        Animal animalss = new Animal();
        System.out.println("Animalss : " + animalss);

        // can insert follow on setter and getter
           // insert is .set...id
        animals.setId(1);
           // output is .get
        System.out.println("Animal1 : " + animals.getId());

           // set and get...uuid
        animals.setUuid("A1");
        System.out.println("Animal1 : " + animals.getUuid());

            // set and get ... name
        animals.setName("Tiger");
        System.out.println("Animal1 : " + animals.getName());

            // set and get ... color
        animals.setColor("White");
        System.out.println("Animal1 : " + animals.getColor());

            // set and get ... gender
        animals.setGender("Bros");
        System.out.println("Animal1 : " + animals.getGender());

    }
}
