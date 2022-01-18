import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Book {

    public void addBook() {
        String bookFile = "booklist.csv";
        String[] columnHeaders = {"Book Title", "Book Author(s)", "Year Published", "Publisher", "Pages", "Brief Description", "13 Digit ISBN", "10 Digit ISBN", "Copies", "Available"};
        try {
            FileWriter csvWriter = new FileWriter(bookFile, true);
            File file = new File(bookFile);

            if (file.length() == 0) {

                for (String columnHeader : columnHeaders) {
                    csvWriter.append(columnHeader + ", ");
                }
            }
            Scanner bookInput = new Scanner(System.in);

            System.out.println("Please enter a book title");
            String bookTitle = bookInput.nextLine();
            csvWriter.append("\n\"" + bookTitle + "\", ");

            String bookAuthor = "";
            csvWriter.append("\"");
            do {
                System.out.println("Please enter a book author");
                bookAuthor += bookInput.nextLine() + ",";
                System.out.println("Do you want to enter another author? Press 'y' for Yes or any other key for no.");
            } while (bookInput.nextLine().equals("y"));

           bookAuthor = bookAuthor.substring(0, bookAuthor.length() - 1);

            csvWriter.append(bookAuthor + "\", ");

            String[] moreColumnHeaders = {"Year", "Publisher", "Pages", "Brief Description", "13 Digit ISBN", "10 Digit ISBN"};

            String bookVariable = "";
            for (String header : moreColumnHeaders) {
                System.out.println("Please enter " + header);
                bookVariable = bookInput.nextLine();
                csvWriter.append("\"" + bookVariable + "\", ");
            }

            String[] quantityColumnHeaders = {"Copies", "Available Quantity"};
            int quantityVariable = 0;
            for (int i = 0; i < quantityColumnHeaders.length; i++) {
                System.out.println("Please enter " + quantityColumnHeaders[i]);
                quantityVariable = bookInput.nextInt();
                csvWriter.append(quantityVariable + ", ");
            }

           csvWriter.close();

        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }
    }
}
