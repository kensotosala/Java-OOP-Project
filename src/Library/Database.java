package Library;

import java.util.ArrayList;

public class Database {

    private ArrayList<User> users;
    private ArrayList<String> userNames;
    private ArrayList<Book> books;
    private ArrayList<String> bookNames;

    public Database() {
        this.users = new ArrayList<>();
        this.userNames = new ArrayList<>();
        this.books = new ArrayList<>();
        this.bookNames = new ArrayList<>();
    }

    public void AddUser(User user) {
        users.add(user);
        userNames.add(user.getName());
    }

    public int login(String phoneNumber, String email) {
        int n = -1;
        for (User user : users) {
            if (user.getPhoneNumber().matches(phoneNumber) && user.getEmail().matches(email)) {
                n = users.indexOf(user);
                break;
            }
        }
        return n;
    }

    public User getUser(int n) {
        return users.get(n);
    }

    public void AddBook(Book book) {
        books.add(book);
        bookNames.add(book.getName());
    }
}
