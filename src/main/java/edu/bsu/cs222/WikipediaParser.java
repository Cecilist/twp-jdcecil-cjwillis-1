package edu.bsu.cs222;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class WikipediaParser {

    public static ArrayList<Object> parseForRevisions(InputStream inputStream) throws IOException {
        return JsonPath.read(inputStream, "$..revisions[*]");


    }
}
