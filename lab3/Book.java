package lab3;

import java.util.ArrayList;

public class Book {

    String title;
    private ArrayList<Element> elements;
    private ArrayList<Author> authors;

    //constructor
    public Book(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    public void addContent (Element element) {
        this.elements.add(element);
    }

    public void addAuthor (Author author) {
        //add author to the book
        this.authors.add(author);
    }

    public void print() {
        System.out.println("Book: " + this.title);

        for (Author i : this.authors)
            i.print();

        for (Element i : this.elements)
            i.print();
    }
}