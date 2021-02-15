package bsu.edu.cs222;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;


import java.io.IOException;
import java.io.InputStream;

public class TimestampParser {
    public String parse(InputStream testDataStream) throws IOException {

        JSONArray timestamp = JsonPath.read(testDataStream, "$..timestamp");

        return timestamp.get(0).toString();


    }
}

