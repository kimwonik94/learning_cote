package grid;

import java.util.Scanner;

public class grid_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer = Integer.valueOf(str.substring(0, 1));

        for(int i =0; i < str.length()-1; i++){
            int a = Integer.valueOf(str.substring(i, i + 1));
            int b = Integer.valueOf(str.substring(i+1,i+2));
            if(a <= 1){
                answer += b;
            }
            else{
                answer *= b;
            }

        }
        System.out.println(answer);
    }
}
