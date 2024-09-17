package Task18;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("valid");
                testCases -= 1;
            } catch (PatternSyntaxException e) {
                System.out.println("invalid");
                testCases -= 1;
            }
        }
    }


}
