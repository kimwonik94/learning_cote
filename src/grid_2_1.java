import java.util.Arrays;
import java.util.Scanner;

public class grid_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int first = arr[arr.length-1];
        int second = arr[arr.length-2];

        // 6665, 6665 수열 m = 8, n = 3
        // 최댓값 6이 총 6번 나오는데 어떻게 구할까?
        // 수열의 총길이는 n+1이다. 그럼 m / (k+1) 은 수열 의 총 갯수다
        // m / (k+1) * k 하면 6이 몇번인지 구할수 있다.
        int count = m/(k+1) * k;
        // 나머지가 있느 경우도 있으니 아래 추가
        count += m%(k+1);

        int answer = count * first; // 최대
        answer += (m-count) * second ; // 차최대

        System.out.println(answer);

    }
}