package edu.bsu.cs222;

import java.util.ArrayList;

public class RevisionFormatter {
    public RevisionFormatter(ArrayList<Object> revisions) {
        for (Object Revision : revisions) {
            String revision = Revision.toString();
            String[] arrOfStr = revision.split("=", 5);
            String name = arrOfStr[1];
            String timestamp = arrOfStr[2];
            String[] usernameArray = name.split(",", 5);
            String username = usernameArray[0];
            String[] timestampArray = timestamp.split(",", 5);
            String time = timestampArray[0];
            System.out.println(time+ " "+ username );
        }
    }
}
