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
        double cost = beverage.cost();
        switch (beverage.size) {
            case TALL:
                return cost + .15;
            case GRANDE:
                return cost + .20;
            case VENTI:
                return cost + .25;
            default:
                return cost + .15;
        }
    }
    
}