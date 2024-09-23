package Task21;


public class Main {

    public static void main(String[] args) {

        String str = "Samantha";
        if (str.matches(UsernameValidator.pat)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }
}

class UsernameValidator {

    static String pat = "^[a-zA-Z][a-zA-Z0-9_]{7,30}";

}