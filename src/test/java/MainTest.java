import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class MainTest {

    Main main;

    @Before
    public void init() {
        main = new Main();
    }

    @Test
    @DisplayName("Ensure text parsed are only letters and throws them as lowercase.")
    public void testParsedSuccessfully() {
        assertArrayEquals(
                new String[] {"bcdefa","bcd", "b", "y", ""},
                main.nextLetterString(new String[] {"abcdez","a b c", "a $ & 3 4", "X", "34`~% )($"})
        );
    }

    @Test
    @DisplayName("Validate empty input handling.")
    public void testEmptyArray() {
        assertTrue(main.nextLetterString(new String[] {}).length == 0);
    }

    @Test
    @DisplayName("Validate null input handling.")
    public void testNullOutput() {
        assertTrue(main.nextLetterString(null) != null);
    }
}
