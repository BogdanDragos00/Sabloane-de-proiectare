public class MyBook {
  public static void main(String[] args) {
    Book discoTitanic = new Book("Disco Titanic");
    Author rpGheo = new Author("Radu Pavel Gheo");
    discoTitanic.addAuthor(rpGheo);
    String indexChapterOne = "Capitolul 1";
    Chapter chp1 = new Chapter(indexChapterOne);
    discoTitanic.addChapter(chp1);
    String indexSubChapterOneOne = "Subcapitolul 1.1";
    SubChapter scOneOne = new SubChapter(indexSubChapterOneOne);
    chp1.addSubChapter(scOneOne);
    scOneOne.addElement(new Paragraph("Paragraph 1"));
    scOneOne.addElement(new Paragraph("Paragraph 2"));
    scOneOne.addElement(new Paragraph("Paragraph 3"));
    scOneOne.addElement(new Image("Image 1"));
    scOneOne.addElement(new Paragraph("Paragraph 4"));
    scOneOne.addElement(new Table("Table 1"));
    scOneOne.addElement(new Paragraph("Paragraph 5"));
    scOneOne.print();
  }
}