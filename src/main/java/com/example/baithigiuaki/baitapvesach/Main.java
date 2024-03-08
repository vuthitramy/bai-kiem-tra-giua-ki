package com.example.baithigiuaki.baitapvesach;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("abc", "xyz", "mlb");
        System.out.println(book.getInfo());

        FictionBook fictionBook = new FictionBook("ab", "my", "ml", "ml");
        System.out.println(fictionBook.getInfo());

        NonFictionBook nonFictionBook = new NonFictionBook("ab", "tra my", "...", "ml");
        System.out.println(nonFictionBook.getInfo());

        ScienceBook scienceBook = new ScienceBook("cd", "my", "nm", "ll");
        System.out.println(scienceBook.getInfo());
    }
}