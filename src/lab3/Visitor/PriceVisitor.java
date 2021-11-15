package lab3.Visitor;

public class PriceVisitor implements Visitor{
    private int cost;

    public PriceVisitor(int cost){
        this.cost=cost;
    }

    public PriceVisitor() {

    }

    public int getCost(){
        return cost;
    }

    @Override
    public void visit(Book book) {
        cost += book.getPrice();
    }

    @Override
    public void visit(Video video) {
        cost += video.getPrice();
    }

    @Override
    public void visit(Audio audio) {
        cost += audio.getPrice();
    }

    @Override
    public void visit(PriceVisitor price) {

    }

    public String toString(){

        return "Total price is: " + cost;
    }
}
