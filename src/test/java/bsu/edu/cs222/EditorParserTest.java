package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class EditorParserTest {
    @Test
    public void testParse() throws IOException {
        InputStream testStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("Pizza.json");
        String expected = "Valereee";

        EditorParser parser = new EditorParser();

        String editor = parser.parse(testStream);



        Assertions.assertEquals(expected, editor);
    }
}
