package problem;

import java.util.Scanner;

public class Baekjoon24313 {

    public void problem () {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a0 = scan.nextInt();
        int c = scan.nextInt();
        int n0 = scan.nextInt();

        if( (c - a1) >= 0 && (((c - a1)*(n0) - a0) >= 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
