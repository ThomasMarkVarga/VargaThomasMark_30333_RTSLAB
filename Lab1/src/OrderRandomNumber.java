
import java.util.Random;

public class OrderRandomNumber {
    public static void main(String[] args) {
        // declare array
        int[] randomNumbers = new int[10];

        // generatinig the random numbers from 0 to 100 and displaying them
        Random random = new Random();
        System.out.println("Generated array:");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
            System.out.print(randomNumbers[i] + " ");
        }

        // sorting the numbers
        for(int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++){
                if(randomNumbers[i] < randomNumbers[j]){
                    int aux = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[j];
                    randomNumbers[j] = aux;
                }
            }

        // displaying the sorted array
        System.out.println();
        System.out.println("Sorted array:");
        for(int i = 0; i < 10; i++){
            System.out.print(randomNumbers[i] + " ");
        }

    }
}
