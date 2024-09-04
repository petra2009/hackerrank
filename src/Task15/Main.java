package Task15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "yes";
        int k;

        if (str.length() % 2 == 0) k = str.length() / 2;
        else k = (str.length() - 1) / 2;

        for (int i = 0; i < k; i++) {
            if (str.substring(i, i + 1).equals(str.substring(str.length() - 1 - i, str.length() - i))) continue;
            else {
                result = "No";
                break;
            }
        }
        System.out.println(result);
    }

}
