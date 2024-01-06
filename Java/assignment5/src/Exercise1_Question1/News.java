package Exercise1_Question1;

import java.util.Scanner;

public class News implements INews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    private int[] Rates = new int[3];

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        this.PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public News() {
        this.ID = 0;
        this.Title = "";
        this.PublishDate = "";
        this.Author = "";
        this.Content = "";
        this.AverageRate = 0.0f;
    }

    public News(int id, String title, String publishDate, String author, String content) {
        this.ID = id;
        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
        this.AverageRate = 0.0f;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average Rate: " + AverageRate);
    }

    @Override
    public float Calculate() {
        int sum = 0;
        for (int rate : Rates) {
            sum += rate;
        }
        AverageRate = (float) sum / Rates.length;
        return AverageRate;
    }

    public void inputRates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 rates: ");
        for (int i = 0; i < Rates.length; i++) {
            Rates[i] = scanner.nextInt();
        }
    }
}
