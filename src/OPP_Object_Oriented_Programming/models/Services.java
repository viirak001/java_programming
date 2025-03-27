package OPP_Object_Oriented_Programming.models;

public class Services {
    public static void main(String[] args) {
        Users users = new Users();

        // set data:
        users.setId(1);
        users.setName("Mo");
        users.setEmail("Virak123@gmail.com");
        users.setPassword("12345");
        users.setProfile("Mo Mor");

        // get data:
        System.out.println("User ID : " + users.getId());
        System.out.println("User Name : " + users.getName());
        System.out.println("User Email : " + users.getEmail());
        System.out.println("User Password : " + users.getPassword());
        System.out.println("User Profile : " + users.getProfile());
    }
}
