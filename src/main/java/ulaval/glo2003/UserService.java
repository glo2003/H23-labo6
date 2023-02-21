package ulaval.glo2003;

public class UserService {
    private final UsersList usersList;

    public UserService(UsersList usersList) {
        this.usersList = usersList;
    }

    public User createUser(UserRequest request) {
        User user = new User(request);

        usersList.saveUser(user);

        return user;
    }
}
