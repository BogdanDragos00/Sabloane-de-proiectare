package lab3;

public class Paragraph implements Element {
    private String paragraphName;

    public Paragraph(String paragraphName) {
        this.paragraphName = paragraphName;
    }

    public Paragraph(Paragraph paragraph) {
        this.paragraphName = paragraph.paragraphName;
    }

    public void print() {
        System.out.println("Paragraph name: " + paragraphName);
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public boolean find(Element element) {
        if (!(element instanceof Paragraph))
            return false;
        else {
            return ((Paragraph) element).paragraphName.equals(this.paragraphName);
        }
    }
}
