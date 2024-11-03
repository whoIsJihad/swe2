// Beverage.java
public abstract class Beverages {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

// Espresso.java
class Espresso extends Beverages {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

// HouseBlend.java
class HouseBlend extends Beverages {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

// DarkRoast.java
class DarkRoast extends Beverages {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}

// CondimentDecorator.java
abstract class CondimentDecorator extends Beverages {
    public abstract String getDescription();

}

class Mocha extends CondimentDecorator {
    Beverages beverage;

    public Mocha(Beverages beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Moccha";
    }

    public double cost() {
        return beverage.cost() + 0.3;
    }
}

class Soy extends CondimentDecorator {
    Beverages beverage;

    public Soy(Beverages beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + 0.2;
    }
}

class Milk extends CondimentDecorator {
    Beverages beverage;

    public Milk(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
class CoffeeShop{
    public static void main(String[] args) {
        Beverages beverageOne=new DarkRoast();
        System.out.println(beverageOne.getDescription());
        System.out.println(beverageOne.cost());


        Beverages beverageTwo=new Espresso();
        System.out.println(beverageTwo.getDescription());
        System.out.println(beverageTwo.cost());

        Beverages beverageMocha=new Mocha(beverageTwo);
        System.out.println(beverageMocha.getDescription());
        System.out.println(beverageMocha.cost());

        Beverages mochaWithSoy=new Soy(beverageMocha);
        System.out.println(mochaWithSoy.getDescription());
        System.out.println(mochaWithSoy.cost());
    }
}