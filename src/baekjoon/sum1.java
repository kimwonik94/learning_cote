package baekjoon;

import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char[] chars = str.toCharArray();
        int answer = 0;
        for(char ch : chars){
            answer += ch - '0';
        }

    }
}
