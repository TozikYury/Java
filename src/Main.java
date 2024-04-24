import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        final int sizeArray = scanner.nextInt();
        final int[] array = outputArray(sizeArray);
        maxElementArray(array);
        System.out.println("List employers");
        final Person[] employers = {
                new Employers("Kate", 22, "Kola"),
                new Employers("Alis", 76, "Pepsi"),
                new Employers("Bil", 45, "Google"),
        };
        for (Person people : employers) {
            System.out.println(people);
        }
        System.out.println("Sort list");
        sortEmployers(employers);
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

    private static void sortEmployers(Person[] person) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("chooses sort employer");
        System.out.println("Press 1 to sort by age");
        System.out.println("Press 2 to sort by name");
        int chooses = scanner.nextInt();

        switch (chooses) {
            case 1 -> sortEmployersAge(person);
            case 2 -> sortEmployersName(person);
        }
    }

    private static void sortEmployersAge(Person[] employers) {
        Arrays.sort(employers, Comparator.comparingInt(Person::getAge));
        System.out.println(Arrays.toString(employers));
    }

    private static void sortEmployersName(Person[] employers) {
        Arrays.sort(employers, Comparator.comparing(Person::getName));
        System.out.println(Arrays.toString(employers));
    }
}