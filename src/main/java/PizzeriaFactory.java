public class PizzeriaFactory {
    static PizzeriaFactory  uniqueInstance = null;

    public PizzeriaFactory(){}

    public static synchronized PizzeriaFactory getInstance() {
        if (uniqueInstance == null){
            uniqueInstance = new PizzeriaFactory();
        }
        return uniqueInstance;
    }

    public Pizzeria create(String name){
        Pizzeria pizzeria;
        switch (name){
            case "Brest":
                pizzeria = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
                break;
            case "Strasbourg":
                pizzeria = new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        return pizzeria;
    }
}
