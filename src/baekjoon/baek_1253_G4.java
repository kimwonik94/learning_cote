package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_1253_G4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int answer = 0;
        long A[] = new long[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i =0; i< N; i++){
            A[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        Arrays.sort(A);

        // 문제 풀이
        // 나는 찾는 수를 단순히 j 인덱스로 부터 +1씩해서 찾는걸로 했었다.
        // 하지만 풀이는 애초에 k라는 인덱스를 통해 찾는 수를 고정 시켰다 이러면 count가 반복 되지 않는다. 와우
        for(int K = 0; K < N; K++){
            int i =0;
            int j = N-1;
            while (i<j){
                if(A[i] + A[j] == A[K]){
                    // 0 1 1 ... 을 생각해봐라 이러면 1이 두번 카운트 된다. 따라서 서로 다른 위치의 합으로만 찾도록 한다
                    if(i != K && j != K){
                        answer++;
                        break;
                    }
                    else if(i == K){
                        i++;
                    }
                    else if(j == K){
                        j++;
                    }
                }
                else if (A[i] + A[j] < A[K]) {
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        System.out.println(answer);
    }
}
