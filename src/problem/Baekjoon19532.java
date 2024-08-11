package problem;

import java.util.Scanner;

public class Baekjoon19532 {
    public void problem() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println(a + " " + b + " " +c + " " +d + " " +e + " " +f);
        for( int i = -999 ; i <= 999 ; i++) {
            for ( int j = -999 ; j <= 999 ; j++) {
                if( (a * i) + (b * j) == c) {
                    if( (d * i) + (e * j) == f) {
                        System.out.println(i + " " + j);
                    }

                }
            }
        }
    }
}
