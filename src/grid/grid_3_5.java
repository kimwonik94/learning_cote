package grid;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class grid_3_5 {
    public static void main(String[] args) {
        // 내가 푼 방식
        // 1,3,2,3,2를 sort한다. -> 앞과 뒤 숫만 비교하며 일치한 값을 측정한다. -> 4+3+2+1을 한 합계에 일치한 값을 빼준다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += i;
        }

        // 구현부
        int sameCount = 0;
        Arrays.sort(arr);
        for(int i =0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                sameCount++;
            }
        }

        System.out.println(sum - sameCount);
    }

    // 아래는 풀이
    // 내가 풀이한것과 비교해보자
    // 우선 난 치명적으로 입력 예시를 정확히 지키지 않았으며 입력 조건또한 지키지 않았다. 이건 주의해야할 사항이다.
    // 시간 복잡도에서 극명하게 차이난다.
    // 입력 조건을 이용해서 배열을 미리 만들어 무게에 따른 원소 값을 +1 해준다
    // 와 근디 이거 솔직히 첨 풀때 이 방법 생각한 사람 있나? 난 못함... 그리드 유형 문제 계속 풀어서 그냥 수학 풀이 처럼 해야할것 같음
    /*
    public static int n, m;
    // 1부터 10까지의 무게를 담을 수 있는 배열
    public static int[] arr = new int[11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x] += 1;
        }
    // arr = 0, 1, 2, 2, 0 ,0 ....
        int result = 0;

        // 1부터 m까지의 각 무게에 대하여 처리
        for (int i = 1; i <= m; i++) {
            n -= arr[i]; // 무게가 i인 볼링공의 개수(A가 선택할 수 있는 개수) 제외
            result += arr[i] * n; // B가 선택하는 경우의 수와 곱해주기
        }

        System.out.println(result);
    }

    * */
}
