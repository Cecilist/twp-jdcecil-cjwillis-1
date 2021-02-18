package edu.bsu.cs222;

import net.minidev.json.JSONArray;

import java.io.IOException;

    public class Revisions {
        private final WikipediaConnection Connection = new WikipediaConnection();
        public String FormattedRevision = "";
        public String FormatRevisions(String articleTitle) throws IOException {
            WikipediaParser parser = new WikipediaParser();
            JSONArray TimeStamp = parser.timeStampParser(Connection.Connection(articleTitle));
            JSONArray Username = parser.editorParser(Connection.Connection(articleTitle));
            for(int i=0; i<TimeStamp.size(); i++)
            {
                FormattedRevision = FormattedRevision + TimeStamp.get(i) + " " + Username.get(i) + "\n";
            }
            return FormattedRevision;
        }
    }
