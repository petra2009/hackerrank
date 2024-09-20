package Task20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String regex = "(?i)\\b([a-z]+?)\\b.*\\b\\1\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0 ) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            List<String> mat = new ArrayList<>();

            while (m.find()) {
//                System.out.println(input);
                mat.add(m.group());
                input = input.replaceAll(p.pattern() , "$1");
//                System.out.println(input);
            }

            System.out.println(mat.toString());
            System.out.println(input);
        }
        in.close();
    }
}
