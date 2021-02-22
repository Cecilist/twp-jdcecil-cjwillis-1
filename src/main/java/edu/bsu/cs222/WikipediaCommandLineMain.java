package edu.bsu.cs222;

import java.io.IOException;

public class WikipediaCommandLineMain {
    public static void main(String[] args) throws IOException {

        GetWikipediaTitle title = new GetWikipediaTitle();
        Revisions Format = new Revisions();
        String articleTitle = title.getArticleTitle();

        if (articleTitle.equals("")) {
            System.err.println("Article name required");
            System.exit(1);
        }


        String FormattedRevisions = Format.FormatRevisions(articleTitle,false);
        if (FormattedRevisions.equals("Invalid Wikipedia Title!")) {
            System.exit(2);
        }

        System.out.println(FormattedRevisions);
        System.exit(0);
    }
}
