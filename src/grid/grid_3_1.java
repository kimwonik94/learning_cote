package grid;

import java.util.Arrays;
import java.util.Scanner;

public class grid_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i =0; i < x; i++){
            arr[i] = sc.nextInt();
        }
        // 구현부
        Arrays.sort(arr);
        int calX = x;
        int answerCount = 0;
        /*while(calX >= 0){
            if(calX == 1){
                if(arr[0] == 1){
                    answerCount++;
                }
                break;
            }
            calX -= arr[calX-1];
            answerCount++;
        } 수정전 */
        while(calX >= 1){ // 마지막 한명이 남는 경우를 생각한 조건
            calX -= arr[calX-1];
            if(calX >= 0) { // 마지막 한명이 공포도 1이 아니면 파티 조합을 못하도록
                answerCount++;
            }
        }
        System.out.println(answerCount);
    }

    // 위에는 나의 코드 풀이 방식이다. 그런데 시간복잡도가 풀이에 비해 현저히 높은 것으로 보인다. 11이니 무료 50%가령 성능차
    // 심각하다. 그 이유를 분석해보자
    // 우선 문제 풀이를 보겠다
    // 문제 풀이를 보면 우선 나와 달리 작은 수부터 시작했다.
    // 난 뒤에서 부터 시작해 항상 맨 앞의 값이 남을 경우 -> 심지어 남았을때 값을 비교 -> 따로 반복문 break;
    // if, if ,break -> if - 4 break - 2 -> 총 6뎁스를 더 낭비하는 상황
    // 그래서 수정함
    /*Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

        for (int i = 0; i < n; i++) {
        arrayList.add(sc.nextInt());
    }

        Collections.sort(arrayList);

    int result = 0; // 총 그룹의 수
    int count = 0; // 현재 그룹에 포함된 모험가의 수

        for (int i = 0; i < n; i++) { // 공포도를 낮은 것부터 하나씩 확인하며
        count += 1; // 현재 그룹에 해당 모험가를 포함시키기
        if (count >= arrayList.get(i)) { // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
            result += 1; // 총 그룹의 수 증가시키기
            count = 0; // 현재 그룹에 포함된 모험가의 수 초기화
        }
    }

        System.out.println(result);*/


}
