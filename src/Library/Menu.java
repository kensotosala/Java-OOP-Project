package Library;

import java.util.Scanner;

public class Menu {

    public Scanner sc;
    
    public Database database;
    

    public Menu() {
        sc = new Scanner(System.in);
        database = new Database();
    }

    public void displayMenu() {
        System.out.println("Welome to Library Management System!\n" + "1. Log\n2. New User");
        sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1:
                login();
            case 2:
                newUser();
            default:
                System.out.println("Error!");
        }
    }
    
    // Este es un comentario de prueba
    
    private void login() {
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.next();
        System.out.println("Enter email: ");
        String email = sc.next();
        if(database.login(phoneNumber, email) != -1) {
            // https://youtu.be/A5zLwnUJtVc?list=PL-cxzMmn1xXG87ak7josmprqsp3da_Ovk&t=450
        }
    }

    private void newUser() {
        System.out.println("Enter a name: ");
        String name = sc.next();

        System.out.println("Enter a phone number: ");
        String phoneNumber = sc.next();

        System.out.println("Enter a email: ");
        String email = sc.next();

        System.out.println("Usert type: ");
        System.out.println("1. Admin\n2. Normal User: ");
        int option = sc.nextInt();

        if (option == 1) {
            User admin = new Admin(name, email, phoneNumber);
        } else {
            User user = new User(name, email, phoneNumber);
        }

    }

}
