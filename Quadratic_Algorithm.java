import java.time.LocalDateTime;
import java.util.Random;
public class Quadratic_Algorithm {
    public static void main (String[] args){
        int[] array = Randomize_Array(100);
        int initial_time = LocalDateTime.now().getNano();
        /* Algoritmo*/
        Bubble_Sort(array);
        int final_time = LocalDateTime.now().getNano();
        int execution_time = final_time-initial_time;
        System.out.println(execution_time);
    }

    public static int[] Randomize_Array(int array_size){
        Random random = new Random();
        int[] array = new int[array_size];
        for(int i = 0; i < array_size; i++){
            array[i] = random.nextInt();
        }
        return array;
    }

    public static void Bubble_Sort(int[] array) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[j] > array[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
