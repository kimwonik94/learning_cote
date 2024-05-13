package grid;

import java.util.Scanner;

public class grid_3_3 {
    public static void main(String[] args) {
        // 이건 내가 문제를 이해 못했다...
        // 문제 해설을 보고 코딩했다..
        // 0 과 1로 모든 숫자를 바꿀때 둘중 하나 최소로 바꾸는 횟수를 구하라는 거였다.
        // 하나 이상의 연속된 숫자만!

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count0 = 0;
        int count1 = 0;

        // 하나 이사의 연속된 숫자이니 우선 첫번째 원소에 대한 처리
        if(str.charAt(0) == '0'){
            count1 += 1;
        }
        else{
            count0 += 1;
        }

        for(int i =0; i < str.length()-1; i++){
            if(str.charAt(i+1) != str.charAt(i)){
                if(str.charAt(i+1) == '1') count0 += 1;
                else count1 += 1;
            }
        }

        System.out.println(Math.min(count0, count1));




    }
}
