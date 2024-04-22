package opgave01.models.condiments;

import opgave01.models.beverages.Beverage;

public class Mocha extends CondimentDecorator {
    protected Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
