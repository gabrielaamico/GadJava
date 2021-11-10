package lab3.decorator;

public class Whip extends Topping{
    public Whip (Beverage mainBeverage){
        super("whip", 2, mainBeverage);
    }
}
