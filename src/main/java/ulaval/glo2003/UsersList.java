package ulaval.glo2003;

import java.util.ArrayList;
import java.util.List;

public class UsersList {

    private final List<User> users = new ArrayList<>();

    public void saveUser(User user) {
        users.add(user);
    }
}
