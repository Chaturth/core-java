package Programs;

public class LoginApplication {
    public static void main(String[] args) {

        String username="chaturth gowda";
        String password="1234";

        String enteredUsername="chaturth gowda";
        String enteredPassword="1234";

        if(username.equals(enteredUsername)&&password.equals(enteredPassword)) {
            System.out.println("acess granted");
        }
        else{
            System.out.println("Access denied");
        }
    }
}
