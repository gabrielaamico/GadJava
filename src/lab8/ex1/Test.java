package lab8.ex1;

public class Test {
    private int j;
    public int testLambda(){
        int i=0;
        j++;
        // i++; this will give us an error because we modify the value of i and that means i will not be final anymore
        Runnable r = () -> {
            System.out.println(i);
            System.out.println(this.j); // this e adresa obiectului curent
        };
        r.run();
        return i;
    }

    public static void main(String[] args){
       Test test = new Test();
       test.testLambda();
    }
}
