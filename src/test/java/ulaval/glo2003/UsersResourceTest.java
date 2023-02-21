package ulaval.glo2003;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class UsersResourceTest {

    private UsersResource usersResource;

    private UsersList usersList;

    @BeforeEach
    public void setUp() {
        usersList = mock(UsersList.class);
        usersResource = new UsersResource(usersList);
    }

    @Test
    public void givenInvalidRequest_shouldThrow() {
        UserRequest request = mock(UserRequest.class);
        doThrow(IllegalArgumentException.class).when(request).validate();

        assertThrows(
                IllegalArgumentException.class,
                () -> usersResource.createUser(request)
        );
        verify(usersList, times(0)).saveUser(any());
    }
}
