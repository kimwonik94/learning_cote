import java.util.Arrays;
import java.util.Scanner;

public class grid_2_2 {
    public static void main(String[] args) {
        // 숫자 카드 게임이다.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i<arr.length; i++){
            for(int j =0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // 구현부
        int[] minNums = new int[n];

        for(int i =0; i< n; i++){
            Arrays.sort(arr[i]);
            minNums[i] = arr[i][0];
        }

        Arrays.sort(minNums);

        System.out.println(minNums[n-1]);


        //아래는 정답 예시
        // 조건에서 걸어둔 10000을 이용해 최솟값을 빠르게 찾는다 -> 하지만 개인적으로 현업에서는 이런 제약을 둘것 같지 않아 위 처럼 풀이함
        // (사실 저렇게 할거라고 생각도 못함)
        // 성능 면에서도 나처럼 정렬 하는것 보단 최솟값 최댓값 찾는게 훨 좋아보임
       /* Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        // 한 줄씩 입력 받아 확인하기
        for (int i = 0; i < n; i++) {
            // 현재 줄에서 '가장 작은 수' 찾기
            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            // '가장 작은 수'들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }

        System.out.println(result); // 최종 답안 출력*/

    }
}
