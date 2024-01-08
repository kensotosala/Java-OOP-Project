package Library;

import java.util.ArrayList;

public class Database {

    ArrayList<User> users = new ArrayList<User>();
    ArrayList<String> userNames = new ArrayList<String>();

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
}
