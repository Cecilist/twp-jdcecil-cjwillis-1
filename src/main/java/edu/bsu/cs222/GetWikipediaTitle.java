package edu.bsu.cs222;

import java.util.Scanner;

public class GetWikipediaTitle {
    public String getTitle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Wikipedia page title ");
        String title = scan.nextLine();
        //Not sure if this actually exits with error code 1.
        if (title == null) {
            System.err.println("Article name required");
            System.exit(1);
        }
            return title;

    }
}
