package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class WikipediaParserTest {
    @Test
    public void editorParseTest() throws IOException {
        WikipediaParser parser = new WikipediaParser();
        InputStream testDataStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("Pizza.json");
        String username = parser.editorParser(testDataStream).get(0).toString();
        Assertions.assertEquals("Valereee", username);
        System.out.println(username);
    }
    @Test
    public void TimestampParserTest() throws IOException {
        WikipediaParser parser = new WikipediaParser();
        InputStream testTimestampStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("Pizza.json");
        String timestamp = parser.timeStampParser(testTimestampStream).get(0).toString();
        Assertions.assertEquals("2021-02-11T01:44:40Z", timestamp);
        System.out.println(timestamp);
    }
    @Test
    public void redirectParserTest() throws IOException {
        WikipediaParser parser = new WikipediaParser();
        InputStream testredirectStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("biden.json");
        String redirect = parser.redirectParser(testredirectStream).get(0).toString();
        Assertions.assertEquals("Joe Biden", redirect);
        System.out.println(redirect);
    }
}