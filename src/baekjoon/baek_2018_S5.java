package baekjoon;

import java.util.Scanner;

public class baek_2018_S5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int startIndex = 1;
        int endIndex =1;
        int sum = 1;
        int count =1;
        while(endIndex != n){
            if(sum < n){
                endIndex++; sum += endIndex;
            }
            else if(sum > n){
                sum = sum -startIndex; startIndex++;
            }
            else{
                count++;
                endIndex++;
                sum += endIndex;
            }
        }
        System.out.println(count);
    }
}
