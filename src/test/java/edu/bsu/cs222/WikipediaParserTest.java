package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class wikipediaParserTest {
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
        InputStream testDataStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("Pizza.json");
        String timestamp = parser.timeStampParser(testDataStream).get(0).toString();
        Assertions.assertEquals("2021-02-11T01:44:40Z", timestamp);
        System.out.println(timestamp);
    }
}
