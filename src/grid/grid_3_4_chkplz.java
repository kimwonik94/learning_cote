package grid;

import java.util.Arrays;
import java.util.Scanner;

public class grid_3_4_chkplz {
    public static void main(String[] args) {
        // ------- 24년 5월 14일 -------
        // 타임 오버로 풀지 못한 문제...
        // 내가 얼마나 사고력이 낮은지 반성...
        // 해당 문제가 이해가 안되면 그리디 알고리즘 문제 경험이 적은 것이라고 한다.. 학습하자

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int answer =1;

        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // 구현부
        Arrays.sort(arr);
        for(int num : arr){
            if(answer < num){
                break;
            }
            answer += num;

        }

        System.out.println(answer);
    }
}
