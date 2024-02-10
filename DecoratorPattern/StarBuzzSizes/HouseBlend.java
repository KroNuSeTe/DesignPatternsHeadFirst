package DecoratorPattern.StarBuzzSizes;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost(){
        switch (size) {
            case TALL:
                return .89;
            case GRANDE:
                return 1.09;
            case VENTI:
                return 1.18;
            default:
                return .89;
        }
    }
    
}