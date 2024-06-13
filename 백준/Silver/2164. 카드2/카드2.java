import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        
        while (queue.size() > 1) {
            queue.poll(); // 첫 번째 카드를 제거
            queue.add(queue.poll()); // 두 번째 카드를 큐의 끝으로 이동
        }
        
        System.out.println(queue.peek()); // 마지막 남은 카드 출력
        scanner.close();
    }
}
