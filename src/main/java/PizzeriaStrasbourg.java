public class PizzeriaStrasbourg extends Pizzeria{
    
    public PizzeriaStrasbourg(PizzaFactory pizzaFactory) {
        super(pizzaFactory);
    }

    @Override
    public Pizza createPizza(String type) {
        return factory.create(type);
    }
}
