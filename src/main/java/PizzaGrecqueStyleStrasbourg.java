import java.util.ArrayList;

public class PizzaGrecqueStyleStrasbourg extends Pizza {

    public PizzaGrecqueStyleStrasbourg() {
        this.nom = "PizzaGrecqueStyleStrasbourg";
        ArrayList garnitures = new ArrayList();
        garnitures.add("Grecque");
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
