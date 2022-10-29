import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Задача 2
        System.out.println("Задача 2");
        int[] arrNumber1 = generateRandomArray();
        int total = 0;
        int totalMax = 0;
        int totalMin = 0;
        for (int i = 0; i < arrNumber1.length; i++) {
            if (totalMax < arrNumber1[i]) {
                totalMax = arrNumber1[i];
            }
        }
        totalMin=totalMax;
        for (int i = 0; i < arrNumber1.length; i++) {
            if (totalMin > arrNumber1[i]) {
                totalMin = arrNumber1[i];
            }
        }

            System.out.println("Минимальная сумма трат за день составила " + totalMin + " рублей. Максимальная сумма трат за день составила " + totalMax + " рублей");

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