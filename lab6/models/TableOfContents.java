package lab6.models;

import lab6.services.Visitee;
import lab6.services.Visitor;

/**
 * TableOfContents
 */
public class TableOfContents implements Element,Visitee{
    private String title;

    public TableOfContents(String title)
    {
        this.title=title;
    }

    public void print() {
        //empty
    }

    public void add(Element element) {
        //later
    }

    public void remove(Element element) {
        //later
    }

    public boolean find(Element element) {
        //not needed
        return false;
    }

    public Element clone() {
        TableOfContents newtoc=new TableOfContents(this.title);
        return newtoc;
     }
     
     public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}