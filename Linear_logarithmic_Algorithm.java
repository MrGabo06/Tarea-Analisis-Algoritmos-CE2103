import java.time.LocalDateTime;

public class Linear_logarithmic_Algorithm {
    public static void main (String[] args){
        int initial_time = LocalDateTime.now().getNano();
        /* Algoritmo*/
        int final_time = LocalDateTime.now().getNano();
        int execution_time = final_time-initial_time;
        System.out.println(execution_time);
    }
}