package baekjoon;

import java.io.*;
import java.util.Arrays;

public class baek_2751_S5 {
    public static void main(String[] args) throws IOException {
        // 이것도 병합정렬을 사용안하고 자바 내장 함수를 이용함 우선 순위를 뒤로함 딱 난이도 만큼만 푼거임
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];

        for(int i =0; i < n; i++){
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(arr);

        for(int i =0; i < n; i++){
            bufferedWriter.write(arr[i] + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
