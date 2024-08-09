package problem;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon2798 {
    public void problem() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N ; k++) {
                    int result = list.get(i) + list.get(j) + list.get(k);
                    resultList.add(result);
//                    if(result == M) {
//                        System.out.println(result);
//                        break;
//                    }
                }
            }
        }

        int max = 0;

        for ( int i = 0 ; i < resultList.size() ; i++ ) {
            if ( resultList.get(i) > max && resultList.get(i) <= M ) {
                max = resultList.get(i);
            }
        }
        System.out.println(max);
    }
}
