package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon14215 {
    public void problem () {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        Integer[] array = {a, b, c};

        for(int i = array.length - 1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        while (!is_triangle(array[0], array[1], array[2])) {
            array[0]--;
        }
        System.out.println(array[0] + array[1] + array[2]);

    }

    private boolean is_triangle (int a, int b, int c) {

        return (a + b) > c && (b + c) > a && (c + a) > b;
    }
}
