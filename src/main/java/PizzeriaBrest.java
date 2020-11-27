public class PizzeriaBrest extends Pizzeria{

    public PizzeriaBrest(PizzaFactory pizzaFactory) {
        super(pizzaFactory);
    }

    @Override
    public Pizza createPizza(String type) {
        return factory.create(type);
    }
}
