import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Задача 2
        System.out.println("Задача 2");
        int[] arrNamber1 = generateRandomArray();
        List<Integer> ints = Arrays.stream(arrNamber1)
                                .boxed()
                                .collect(Collectors.toList());
        System.out.println("Минимальная сумма трат за день составила "+Collections.min(ints)+" рублей. Максимальная сумма трат за день составила "+ Collections.max(ints)+" рублей");





    }




    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}