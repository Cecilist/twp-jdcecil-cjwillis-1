package edu.bsu.cs222;

import net.minidev.json.JSONArray;

import java.io.IOException;

public class Revisions {
    private final WikipediaConnection Connection = new WikipediaConnection();
    public String FormattedRevision1 = "";
    public String FormattedRevision2 = "";

    public String FormatRevisions(String articleTitle, boolean Gui) throws IOException {

        WikipediaParser parser = new WikipediaParser();
        JSONArray TimeStamp = parser.timeStampParser(Connection.Connection(articleTitle, Gui));
        JSONArray Username = parser.editorParser(Connection.Connection(articleTitle, Gui));
        JSONArray redirects = parser.redirectParser(Connection.Connection(articleTitle, Gui));
        JSONArray invalidArticle = parser.invalidArticleParser(Connection.Connection(articleTitle, Gui));

        for(int i=0; i<TimeStamp.size(); i++)
        {
            FormattedRevision2 = FormattedRevision1;
            FormattedRevision1 = FormattedRevision1  + TimeStamp.get(i) + " " + Username.get(i) + "\n";
        }

        int invalidArticleFlag = checkForInvalidTitle(invalidArticle);

        if (invalidArticleFlag == -1) {
            System.err.println("Invalid Wikipedia Title");
            return "Invalid Wikipedia Title!";
        }

        else if (redirects.toString().equals("[]")){
            return articleTitle + "\n" +
                    "Most Recent Revisions" +"\n" +
                    FormattedRevision1;

        } else {
            return articleTitle + " redirected to " + redirects + "\n" +
                    "Most Recent Revisions" + "\n" +
                    FormattedRevision1;
        }
    }

    private int checkForInvalidTitle(JSONArray invalidArticle){

        String invalidArticleString = invalidArticle.toString();
        String invalidArticleFlagString = "" +invalidArticleString.charAt(3)+invalidArticleString.charAt(4);
        return Integer.parseInt(invalidArticleFlagString);

    }


}
