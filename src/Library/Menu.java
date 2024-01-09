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
        System.out.println("Welome to Library Management System!");
        int num;
        do {
            System.out.println("0.Exit\n1. Log\n2. New User");
            sc = new Scanner(System.in);
            num = sc.nextInt();

            switch (num) {
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
            }
        } while (num != 0);
    }

    // Este es un comentario de prueba
    private void login() {
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.next();
        System.out.println("Enter email: ");
        String email = sc.next();
        int n = database.login(phoneNumber, email);
        if (n != -1) {
            User user = database.getUser(n);
            user.menu();
        } else {
            System.out.println("User doesn't exist!");
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
        User user;
        if (option == 1) {
            user = new Admin(name, email, phoneNumber);
        } else {
            user = new NormalUser(name, email, phoneNumber);
        }
        database.AddUser(user);
        user.menu();

    }

}
