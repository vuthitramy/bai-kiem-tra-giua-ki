package com.example.baithigiuaki.baitapvesach;

public class FictionBook extends  Book{
    private String genre;

    public FictionBook(String title, String author, String publisher, String genre) {
        super(title, author,publisher);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}

