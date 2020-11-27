import java.util.ArrayList;

public class PizzaCheeseStyleStrasbourg extends Pizza{
    public PizzaCheeseStyleStrasbourg() {
        this.nom = "Pizza pâte style Strasbourg et fromage";
        this.garnitures = new ArrayList();
        this.garnitures.add("Mozzarella en lamelles");
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
