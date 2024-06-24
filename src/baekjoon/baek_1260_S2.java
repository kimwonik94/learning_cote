package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baek_1260_S2 {
    public static String dfsAnswer = "";
    public static String bfsAnswer = "";
    public static ArrayList<Integer>[] arr;
    public static boolean[] dfsVisit;
    public static boolean[] bfsVisit;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int v = Integer.parseInt(stringTokenizer.nextToken());

        arr = new ArrayList[n+1];
        dfsVisit = new boolean[n+1];
        bfsVisit = new boolean[n+1];

        // 인접 배열 초기화 값 넣는건 아님
        for(int i =0; i < arr.length; i++){
            arr[i] = new ArrayList<Integer>();
        }
        // 인접 배열 값 넣기
        for(int i = 0; i < m; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
        // 정렬 하기
        for(int i = 1; i < arr.length; i++){
            arr[i].sort(Comparator.naturalOrder());
        }
        Dfs(v);
        Bfs(v);
        System.out.println(dfsAnswer);
        System.out.println(bfsAnswer);
    }

    public static void Dfs(int v){
        dfsVisit[v] = true;
        dfsAnswer += (v + " ");

        // 인접 배열 내의 요소의 길이 만큼 반복
        for(int i = 0; i < arr[v].size(); i++){
            if(dfsVisit[arr[v].get(i)]){continue;}
            Dfs(arr[v].get(i));
        }
    }

    public static void Bfs(int v){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        bfsVisit[v] = true;
        bfsAnswer += (v + " ");

        while(queue.size() != 0){
            int num = queue.poll();
            if(!bfsVisit[num]){
                bfsVisit[num] = true;
            }
            for (int i =0; i < arr[num].size(); i++){
                if(bfsVisit[arr[num].get(i)]){ continue;}
                queue.add(arr[num].get(i));
                bfsVisit[arr[num].get(i)] = true;
                bfsAnswer += (arr[num].get(i) + " ");
            }
        }
    }
}
