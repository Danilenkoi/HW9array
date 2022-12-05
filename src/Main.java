import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = randomArrayGeniration();
        int sum = Arrays.stream(arr).sum();
        {
            System.out.printf("Сумма трат за месяц составила %s рублей.\n", sum);
            System.out.printf("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей.\n", Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt());
        }   System.out.printf("Средняя сумма трат за месяц составила %s рублей.\n", Arrays.stream(arr).average().getAsDouble());

    char[] reverseFullName = {'n', 'a', 'v', 'I',' ', 'v', 'o', 'n', 'a', 'v', 'I' };{
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        }
    }

    public static int[] randomArrayGeniration() {
        int[] arr = new int[30];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}