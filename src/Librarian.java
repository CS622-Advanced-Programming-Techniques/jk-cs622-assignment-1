import java.util.Scanner;

public class Librarian extends Staff implements Account {

    public void login(String username, String password) {

    }

    public void createAccount() {

    }

    @Override
    public void menu() {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            choice = -1;
            System.out.println("Do you want to 0. quit 1. Add a new book?");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        Book book = new Book();
                        book.addBook();
                        break;
                    default:
                        System.out.println("You have chose an invalid option.");
                }
            }
        } while (choice != 0);

    }

}


