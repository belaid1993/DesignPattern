package builder;

public class Main {

    public static void main(String[] args) {

        User user = new User.Builder().setAge(27).setPrenom("reda").build();


        System.out.println(user);


    }
}
