package baekjoon;

import java.io.IOException;
import java.util.Scanner;


public class baek_13981_G3 {
    public static void main(String[] args)  {
        // 다시 풀기 반드시 필요
        // 경우의 수 -> 콤비네이션
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int answer = 0;
        int[] sum = new int[N];
        int[] na  = new int[M];

        sum[0] = sc.nextInt();
        for(int i =1; i < N; i++){
            sum[i] = sum[i-1] + sc.nextInt();
        }

        // 합 집합에서 %3하면서 같은 경우의 수 찾기



    }
}
