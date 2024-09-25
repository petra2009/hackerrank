package Task19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {

    static String pattern = "^(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";

    boolean myRegex(String ip) {

        Pattern pattern = Pattern.compile(MyRegex.pattern);
        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();
    }
}
