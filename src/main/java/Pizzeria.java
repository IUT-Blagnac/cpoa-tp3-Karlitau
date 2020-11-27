public abstract class Pizzeria {
    PizzaFactory factory;
    public Pizzeria(PizzaFactory pizzaFactory){
        this.factory = pizzaFactory;
    }

    public Pizza commanderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}