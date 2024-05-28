package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//백준 11659번 난이도 실버 3
public class gugan_sum_1 {
    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        int[] sumArr = new int[n+1];
        arr[0] = 0;
        sumArr[0] = 0;
        int index_j = 0;
        int index_i = 0;
        for(int i = 1; i< arr.length; i++){
            arr[i] = sc.nextInt();
            sumArr[i] = sumArr[i-1] + arr[i];
        }

        for(int i =0; i < m; i ++){
            index_i = sc.nextInt();
            index_j = sc.nextInt();
            System.out.println(sumArr[index_j] - sumArr[index_i - 1]);
        }
        */
        // 위 방법은 백준에서 통과는 되었지만! 데이터가 많을때 한없이 비효율 적이다.
        // 따라서 자바에서 재공해주는 객체를 이용해보자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine()); // 5 3 입력
        int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 5 들어감
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 3 들어감
        long[] S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(br.readLine()); // 5 4 3 2 1
        for(int i =1; i < S.length; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken()); // 합배열 만듬
        }
        for(int q =0; q < quizNo; q++){
            stringTokenizer = new StringTokenizer(br.readLine()); // 1 3
            int i = Integer.parseInt(stringTokenizer.nextToken()); // 1
            int j = Integer.parseInt(stringTokenizer.nextToken()); // 3
            System.out.println(S[j] - S[i-1]);
        }

    }
}
