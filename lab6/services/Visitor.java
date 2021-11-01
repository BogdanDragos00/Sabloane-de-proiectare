package lab6.services;

import lab6.models.Book;
import lab6.models.Image;
import lab6.models.ImageProxy;
import lab6.models.Paragraph;
import lab6.models.Section;
import lab6.models.Table;
import lab6.models.TableOfContents;

public interface Visitor {
    void visitBook(Book book);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContents toc);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
}
