package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek_11724_S5 {
    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int e = Integer.parseInt(stringTokenizer.nextToken());
        visited = new boolean[n+1];
        arr = new ArrayList[n+1];

        //인접 배열 리스트 만들기
        for(int i =1; i < n+1; i++){
            arr[i] = new ArrayList<Integer>();
        }

        // 인접 배열 리스트 초기화
        for(int i =0; i < e; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            arr[start].add(end);
            arr[end].add(start);
        }

        int answer = 0;
        for (int i =1; i < n+1; i++){
            if(!visited[i]){
                answer++;
                DFS(i);
            }
        }
        System.out.println(answer);
    }

    public static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i = 0; i < arr[v].size(); i++){
            if(!visited[arr[v].get(i)]){
                DFS(arr[v].get(i));
            }
        }
    }
}
