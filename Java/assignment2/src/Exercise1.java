import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Exercise1 {
    public static void Question1() {
        float account1 = 5240.5F;
        float account2 = 10970.055F;

        int account1_salary = (int) account1;
        int account2_salary = (int) account2;

        System.out.println("Luong cua account1: " + account1_salary);
        System.out.println("Luong cua account2: " + account2_salary);
    }

    public static String Question2() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100000);
        return String.format("%05d",randomNum);
    }

    public static void Question3(String question2) {
        String last2digits = question2.substring(3);
        System.out.println("2 so cuoi cua so tu cau 2 la: " + last2digits);
    }

    public static float division() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        int b = scanner.nextInt();

        return (float)a/b;
    }
}
