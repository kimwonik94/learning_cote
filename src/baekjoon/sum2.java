// 백준 1546번 브론즈1
package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float[] arr = new float[N];
        float answer = 0;
        float max = 0;
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        max = arr[N-1];

        for(int i = 0; i<arr.length; i++){
            answer += arr[i]/max*100;
        }

        System.out.println(answer/N);
    }
}
