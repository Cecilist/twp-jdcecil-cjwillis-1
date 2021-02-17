package edu.bsu.cs222;

import java.util.ArrayList;

public class RevisionFormatter {
    public RevisionFormatter(ArrayList<Object> revisions) {
        for (Object revision : revisions) {
            String revisionstr = revision.toString();
            String[] arrOfStr = revisionstr.split("=", 5);
            String strforname = arrOfStr[1];
            String strfortime = arrOfStr[2];
            String[] arrusername = strforname.split(",", 5);
            String username = arrusername[0];
            String[] arrytime = strfortime.split(",", 5);
            String time = arrytime[0];
            System.out.println(time+ " "+ username );
        }
    }
}