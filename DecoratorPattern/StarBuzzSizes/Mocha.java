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
        double cost = beverage.cost();
        switch (beverage.size) {
            case TALL:
                return cost + .20;
            case GRANDE:
                return cost + .25;
            case VENTI:
                return cost + .29;
                // with .30 there are floating point problems, use BigDecimal?
            default:
                return cost + .20;
        }
    }

}