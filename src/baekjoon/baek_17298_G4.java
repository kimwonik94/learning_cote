package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class baek_17298_G4 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] a = new int[n];
        int[] answer = new int[n];
        StringBuffer stringBuffer = new StringBuffer();
        String[] str = bufferedReader.readLine().split(" ");
        for(int i =0; i<a.length; i++){
            a[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        for(int i =1; i<n; i++){
            while (!stack.empty() && a[stack.peek()] < a[i]){
                answer[stack.pop()] = a[i];
            }
            stack.push(i);
        }

        while(!stack.empty()){
            answer[stack.pop()] = -1;
        }

        for(int i =0; i < answer.length; i++){
            stringBuffer.append(answer[i] + " ");
        }

        System.out.println(stringBuffer.toString());


        // 제한 시간 1초 처음에는 스택 없이 풀수 있는 간단 한 문제라고 생각하며 품
        // 당연히 시간 초과가 나옴 최악의 경우는 n2이라...
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] answerArr = new int[n];
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<Integer>();

        //풀이
        for(int i = 0; i<arr.length; i++){
            if(stack.empty()){
                stack.push(i);
                continue;
            }
            int stackIndex = stack.size();

            while(stackIndex >= 1){
                if(arr[i] > arr[stack.peek()]){
                    answerArr[stack.peek()] = arr[i];
                    stack.pop();
                }
                stackIndex--;
            }
            stack.push(i);
        }

        int stackSize = stack.size();
        for(int i =0; i < stackSize; i++){
            answerArr[stack.pop()] = -1;
        }

        for(int i =0; i < answerArr.length; i++){
            stringBuffer.append(answerArr[i] + " ");
        }

        System.out.println(stringBuffer.toString());


        for(int i = 0; i< arr.length; i++){
            int index = i+1;
            int result = -1;
            while(index < arr.length){
                if(arr[i] < arr[index]){
                    result = arr[index];
                    break;
                }
                index++;
            }
            stringBuffer.append(result + " ");
        }

        System.out.println(stringBuffer.toString());*/



    }
}
