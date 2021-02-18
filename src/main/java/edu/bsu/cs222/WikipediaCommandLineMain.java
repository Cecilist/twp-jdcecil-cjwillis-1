package edu.bsu.cs222;

import java.io.IOException;

public class WikipediaCommandLineMain {
    public static void main(String[] args) throws IOException {
        GetWikipediaTitle title = new GetWikipediaTitle();
        Revisions Format = new Revisions();
        String articleTitle = title.getArticleTitle();
        String FormattedRevisions = Format.FormatRevisions(articleTitle);
        System.out.println(FormattedRevisions);
        System.exit(0);
    }
}
