package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;


public class TimestampParserTest {
    @Test
    public void testParse() throws IOException {
        String expected = "2021-02-11T01:44:40Z";

        InputStream testStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("Pizza.json");

        TimestampParser parser = new TimestampParser();

        String actual = parser.parse(testStream);


        Assertions.assertEquals(expected, actual);

    }

}
