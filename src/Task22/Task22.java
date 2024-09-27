package Task22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {

    public static void main(String[] args) {

        String[] str = {
                "<h1>Nayeem loves counseling</h1>",
                "<SA premium>Imtiaz has a secret crush</SA premium>",
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
                "<Amee>safat codes like a ninja</amee>"};

        Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");

        for (int i = 0; i < 4; i++) {
            Matcher matcher = p.matcher(str[i]);
            if (matcher.find()) {
                do {
                    System.out.println(matcher.group(2));
                }
                while (matcher.find());
            } else      System.out.println("None");
        }
    }
}
