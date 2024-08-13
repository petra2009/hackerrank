package Task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for (int k = 0; k < n; k++) {
                int q = (int) Math.pow(2, k);
                res += q * b;
                System.out.print(res + " ");
            }
            System.out.println();
        }
        in.close();


    }
}
