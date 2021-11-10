package lab3.builder;

public class Main {
    public static void main(String[] args){
        Computer.Builder builder = new Computer.Builder("Intel I9");
        builder.setBluetooth(true);
        builder.setMemory(200);
        builder.setRam(300);
        builder.setVideo("Nvidia");

        Computer myComputer = builder.build();
        System.out.println(myComputer);
    }
}
