public class Main {
    public static void main(String[] args) {
        //Задача 3
        System.out.println("Задача 3");
        int[] arrNamber1 = generateRandomArray();
        float totalSum=0;
        for (int i = 0; i < arrNamber1.length; i++) {
            totalSum += arrNamber1[i];
        }
        totalSum = totalSum / arrNamber1.length;
        System.out.println("Средняя сумма трат за месяц составила "+totalSum+"рублей");





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