package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class WikipediaParserTest {

    @Test
    public void testParse() throws IOException {
        WikipediaParser testParser = new WikipediaParser();
        InputStream testStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("Pizza.json");
        ArrayList<Object> timestamp;
        timestamp = WikipediaParser.parseForRevisions(testStream);
        System.out.println(timestamp);

    }
}
