package problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon2231 {
    public void problem() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        double[] digitsList = new double[10];

        int N = scan.nextInt();
        int count = 0;
        int remain = N;
        while ( remain >= 10 ) {
            remain = remain / 10;
            count++;
        }

        for (int i = 0; i < N; i++) {
            double tmpI = i;
            for(int j = count; j >= 0; j--){
                digitsList[j] = Math.floor(tmpI / Math.pow(10, j));
                tmpI = tmpI % Math.pow(10, j);
            }
            double sum = 0;
            for(double k : digitsList) {
                sum += k;
            }
            if( sum + i == N){
                list.add(i);
            }
        }


        int min = 0;
        if (list.isEmpty()) {
            System.out.println('0');
            return ;
        } else {
            min = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
        }
        System.out.println(min);

    }
}