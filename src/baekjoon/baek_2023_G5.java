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
        if(jari == n){
            if(isPrime(num)){
                System.out.println(num);
            }
            return;
        }

        // num을 늘려야지
        for(int i = 1; i < 10; i++){
            if(i % 2 == 0){ // 짝수면 무조건 소수 아냐
                continue;
            }
            if(isPrime(num * 10 + i)){
                dfs(num * 10 + i, jari + 1);
            }
        }
    }

    public static boolean isPrime(int num){
        for(int i =2; i <= num /2; i++){
            if(num % i ==0) return false;
        }
        return true;
    }




}
