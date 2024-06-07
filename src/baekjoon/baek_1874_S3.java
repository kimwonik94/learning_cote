package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class baek_1874_S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stackCurrentNum = 0;
        //String과 Stringbuffer 사용 여부에 따라 메모리 초과가 나왔네? 그 이유를 블로그에 업로드 해야지! (백준 1874번)
        StringBuffer stackProcess =  new StringBuffer();
        boolean possible = true;
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i < n; i++){
            int scInt = sc.nextInt();
            // 쌓기
            while (stackCurrentNum < scInt){
                stackCurrentNum++;
                stack.push(stackCurrentNum);
                stackProcess.append("+\n");
            }
            int popInt = stack.pop();
            if(popInt != scInt){
                possible = false;
            }
            else{
                stackProcess.append("-\n");
            }
        }
        System.out.println(possible ? stackProcess.toString() : "NO");
    }
}
