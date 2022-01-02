package Design_Pattern;

import java.util.Scanner;

public class Main {

    private static String  cloth;
    public static void main(String args[]){

            System.out.print("Add something in your basket: ");

            Scanner scan = new Scanner(System.in);
            cloth = scan.nextLine();

            Shopping shop = new Shopping();

            switch (cloth) {
                case "dress": {
                    shop.saleDresses();
                }
                break;
                case "jeans": {
                    shop.saleJeans();
                }
                break;
                case "jacket": {
                    shop.saleJackets();
                }
                break;
                case "tshirt": {
                    shop.saleTshirts();
                }
                break;
                case "blouse": {
                    shop.saleBlouses();
                }
                break;
                default: {
                    System.out.println("Your basket is empty");
                }
                return;
            }

    }

}

