import java.util.Scanner;

public class Exercise4 {
    public static int Question1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String str = scanner.nextLine();

        String[] words = str.split("\\s+");
        int count = words.length;

        return count;
    }

    public static String Question2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi thu nhat: ");
        String str1 = scanner.nextLine();
        System.out.println("Nhap chuoi thu hai: ");
        String str2 = scanner.nextLine();

        return str1.concat(str2);
    }

    public static String Question3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();

        String firstLetter = name.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();

        return firstLetter + name.substring(1);
    }

    public static void Question4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten nguoi dung: ");
        String name = scanner.nextLine();

        for (int i = 1; i <= name.length(); i++) {
            System.out.println("Ky tu thu " + i + " la: " + name.charAt(i-1));
        }
    }

    public static void Question5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho: ");
        String lastName = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String firstName = scanner.nextLine();

        System.out.println("Full name: " + lastName + " " + firstName);
    }

    public static void Question6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        String lastName = names[0];
        String middleName = names[names.length - 2];
        String firstName = names[names.length - 1];

        System.out.println("Ho la: " + lastName);
        System.out.println("Ten dem la: " + middleName);
        System.out.println("Ten la: " + firstName);
    }

    public static String Question7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullName = scanner.nextLine();
        //a
        fullName = fullName.trim().replaceAll("\\s+", " ");
        //b
        String[] words = fullName.split(" ");
        String normalizedName = "";

        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1);
            firstLetter = firstLetter.toUpperCase();
            String name = firstLetter + words[i].substring(1);

            normalizedName = normalizedName + name;
        }

        return normalizedName;
    }
}
