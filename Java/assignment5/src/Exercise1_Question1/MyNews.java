package Exercise1_Question1;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        News news = new News();

        int choice;
        do {
            System.out.println("\n*** News Management System ***");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            switch (choice) {
                case 1:
                    System.out.print("Input ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Input Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Input Publish Date: ");
                    String publishDate = scanner.nextLine();
                    System.out.print("Input Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Input Content: ");
                    String content = scanner.nextLine();

                    news.inputRates();

                    news.setID(id);
                    news.setTitle(title);
                    news.setPublishDate(publishDate);
                    news.setAuthor(author);
                    news.setContent(content);

                    break;
                case 2:
                    news.Display();
                    break;
                case 3:
                    news.Calculate();
                    news.Display();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Please choose another option.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
