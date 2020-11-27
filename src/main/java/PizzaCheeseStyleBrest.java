import java.util.ArrayList;

public class PizzaCheeseStyleBrest extends Pizza{

    public PizzaCheeseStyleBrest() {
        super();
        this.nom = "Pizza sauce style brest et fromage";
        this.garnitures = new ArrayList();
        this.garnitures.add("Parmigiano reggiano râpé");
    }

    @Override
    public void preparer() {
        super.preparer();
    }

    @Override
    public void cuire() {
        super.cuire();
    }

    @Override
    public void couper() {
        super.couper();
    }

    @Override
    public void emballer() {
        super.emballer();
    }

    @Override
    public String getNom() {
        return super.getNom();
    }
}
