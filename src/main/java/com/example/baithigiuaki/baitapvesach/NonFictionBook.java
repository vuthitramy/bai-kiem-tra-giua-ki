package com.example.baithigiuaki.baitapvesach;

public class NonFictionBook extends Book{
    private String subject;

    public NonFictionBook(String title, String author, String publisher, String subject) {
        super(title, author, publisher);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
