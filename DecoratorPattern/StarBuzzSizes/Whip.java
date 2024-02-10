package DecoratorPattern.StarBuzzSizes;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        double cost = beverage.cost();
        switch (beverage.size) {
            case TALL:
                return cost + .25;
            case GRANDE:
                return cost + .30;
            case VENTI:
                return cost + .35;
            default:
                return cost + .25;
        }
    }
}