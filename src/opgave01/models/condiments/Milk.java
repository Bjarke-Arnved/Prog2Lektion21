package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Milk extends CondimentDecorator {

    protected Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
