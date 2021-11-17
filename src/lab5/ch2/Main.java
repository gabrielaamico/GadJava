package lab5.ch2;

public class Main {
    public static void main(String[] args) {
        Boot boot1 = new Boot(20, "red");
        Boot boot2 = new Boot(20, "red");
        Shoe running1 = new Running(20, "red");
        Running running2 = new Running(22, "red");

        try {
            Pair<Boot> pair1 = new Pair<Boot>(boot1, boot2);
            Pair<Shoe> pair2 = new Pair<Shoe>(running1, running2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
