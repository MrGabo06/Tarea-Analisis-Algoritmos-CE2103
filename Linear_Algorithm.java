import java.time.LocalDateTime;
import java.util.Random;
public class Linear_Algorithm {
    public static void main (String[] args){
        Random random = new Random();
        int[] array = Randomize_Array(100000);
        int initial_time = LocalDateTime.now().getNano();
        linear_algorithm(array);
        int final_time = LocalDateTime.now().getNano();
        int execution_time = final_time-initial_time;
        System.out.println(execution_time);
    }

    public static void linear_algorithm(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i]*= 2;
        }
    }

    public static int[] Randomize_Array(int array_size){
        Random random = new Random();
        int[] array = new int[array_size];
        for(int i = 0; i < array_size; i++){
            array[i] = random.nextInt();
        }
        return array;
    }


}
