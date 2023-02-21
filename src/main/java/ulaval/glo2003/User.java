package ulaval.glo2003;

import java.util.UUID;

public class User {
    private final String id;
    private final String name;
    private final String job;

    public User(UserRequest request) {
        if (request.name.isBlank()) {
            throw new IllegalArgumentException("User name should not be empty");
        }

        this.id = UUID.randomUUID().toString();
        this.name = request.name;
        this.job = request.job;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
