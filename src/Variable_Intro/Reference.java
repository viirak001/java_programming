package Variable_Intro;

//  Reference Type

    class User{
        public int id;
        public String name;
        public String email;
        public String boss;
    }

    enum Status{
        FAILED,
        SUCCESS
    }

public class Reference {
    public static void main(String[] args) {
        Status status = Status.SUCCESS;
        System.out.println(status);
        User user = new User();
        user.id = 12;
        user.name = "Jame";
        user.email = "jame123@gmail.com";
        user.boss = "Nono";
        System.out.println(user.boss);
        System.out.println(user.name);
        System.out.println(user.email);
    }
}
