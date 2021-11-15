package lab3.Visitor;

public class TimeVisitor implements Visitor{
    private int time;

    public void visit (Book book){
        time += book.getNumberOfPages() * 4;
    }

    public void visit (Video video){
        time += video.getTime();
    }

    public void visit (Audio audio){
        time += audio.getTime();
    }

    @Override
    public void visit(PriceVisitor price) {

    }

    public String toString(){
        return "Total time is: " + time;
    }
}
