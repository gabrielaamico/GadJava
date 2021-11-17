package lab4.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void storeContactToFile(String fileName, Contact contact){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(contact.toString());
            if(bufferedWriter!=null) bufferedWriter.close();
        }catch(Exception ex){

            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
       PhoneBook phoneBook = new PhoneBook("./src/lab4/io/contacts.txt");
       //System.out.println(phoneBook);
        System.out.println(phoneBook.findContact("Abbey"));
        storeContactToFile(".scr.lab4.io.foundContacts.txt", phoneBook.findContact("Abbey"));
    }

}
