package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baek_1377_G2 {
    public static void main(String[] args) {
        // 그냥 버블 정렬로 쉽게 풀수 있지 않나 했지만 n이 최대 5십만이라 n2 의 시간복잡도상 시간초과가 나옴
        // 그래서 sort를 사용해 정렬 후에 답을 도출할 방법을 찾아야함 sort는 nlogn 이기 때문
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] sortArr = arr;
        Arrays.sort(sortArr);
        int max = 0;

        // 문제풀이
        // 기존 인덱스 에서 정렬 후 인덱스를 뺀 값의 맥스 값이 내부 순환 횟수와 일치하다
        // 이건 꼭 다시 풀어봐야해




    }
}
