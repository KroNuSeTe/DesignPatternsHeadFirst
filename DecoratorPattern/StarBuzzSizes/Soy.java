package DecoratorPattern.StarBuzzSizes;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        switch (beverage.size) {
            case TALL:
                return beverage.cost() + .15;
            case GRANDE:
                return beverage.cost() + .20;
            case VENTI:
                return beverage.cost() + .25;
            default:
                return beverage.cost() + .20;
        }
    }
}