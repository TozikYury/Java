import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        final int sizeArray = scanner.nextInt();
        final int[] array = outputArray(sizeArray);
        maxElementArray(array);
        System.out.println("List employers");
        final Person[] employers = {
                new Employers("Kate", 22, ""),
                new Employers("Bob", 34, "Y"),
                new Employers("Bil", 45, "L"),
        };
    }

    private static int[] outputArray(int sizeArray) {
        final int[] array = new int[sizeArray];
        final Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
            System.out.print("\t" + array[i]);
        }
        System.out.println();
        return array;
    }

    private static void maxElementArray(int[] array) {
        int minElement = array[0];
        for (int j : array)
            if (minElement < j)
                minElement = j;

        System.out.println("Max element array:=" + minElement);
    }
}