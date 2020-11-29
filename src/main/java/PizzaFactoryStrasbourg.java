public class PizzaFactoryStrasbourg extends PizzaFactory{
    private static PizzaFactoryStrasbourg uniqueInstance = null;

    public static PizzaFactoryStrasbourg getInstance() {
        if (uniqueInstance == null){
            uniqueInstance = new PizzaFactoryStrasbourg();
        }
        return uniqueInstance;
    }

    @Override
    public Pizza create(String name) {
        Pizza pizza;
        switch (name){
            case "Grecque":
                pizza = new PizzaGrecqueStyleStrasbourg();
            break;
            case "Poivron":
                pizza = new PizzaPoivronStyleStrasbourg();
                break;
            case "fromage":
                pizza = new PizzaCheeseStyleStrasbourg();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        return pizza;
    }
}
