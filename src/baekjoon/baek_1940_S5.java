package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baek_1940_S5 {
    /*
    난 이게 왜 틀렸는지 모르겠다..
    어찌됐든 투포인터를 시작점과 시작점 다음 점을 잡도록 생각한건 아쉬운 부분인걸 인정한다
    시작점과 끝점을 잡으면 코드가 훨씬 간결해지고 실행속도도 빨랐을 것이다.
    근디 밑의 코드의 반례를 못찾겠다...

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int startIndex = 0;
        int endIndex = 1;
        int count = 0;
        // 2개 씩임
        while(startIndex != n-1){
           int sum = arr[startIndex] + arr[endIndex];
           if(sum  < m){
               if(endIndex == n-1){
                   startIndex++;
               }
               else {
                   endIndex++;
               }
           }
           else if(sum > m){
               startIndex++;
               endIndex = startIndex + 1;
           }
           else{
               startIndex++;
               count++;
               endIndex = startIndex+1;
           }

        }

        System.out.println(count);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int i = 0;
        int j = n-1;
        int count = 0;
        // 2개 씩임
        while(i < j){
            if(arr[i] + arr[j] < m){
                i++;
            }
            else if (arr[i] + arr[j] > m){
                j--;
            }
            else{
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);
    }
}
