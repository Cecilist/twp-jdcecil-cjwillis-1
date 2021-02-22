package edu.bsu.cs222;

import java.util.Scanner;

public class GetWikipediaTitle {
    public String getArticleTitle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Wikipedia page title ");

        return scan.nextLine();
    }
}
