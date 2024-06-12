package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baek_2164_S4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        //문제풀이
        while (queue.size() > 1){
            queue.remove();
            int newAdd = queue.poll();
            queue.add(newAdd);
        }

        System.out.println(queue.peek());

    }
}
