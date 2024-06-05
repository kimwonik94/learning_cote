package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_12891_S5 {
    static int checkArr[];
    static int myArr[];
    static int right = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int s = Integer.parseInt(stringTokenizer.nextToken());
        int p = Integer.parseInt(stringTokenizer.nextToken());
        int result = 0;
        checkArr = new int[4];
        myArr = new int[4];
        char A[] = new char[s];

        A = bufferedReader.readLine().toCharArray();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i =0; i < 4; i++){
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(checkArr[i] == 0){
                right++;
            }
        }

        // 첫번째문자 0부터 시작인 경우 처리
        for(int i =0; i<p; i++){
            Add(A[i]);
        }
        if(right == 4){
            result++;
        }

        // 그담 슬라이딩 부분 처리
        for(int i = p; i<s; i++){
            int j = i-p;
            Add(A[i]);
            remove(A[j]);
            if(right == 4){
                result++;
            }
        }
        System.out.println(result);


    }

    private static void Add(char c){
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]){
                    right++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    right++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    right++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    right++;
                }
                break;
        }
    }

    private static void remove(char c){
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]){
                    right--;
                }
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]){
                    right--;
                }
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]){
                    right--;
                }
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]){
                    right--;
                }
                myArr[3]--;
                break;
        }
    }



}
