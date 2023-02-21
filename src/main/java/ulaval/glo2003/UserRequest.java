package ulaval.glo2003;

public class UserRequest {
    public String name;

    public String job;

    public void validate() {
        if (name == null) {
            throw new IllegalArgumentException("Empty user name");
        }

        if (job == null) {
            throw new IllegalArgumentException("Empty user job");
        }
    }
}
