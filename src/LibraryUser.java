import java.util.Scanner;

public abstract class LibraryUser {

    protected String firstName;
    private String lastName;
    private String emailAddress;
    private String username;

    protected LibraryUser() {

    }

    protected LibraryUser(String firstName, String lastName, String emailAddress, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.username = username;
    }

    abstract void menu();

    protected String setFirstName() {
        Scanner personInput = new Scanner(System.in);
        System.out.println("Please enter first name");
        firstName = personInput.nextLine();
        return firstName;
    }

    protected String setLastName() {
        Scanner personInput = new Scanner(System.in);
        System.out.println("Please enter last name");
        lastName = personInput.nextLine();
        return lastName;
    }

    protected String setEmailAddress() {
        Scanner personInput = new Scanner(System.in);
        System.out.println("Please enter email address");
        emailAddress = personInput.nextLine();
        return emailAddress;
    }

    protected String setUserName() {
        Scanner personInput = new Scanner(System.in);
        System.out.println("Please enter a username");
        username = personInput.nextLine();
        return username;
    }

}