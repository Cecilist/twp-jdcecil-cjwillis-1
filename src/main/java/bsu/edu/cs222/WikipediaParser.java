package bsu.edu.cs222;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;


import java.io.IOException;
import java.io.InputStream;

public class WikipediaParser {
    public Revision parse(InputStream testDataStream) throws IOException {

        JSONArray revisions = JsonPath.read(testDataStream, "$..revisions");

        String editor = revisions.get(0).toString();
        //Change to instant later
        String timestamp = revisions.get(1).toString();

        return new Revision(editor, timestamp);


    }
}

