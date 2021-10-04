import java.util.ArrayList;
import java.util.List;

public class Book {

    String title;
    List<String> paragraph = new ArrayList<>();
    List<String> table = new ArrayList<>();
    List<String> image = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String string) {
        paragraph.add(string);
    }

    public void createNewTable(String string) {
        table.add(string);
    }

    public void createNewImage(String string) {
        image.add(string);
    }

    public String getTitle() {
        return title;
    }

    public List<String> getParagraph() {
        return paragraph;
    }

    public List<String> getTable() {
        return table;
    }

    public List<String> getImage() {
        return image;
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Paragraph: " + paragraph);
        System.out.println("Table: " + table);
        System.out.println("Image: " + image);
    }
}