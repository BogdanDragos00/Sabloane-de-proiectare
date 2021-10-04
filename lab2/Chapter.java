import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapters;

    public void print() {
        System.out.println("Chapter name: " + name);
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
    //constructor
    public Chapter(String name) {
        this.name = name;
        subChapters = new ArrayList<>();
    }
    //add subchapter
    public void addSubChapter(SubChapter subChapter) {
        subChapters.add(subChapter);
    }
    //get subchapter
    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }
    //get subchapter size
    public int getSubChapterSize() {
        return subChapters.size();
    }
    //get name
    public String getName() {
        return name;
    }
}
