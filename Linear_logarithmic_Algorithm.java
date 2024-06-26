import java.time.LocalDateTime;
import java.util.Random;

public class Linear_logarithmic_Algorithm {

    public static void ordenacionRapida(int vec[]){
        final int N=vec.length;
        quickSort(vec, 0, N-1);
    }

    public static void quickSort(int vec[], int inicio, int fin){
        if(inicio>=fin) return;
        int pivote=vec[inicio];
        int elemIzq=inicio+1;
        int elemDer=fin;
        while(elemIzq<=elemDer){
            while(elemIzq<=fin && vec[elemIzq]<pivote){
                elemIzq++;
            }
            while(elemDer>inicio && vec[elemDer]>=pivote){
                elemDer--;
            }
            if(elemIzq<elemDer){
                int temp=vec[elemIzq];
                vec[elemIzq]=vec[elemDer];
                vec[elemDer]=temp;
            }
        }

        if(elemDer>inicio){
            int temp=vec[inicio];
            vec[inicio]=vec[elemDer];
            vec[elemDer]=temp;
        }
        quickSort(vec, inicio, elemDer-1);
        quickSort(vec, elemDer+1, fin);
    }

    public static int[] Randomize_Array(int array_size){
        Random random = new Random();
        int[] array = new int[array_size];
        for(int i = 0; i < array_size; i++){
            array[i] = random.nextInt();
        }
        return array;
    }

    public static void main (String[] args){
        Random random = new Random();
        int[] array = Randomize_Array(100000);
        int initial_time = LocalDateTime.now().getNano();
        ordenacionRapida(array);
        int final_time = LocalDateTime.now().getNano();
        int execution_time = final_time-initial_time;
        System.out.println("EL tiempo de ejecucion es: ");
        System.out.println(execution_time);

    }
}
