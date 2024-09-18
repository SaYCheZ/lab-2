import java.util.Random;

public class SelectionSortTime {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        selectionSort(numbers);

        stopWatch.stop();

        System.out.println("Время выполнения сортировки: " + stopWatch.getElapsedTime() + " миллисекунд");
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}