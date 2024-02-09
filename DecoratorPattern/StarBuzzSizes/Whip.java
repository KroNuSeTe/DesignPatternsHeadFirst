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
        switch (beverage.size) {
            case TALL:
                return beverage.cost() + .20;
            case GRANDE:
                return beverage.cost() + .25;
            case VENTI:
                return beverage.cost() + .30;
            default:
                return beverage.cost() + .20;
        }
    }
}