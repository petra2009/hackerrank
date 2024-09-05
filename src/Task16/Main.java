package Task16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        else {
            String a1 = a.toLowerCase();
            String b1 = b.toLowerCase();
            char[] charA1 = a1.toCharArray();
            char[] charB1 = b1.toCharArray();
            Map<String, Integer> character1 = new HashMap<>();
            Map<String, Integer> character2 = new HashMap<>();

            for (int i = 0; i < charA1.length; i++) {
//                String keys;
                int s = 0;
                for (int k = 0; k < charB1.length; k++) {
                    if (charA1[i] == charB1[k]) {
                        character1.put(valueOf(charA1[i]), ++s);
                    }
                }
            }
            for (int i = 0; i < charB1.length; i++) {
//                String keys;
                int s = 0;
                for (int k = 0; k < charA1.length; k++) {
                    if (charB1[i] == charA1[k]) {
                        character2.put(valueOf(charB1[i]), ++s);
                    }
                }
            }

            if (character1.equals(character2)) return true;
            else return false;

        }
    }
}
