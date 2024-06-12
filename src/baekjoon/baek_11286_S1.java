package baekjoon;

import java.util.*;

public class baek_11286_S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> myQue = new PriorityQueue<Integer>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if(first == second){
                return o1 > o2 ? 1 : -1;
            }
            else{
                return first - second;
            }
        });
        for(int i =0; i < n; i++){
            int key = sc.nextInt();
            if(key == 0){
                if(myQue.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(myQue.poll());
                }
            }
            else{
                myQue.add(key);
            }
        }
    }
}
