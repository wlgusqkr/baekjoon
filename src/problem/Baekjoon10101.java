package problem;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10101 {
    public void problem () {
        Scanner scan = new Scanner(System.in);

        while(true){

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if ( a == 0 && b == 0 && c == 0) {
                break;
            }


            int[] numbers = new int[3];
            numbers[0] = a;
            numbers[1] = b;
            numbers[2] = c;

            Arrays.sort(numbers);

            if ( numbers[2] < (numbers[0] + numbers[1])) {

                if( a == b ) {
                    if(a != c) {
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Equilateral");
                    }
                }

                if ( a != b ) {
                    if( b == c ) {
                        System.out.println("Isosceles");
                    }
                    else if ( a == c ) {
                        System.out.println("Isosceles");
                    }
                    else {
                        System.out.println("Scalene");
                    }
                }
            } else {
                System.out.println("Invalid");
            }
        }

    }
}
