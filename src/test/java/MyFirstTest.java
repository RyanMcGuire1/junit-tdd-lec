import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void testIfNameIsEquals(){
        String expected = "Codeup";
        String actual = "codeup";
        assertNotEquals(expected, actual);
    }

    @Test
    public void sameArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }
}
