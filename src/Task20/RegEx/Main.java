package Task20.RegEx;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Main {

    public static void main(String[] args) {

        String[] s = {"[csw]", "cave"};

        if (s.length != 2) {
            System.err.println("usage: java RegexDemo regex input");
            return;
        }

        s[1] = s[1].replaceAll("\\\\n", "\n");

        try {
            System.out.println("regex = " + s[0]);
            System.out.println("input = " + s[1]);
            Pattern p = Pattern.compile(s[0]);
            Matcher m = p.matcher(s[1]);
            while (m.find()) {
                System.out.println("Found [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));
            }
        } catch (PatternSyntaxException pse) {
            System.err.println("Неправильное регулярное выражение: " + pse.getMessage());
            System.err.println("Описание: " + pse.getDescription());
            System.err.println("Позиция: " + pse.getIndex());
            System.err.println("Неправильный шаблон: " + pse.getPattern());
        }
    }
}
