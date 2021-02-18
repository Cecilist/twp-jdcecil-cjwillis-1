package edu.bsu.cs222;

import java.io.IOException;
import java.util.ArrayList;

public class WikipediaCommandLineMain {

    public static void main(String[] args) throws IOException {
        GetWikipediaTitle input = new GetWikipediaTitle();
        String title = input.getTitle();
        WikipediaConnection connection = new WikipediaConnection();
        ArrayList<Object> revisions = (WikipediaParser.parseForRevisions(connection.Connection(title)));
        new RevisionFormatter(revisions);
        System.exit(0);
    }
}