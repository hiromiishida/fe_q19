import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run(){
        Queue<String> queue = new ArrayDeque<>();

        queue.add("1");
        queue.add("5");
        queue.poll();
        queue.add("7");
        queue.add("6");
        queue.add("4");
        queue.poll();
        queue.poll();
        queue.add("3");

        System.out.println(queue);
    }
}