package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_11004_S5 {
    public static void main(String[] args) throws IOException {
        // 자바 내장 솔트 함수 사용해서 품 s5 수준의 코드임 시간 나면 퀵정렬로 풀어보도록 하자
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i =0; i < n; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(arr[k-1]);

    }

}
