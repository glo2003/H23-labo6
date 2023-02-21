package ulaval.glo2003;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("users")
public class UsersResource {

    private final UserService userService;

    public UsersResource(UserService userService) {
        this.userService = userService;
    }

    @POST
    // Reçoit la requête
    public Response createUser(UserRequest request) {
        request.validate();

        // TODO transform to domain params

        User user = userService.createUser(request);

        // Transforme le user en réponse
        UserResponse response = new UserResponse(user.getId(), user.getName());

        // Retourne la réponse
        return Response.ok(response).build();
    }
}
