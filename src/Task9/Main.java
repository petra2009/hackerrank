package Task9;

import java.util.Scanner;

public class Main {

    static int b;
    static int h;
    static boolean flag;

    static {
        try {
            Scanner sc = new Scanner(System.in);
            b = sc.nextInt();
            h = sc.nextInt();
            if (b <= 0 || h <= 0) throw new Exception("java.lang.Exception: Breadth and height must be positive");
            flag = true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = b * h;
            System.out.println(area);
        }

    }
}
