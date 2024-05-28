package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_11660_S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long answer = 0;

        long[][] S = new long[suNo+1][suNo+1];

        for(int i = 1; i <= suNo; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= suNo; j++){
                S[i][j] = S[i][j-1] + Long.parseLong(stringTokenizer.nextToken());
            }
        }

        for(int i =0; i < quizNo; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int row1 = Integer.parseInt(stringTokenizer.nextToken());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int row2 = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());

            for (int j = row1; j <= row2; j++){
                if(j == row1 || j == row2){
                    answer += S[j][end] - S[j][start-1];
                }
                else{
                    answer += S[j][suNo];
                }
            }

            System.out.println(answer);
            answer = 0;
        }

    }
}
