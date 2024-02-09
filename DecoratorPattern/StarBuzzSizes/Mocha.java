package DecoratorPattern.StarBuzzSizes;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        switch (beverage.size) {
            case TALL:
                return beverage.cost() + .20;
            case GRANDE:
                return beverage.cost() + .25;
            case VENTI:
                return beverage.cost() + .29;
                // TODO: with .30 there are floating point problems, use BigDecimal?
            default:
                return beverage.cost() + 0.20;
        }
    }
}