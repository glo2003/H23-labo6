package ulaval.glo2003;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

public class UsersController {
    private final List<User> users = new ArrayList<>();

    @POST
    public Response createUser(UserRequest request) {
        if (request.name == null) {
            throw new IllegalArgumentException("Empty user name");
        }

        if (request.name.isBlank()) {
            throw new IllegalArgumentException("User name should not be empty");
        }

        User user = new User(request.name);

        users.add(user);

        UserResponse response = new UserResponse(user.getId(), user.getName());

        return Response.ok(response).build();
    }
}
