package Task17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String s1 = s.trim();

        if (s1.length() > 0) {
            String[] str1 = s1.split(" +|, +|,|' +|'|\\? +|\\?|!+ +|!|_ +|_|\\. +|\\.|@ +|@");

            System.out.println(str1.length + ", " + Arrays.toString(str1));

        } else System.out.println(0);
    }
}
