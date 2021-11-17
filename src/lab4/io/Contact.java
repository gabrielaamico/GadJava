package lab4.io;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String toString(){
        return "Contact: " + name + "  Phone number: " + phoneNumber;
    }

    public String getName(){
        return name;
    }
}
