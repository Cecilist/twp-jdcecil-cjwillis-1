package bsu.edu.cs222;


import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class WikipediaRevisionReader {
    public static void main(String[] args) {
        WikipediaRevisionReader revisionsReader = new WikipediaRevisionReader();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            Revision revision = revisionsReader.getLatestRevision(line);
            System.out.println(revision.getEditor());
            System.out.println(revision.getTimestamp());

        } catch (IOException ioException) {
            System.err.println("Network connection error: " + ioException.getMessage());
        }

    }
    private Revision getLatestRevision(String articleTitle) throws IOException {
        String urlString = String.format("https://en.wikipedia.org/w/api.php?action=query&format=json&prop=revisions&titles=%s&rvprop=timestamp&rvlimit=30",
                articleTitle);
        String encodedUrlString = URLEncoder.encode(urlString, Charset.defaultCharset());
        try {
            URL url = new URL(encodedUrlString);
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent",
                    "WikipediaRevisionReader/0.1 (http://www.cs.bsu.edu/~pvg/courses/cs222Sp21; jdcecil@bsu.edu)");
            InputStream inputStream = connection.getInputStream();
            WikipediaParser wikipediaParser = new WikipediaParser();
            return wikipediaParser.parse(inputStream);

        } catch (MalformedURLException malformedURLException) {
            throw new RuntimeException(malformedURLException);
        }

    }
}

