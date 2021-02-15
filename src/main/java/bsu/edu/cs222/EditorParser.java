package bsu.edu.cs222;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;

public class EditorParser {
    public String parse(InputStream testDataStream) throws IOException {

        JSONArray editor = JsonPath.read(testDataStream, "$..user");

        //return new Revision(editor.get(0).toString(), timestamp.get(0).toString());
        return editor.get(0).toString();


    }
}
