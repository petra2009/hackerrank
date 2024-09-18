package Task19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(MyRegex.pattern));
        }
    }
}


