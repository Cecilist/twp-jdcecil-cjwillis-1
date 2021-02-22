package edu.bsu.cs222;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import java.io.IOException;
import java.io.InputStream;

public class WikipediaParser {
    public JSONArray timeStampParser(InputStream wikiInputStream) throws IOException {
        return JsonPath.read(wikiInputStream, "$..timestamp");

    }
    public JSONArray editorParser(InputStream editorToString) throws IOException {
        return JsonPath.read(editorToString, "$..user");

    }
    public JSONArray redirectParser(InputStream redirectToString) throws IOException {
        return JsonPath.read(redirectToString, "$..redirects..to");

    }
}
