package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_11660_S1 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
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
        }*/

        // 자 위의 코드가 틀린 이유는?
        // 2 1 4 2 처럼 오른쪽이 계산 포함 안되는 경우도 있음 그런대 내경우에는 무조건 왼쪽이 계산 포함 안되는 경우라고 기정한 코드
        // 이걸 고려 하고자 코드를 수정하면 너무 복잡해짐
        // 그러니 이차원 배열상에서 합을 가로뿐만 아닌 세로도 포함 한 합배열을 놔두어야 오른쪽, 왼쪽 신경을 안써도 됨
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        int[][] A = new int[suNo+1][suNo+1];
        int[][] S = new int[suNo+1][suNo+1];
        long answer = 0;

        // 일반 배열 만들기
        for(int i =1; i < suNo+1; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j =1; j < suNo+1; j++){
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        // 합배열 만들기
        for(int i =1; i < suNo+1; i++){
            for (int j =1; j<suNo+1; j++){
                S[i][j] = S[i-1][j] + S[i][j-1] - S[i-1][j-1] + A[i][j];
            }
        }

        for(int i = 0; i < quizNo; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            answer = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];

            System.out.println(answer);
            answer = 0;
        }
    }
}
