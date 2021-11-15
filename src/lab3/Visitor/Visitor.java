package lab3.Visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Video video);
    void visit(Audio audio);
    void visit(PriceVisitor price);
}
