import org.testng.annotations.Test;
import tester.com.service.User;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    //Bai 5
    @Test
    void testValidName() {
        User user = new User("Chung");
        assertEquals("Chung", user.getName());
    }

    @Test
    void testNullName() {
        User user = new User(null);
        assertThrows(NullPointerException.class, user::getName);
    }

    @Test
    void testNullUser() {
        User user = null;
        assertThrows(NullPointerException.class, () -> {
           user.getName();
        });
    }
}
