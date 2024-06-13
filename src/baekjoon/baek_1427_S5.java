package baekjoon;

import java.util.Scanner;

public class baek_1427_S5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] charArray = N.toCharArray();
        int[] arr = new int[N.length()];
        String answer = "";

        for(int i =0; i < charArray.length; i++){
            arr[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }

        // 문제풀이
        for(int i =0; i < arr.length-1; i++){
            int max = arr[i];
            int jIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                    jIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[jIndex] = temp;
        }

        for(int i =0; i < arr.length; i++){
            answer += arr[i];
        }

        System.out.println(answer);

    }
}
