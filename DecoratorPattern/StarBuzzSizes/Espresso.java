package DecoratorPattern.StarBuzzSizes;

public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        switch (size) {
            case TALL:
                return 1.99;
            case GRANDE:
                return 2.19;
            case VENTI:
                return 2.35;
            default:
            return 1.99;
        }
    }
    
}