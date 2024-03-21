import java.time.LocalDateTime;

public class Exponential_Algorithm {
    public static void main (String[] args){
        int initial_time = LocalDateTime.now().getNano();
        System.out.println(recursiveFibonacci(100));
        int final_time = LocalDateTime.now().getNano();
        int execution_time = final_time-initial_time;
        System.out.println(execution_time);
    }

    public static int recursiveFibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}


