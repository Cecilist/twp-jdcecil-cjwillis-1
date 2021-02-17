package bsu.edu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;


public class WikipediaParserTest {
    @Test
    public void testParse_TRUE() throws IOException {

        Revision expected = new Revision("Valereee", "2021-02-11T01:44:40Z");

        InputStream testStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("Pizza.json");

        WikipediaParser wikipediaParser = new WikipediaParser();

        Revision actual = wikipediaParser.parse(testStream);


        Assertions.assertEquals(expected, actual);

    }

}
