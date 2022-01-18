import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        boolean isIncorrectAnswer;
        Scanner sc = new Scanner(System.in);

        do {
            isIncorrectAnswer = false;
            System.out.println("Are you 1. an Admin, 2. Librarian, or 3. Patron, 0. Quit?");
            switch(sc.nextInt()) {
                case 1:
                    break;
                case 2:
                    Staff librarian = new Librarian();
                    librarian.menu();
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You have chose an invalid option.");
                    isIncorrectAnswer = true;

            }
        } while (isIncorrectAnswer);




    }
}
