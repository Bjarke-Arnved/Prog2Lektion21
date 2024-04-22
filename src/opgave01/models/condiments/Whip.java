package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Whip extends CondimentDecorator{
    protected Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
