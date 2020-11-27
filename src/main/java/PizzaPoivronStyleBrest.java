import java.util.ArrayList;

public class PizzaPoivronStyleBrest extends Pizza {
    public PizzaPoivronStyleBrest() {
        this.nom = "PizzaPoivronStyleBrest";
        ArrayList garnitures = new ArrayList();
        garnitures.add("Poivron");
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
