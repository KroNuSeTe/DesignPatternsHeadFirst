package DecoratorPattern.StarBuzz;

public abstract class Beverage{
    String description = "Unknown Beberage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}