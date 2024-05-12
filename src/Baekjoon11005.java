import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon11005 {
    public void baekjoon11005 () {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> shareArray = new ArrayList<Integer>();
        int N = scan.nextInt();
        int B = scan.nextInt();
        int share = N;
        int remain = 0;

        while(share != 0) {
            remain = share % B;
            share = share / B;
            shareArray.add(remain);
        }
        for(int i = 0 ; i < shareArray.size(); i++) {
            int data = shareArray.get(i);
            if(data >= 10) {
                data = data + 55;
                shareArray.set(i, data);
            } else {
                data = data + 48;
                shareArray.set(i, data);
            }
        }
        ArrayList<Character> charList = new ArrayList<Character>();

        for (int i : shareArray) {
            charList.add((char)i);
        }
        Collections.reverse(charList);

        for(Character c : charList){
            System.out.print(c);
        }
    }
}
