package Task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 1;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        while (sc.hasNext()) {
            System.out.print(n++ + " ");
            System.out.println(sc.next());
        }
    }
}
