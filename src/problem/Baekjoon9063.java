package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon9063 {
    public void problem () {
        Scanner scan = new Scanner(System.in);

        int marble = scan.nextInt();
        ArrayList<Integer> listX = new ArrayList<Integer>();
        ArrayList<Integer> listY = new ArrayList<Integer>();
        for(int i = 0 ; i < marble ; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            listX.add(x);
            listY.add(y);
        }
        int maxX = Collections.max(listX);
        int minX = Collections.min(listX);
        int maxY = Collections.max(listY);
        int minY = Collections.min(listY);
        System.out.println((maxX - minX) * (maxY - minY));

    }
}
