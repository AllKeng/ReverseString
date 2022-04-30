import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ReverseStringTest {
    @Test 
    public void reverse() {
        assertEquals("How are you doing",
            ReverseString.reverse("gniod uoy era woH"));
    }
}
