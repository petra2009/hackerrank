package Task14;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        sc.close();

        String smallest = str.substring(0, k);
        String largest = str.substring(0, k);

        String[] abc = new String[str.length() - k + 1];
        for (int i = 0; i < str.length() - k + 1; i++) {
            abc[i] = str.substring(i, i + k);
        }

        for (int i = 0; i < abc.length - 1; i++) {
            char[] chars = abc[i].toCharArray();
            char[] charsS = smallest.toCharArray();
            char[] charsL = largest.toCharArray();
            for (int j = 0; j < k; j++) {
                if ((int) charsS[j] > (int) chars[j]) {
                    smallest = abc[i];
                    break;
                } else if ((int) charsS[j] == (int) chars[j]) continue;
                else break;
            }
            for (int j = 0; j < k; j++) {
                if ((int) charsL[j] < (int) chars[j]) {
                    largest = abc[i];
                    break;
                } else if ((int) charsL[j] == (int) chars[j]) continue;
                else break;
            }
        }

        System.out.println(smallest + "\n" + largest);
    }
}
