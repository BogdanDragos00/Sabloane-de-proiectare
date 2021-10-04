import java.util.ArrayList;

public class Book {

    String title;
    private ArrayList<Chapter> chapters;
    private ArrayList<Author> authors;

    //constructor
    public Book(String title) {
        this.title = title;
        this.chapters = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    public void addChapter(Chapter chapter) {
        this.chapters.add(chapter);
    }
    public void addAuthor(Author author) {
        //add author to the book
        this.authors.add(author);
    }

    public void print() {
        System.out.println("Book: " + this.title);

        for (Author author : this.authors) {
            author.print();
        }
        for (Chapter chapter : this.chapters) {
            chapter.print();
        }
    }

}
