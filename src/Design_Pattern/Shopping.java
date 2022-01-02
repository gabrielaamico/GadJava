package Design_Pattern;

public class Shopping {

    private Clothes dress;
    private Clothes jeans;
    private Clothes blouse;
    private Clothes tshirt;
    private Clothes jacket;

    public Shopping(){
        dress = new Dresses();
        jeans = new Jeans();
        blouse = new Blouses();
        tshirt = new Tshirts();
        jacket = new Jackets();
    }

    public void saleDresses(){
        dress.type();
        dress.price();
    }

    public void saleJeans(){
        jeans.type();
        jeans.price();
    }

    public void saleJackets(){
        jacket.type();
        jacket.price();
    }

    public void saleBlouses(){
        blouse.type();
        blouse.price();
    }

    public void saleTshirts(){
        tshirt.type();
        tshirt.price();
    }

}
