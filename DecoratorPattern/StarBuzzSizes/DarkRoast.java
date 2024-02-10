package DecoratorPattern.StarBuzzSizes;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    public double cost(){
        switch (size) {
            case TALL:
                return .99;
            case GRANDE:
                return 1.19;
            case VENTI:
                return 1.35;
            default:
                return .99;
        }
    }
    
}