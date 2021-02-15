package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;


public class WikipediaRevisionParserTest {
    @Test
    public void testParse() throws IOException {
        WikipediaRevisionParser parser = new WikipediaRevisionParser();
        InputStream testStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("Pizza.json");
        String actual = parser.parse(testStream);
        String expected = "2021-02-11T01:44:40Z";
        //Revision actual = parser.parse(testStream);
        //Revision expected = new Revision("Valereee","2021-02-11T01:44:40Z");

        Assertions.assertEquals(expected, actual);

    }

}
