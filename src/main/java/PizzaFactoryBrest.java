public class PizzaFactoryBrest extends PizzaFactory{

    private static PizzaFactoryBrest uniqueInstance = null;

    public static PizzaFactoryBrest getInstance() {
        if (uniqueInstance == null){
            uniqueInstance = new PizzaFactoryBrest();
        }
        return uniqueInstance;
    }

    @Override
    public Pizza create(String name) {
        Pizza pizza;
        switch (name){
            case "Grecque":
                pizza = new PizzaGrecqueStyleBrest();
                break;
            case "Poivron":
                pizza = new PizzaPoivronStyleBrest();
                break;
            case "fromage":
                pizza = new PizzaCheeseStyleBrest();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        return pizza;
    }
}
