package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static ArrayList<String> books = new ArrayList<>();


    public static void main(String[] args) {
        int numberofbooks = Integer.parseInt(getInput("How many books would you like to add?"));
        for (int i = 0; i < numberofbooks; i++) {
            books.add(bookdetails());

        }
        printbookinfo();
    }


    public static String bookdetails() {
        int ISBN = Integer.parseInt(getInput("please enter the ISBN of the book"));
        String Booktitle = getInput("Enter the name of the book");
        String author = getInput("Enter the authors name");
        String genre = getInput("Enter the genre of the book");
        return (ISBN + "," + Booktitle + "," + author + "," + genre);

    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void printbookinfo() {
        for (int i = 0; i < books.size(); i++) {
            String[] bookdetails = books.get(i).split(",");
            System.out.println(books.get(i));


        }
    }
}