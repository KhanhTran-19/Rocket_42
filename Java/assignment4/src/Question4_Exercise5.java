import java.util.ArrayList;
import java.util.Scanner;

public class Question4_Exercise5 {
    abstract class Document {
        private String documentCode;
        private String publisherName;
        private int releaseCopies;

        public Document(String documentCode, String publisherName, int releaseCopies) {
            this.documentCode = documentCode;
            this.publisherName = publisherName;
            this.releaseCopies = releaseCopies;
        }

        public String getDocumentCode() {
            return documentCode;
        }

        public String getPublisherName() {
            return publisherName;
        }

        public int getReleaseCopies() {
            return releaseCopies;
        }

        public void setDocumentCode(String documentCode) {
            this.documentCode = documentCode;
        }

        public void setPublisherName(String publisherName) {
            this.publisherName = publisherName;
        }

        public void setReleaseCopies(int releaseCopies) {
            this.releaseCopies = releaseCopies;
        }

        public abstract String displayInfo();
    }

    // Class to represent a Book document
    class Book extends Document {
        private String authorName;
        private int numberOfPages;

        public Book(String documentCode, String publisherName, int releaseCopies,
                    String authorName, int numberOfPages) {
            super(documentCode, publisherName, releaseCopies);
            this.authorName = authorName;
            this.numberOfPages = numberOfPages;
        }

        public String getAuthorName() {
            return authorName;
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

        @Override
        public String displayInfo() {
            return "Book: " + getDocumentCode() + ", Publisher: " + getPublisherName() +
                    ", Copies: " + getReleaseCopies() + ", Author: " + getAuthorName() +
                    ", Pages: " + getNumberOfPages();
        }
    }

    // Class to represent a Magazine document
    class Magazine extends Document {
        private int issueNumber;
        private int issueMonth;

        public Magazine(String documentCode, String publisherName, int releaseCopies,
                        int issueNumber, int issueMonth) {
            super(documentCode, publisherName, releaseCopies);
            this.issueNumber = issueNumber;
            this.issueMonth = issueMonth;
        }

        public int getIssueNumber() {
            return issueNumber;
        }

        public int getIssueMonth() {
            return issueMonth;
        }

        public void setIssueNumber(int issueNumber) {
            this.issueNumber = issueNumber;
        }

        public void setIssueMonth(int issueMonth) {
            this.issueMonth = issueMonth;
        }

        @Override
        public String displayInfo() {
            return "Magazine: " + getDocumentCode() + ", Publisher: " + getPublisherName() +
                    ", Copies: " + getReleaseCopies() + ", Issue Number: " + getIssueNumber() +
                    ", Issue Month: " + getIssueMonth();
        }
    }

    // Class to represent a Newspaper document
    class Newspaper extends Document {
        private String issueDate;

        public Newspaper(String documentCode, String publisherName, int releaseCopies, String issueDate) {
            super(documentCode, publisherName, releaseCopies);
            this.issueDate = issueDate;
        }

        public String getIssueDate() {
            return issueDate;
        }

        public void setIssueDate(String issueDate) {
            this.issueDate = issueDate;
        }

        @Override
        public String displayInfo() {
            return "Newspaper: " + getDocumentCode() + ", Publisher: " + getPublisherName() +
                    ", Copies: " + getReleaseCopies() + ", Issue Date: " + getIssueDate();
        }
    }

    // Class to manage the documents in the library
    class DocumentManager {
        private ArrayList<Document> documents;

        public DocumentManager() {
            this.documents = new ArrayList<>();
        }

        public void addDocument(Document document) {
            documents.add(document);
            System.out.println("Document added successfully.");
        }

        public void deleteDocument(String documentCode) {
            boolean isDeleted = false;
            for (int i = 0; i < documents.size(); i++) {
                if (documents.get(i).getDocumentCode().equals(documentCode)) {
                    documents.remove(i);
                    System.out.println("Document deleted successfully.");
                    isDeleted = true;
                    break;
                }
            }
            if (!isDeleted) {
                System.out.println("Document not found.");
            }
        }

        public void displayDocuments() {
            if (documents.isEmpty()) {
                System.out.println("No documents found.");
            } else {
                for (Document document : documents) {
                    System.out.println(document.displayInfo());
                }
            }
        }

        public void searchDocuments(String documentType) {
            boolean isFound = false;
            for (Document document : documents) {
                if (documentType.equalsIgnoreCase("book") && document instanceof Book) {
                    System.out.println(document.displayInfo());
                    isFound = true;
                } else if (documentType.equalsIgnoreCase("magazine") && document instanceof Magazine) {
                    System.out.println(document.displayInfo());
                    isFound = true;
                } else if (documentType.equalsIgnoreCase("newspaper") && document instanceof Newspaper) {
                    System.out.println(document.displayInfo());
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("No " + documentType + " documents found.");
            }
        }
    }
}
