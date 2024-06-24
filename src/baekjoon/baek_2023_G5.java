package baekjoon;

import java.util.Scanner;

public class baek_2023_G5 {
    // 꼭 다시 풀어보세요
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(2,1);
        dfs(3,1);
        dfs(5,1);
        dfs(7,1);

    }

    public static void dfs(int num, int jari){
        // 여기서 판단.. 자릿수가 일치하고 소수 이면
        if(jari == n){
            if(isPrime(num)){
                System.out.println(num);
            }
            return;
        }

        // 자릿수가 안맞으니 자릿수를 넓여야 겠지
        // 뒷 숫자
        for(int i = 1; i < 10; i++){
            // 뒷숫자가 짝수다? 무조건 소수 아님
            if(i % 2 ==0){
                continue; // 시간 복잡도 줄이기 위함
            }
            // 뒷 숫자를 붙였을때 소수냐 판단
            if(isPrime(num * 10 + i)){
                // 소수면 자릿수가 맞을시 출력해야 하고 자릿수 안맞으면 더 깊게 들어가야 하므로 재귀 함수 ㄱ
                dfs(num * 10 + i, jari + 1);
            }
        }
    }

    // 소수 구하기 로직
    public static boolean isPrime(int num){
        for(int i =2; i <= num / 2; i++){
            if(num % i == 0){
                return  false;
            }
        }
        return true;
    }

}
