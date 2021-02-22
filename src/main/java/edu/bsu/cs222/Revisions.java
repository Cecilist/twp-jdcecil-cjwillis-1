package edu.bsu.cs222;

import net.minidev.json.JSONArray;

import java.io.IOException;

    public class Revisions {
        private final WikipediaConnection Connection = new WikipediaConnection();
        public String FormattedRevision1 = "";
        public String FormattedRevision2 = "";
        public String FormatRevisions(String articleTitle) throws IOException {
            WikipediaParser parser = new WikipediaParser();
            JSONArray TimeStamp = parser.timeStampParser(Connection.Connection(articleTitle));
            JSONArray Username = parser.editorParser(Connection.Connection(articleTitle));
            JSONArray redirects = parser.redirectParser(Connection.Connection(articleTitle));
            for(int i=0; i<TimeStamp.size(); i++)
            {
                FormattedRevision2 = FormattedRevision1;
                FormattedRevision1 = FormattedRevision1  + TimeStamp.get(i) + " " + Username.get(i) + "\n";
            }


            if (redirects.toString().equals("[]")){
                return articleTitle + "\n" +
                        "Most Recent Revisions" +"\n" +
                        FormattedRevision1;
            } else {
                return articleTitle + " redirected to " + redirects + "\n" +
                        "Most Recent Revisions" + "\n" +
                        FormattedRevision1;
            }


        }
    }
