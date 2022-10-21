public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] arrNamber1 = generateRandomArray();
        int totalSum = 0;
        for (int i = 0; i < arrNamber1.length; i++) {
            totalSum += arrNamber1[i];
        }
        System.out.println("Сумма трат за месяц составила "+totalSum+" рублей");


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