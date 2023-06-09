import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        stringOrNum(value);
        checkArray(new int[]{1, 6, 8, 7, 12});
    }

    public static void stringOrNum(String value) {
        if (value.matches("[-+]?\\d+")) {
            if (Integer.parseInt(value) > 7) {
                System.out.println("Привет");
            }
        } else if (value.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void checkArray(int[] nums) {
        for (int num : nums) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}