import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random(100);

        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Случайное число " + (i + 1) + ": " + randomNumber);
        }
    }
}