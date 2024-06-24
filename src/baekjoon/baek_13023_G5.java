package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class baek_13023_G5 {
    static int depth = 1;
    static ArrayList<Integer>[] arrayLists;
    static boolean[] visited;
    static String answer = "0";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        arrayLists = new ArrayList[n];
        visited = new boolean[n];


        for(int i =0; i < n; i++){
            arrayLists[i] = new ArrayList<Integer>();
        }

        for(int i =0; i < e; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arrayLists[start].add(end);
            arrayLists[end].add(start);
        }


        for(int i = 0; i < n; i++){
            dfs(i, depth);
            if(answer.equals("1")){
                break;
            }
        }
        System.out.println(answer);
   }

   public static void dfs(int num, int depth){
           // depth가 5인 상태에서 이번 대상 노드가 방문 하지 않은것이면
           if(depth == 5){
               answer = "1";
               return;
           }
        visited[num] = true;
        for(int i = 0; i < arrayLists[num].size(); i++){
            // 이미 방문 한 노드면 넘어가기
            if(!visited[arrayLists[num].get(i)]){
                dfs(arrayLists[num].get(i), depth + 1);
            }
        }
        // 부모 노드로 돌아갈때 깊이 들어가며 바꾼 true들을 false로 다시 만듬
       // 난 이걸 빼먹어서 틀림...
       visited[num] = false;
   }


}
