package edu.bsu.cs222;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class WikipediaConnection {

    public InputStream Connection(String title) throws IOException {
        URL Wikipedisurl = new URL ("https://en.wikipedia.org/w/api.php?action=query&format=json&prop=revisions&titles=" + title + "&rvprop=timestamp|user&rvlimit=30");
        URLConnection urlconnection = Wikipedisurl.openConnection();
        urlconnection.setRequestProperty("User-Agent",
                "WikipediaRevisionReader/0.1 (http://www.cs.bsu.edu/~pvg/courses/cs222Sp21; jdcecil@bsu.edu)");
        return urlconnection.getInputStream();
    }
}
