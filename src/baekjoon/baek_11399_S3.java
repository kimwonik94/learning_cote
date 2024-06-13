package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baek_11399_S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i =0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        //문제풀이
        for(int i = 1; i < N; i++){
            boolean findSpot = false;
            int temp = 0;
            int spotIndex =0;
            for(int j = 0; j < i; j++){
                if(arr[i] < arr[j] && !findSpot){
                    findSpot = true;
                    temp = arr[j];
                    spotIndex = j;
                    break;
                }
            }

            if(findSpot){
                for (int j = spotIndex; j <= i; j++){

                    if(j == spotIndex){
                        arr[j] = arr[i];
                    }else{
                        int temp2 = arr[j];
                        arr[j] = temp;
                        temp = temp2;
                    }
                }
            }
        }

        int sum = 0;
        int answer = 0;
        for(int i =0; i < arr.length; i++){
            sum += arr[i];
            answer += sum;
        }
        System.out.println(answer);

    }
}
