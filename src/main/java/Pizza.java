import java.util.ArrayList;

public abstract class Pizza {
	String nom;
	String pate;
	String sauce;
	ArrayList garnitures;

	public void preparer() {
		System.out.println("Préparation de "+ getNom());
		System.out.println("Étalage de la pâte...");
		System.out.println("Ajout de la sauce...");
		System.out.println("Ajout des garnitures:");
		for (int i = 0; i < garnitures.size(); i++) {
			System.out.println("   " + garnitures.get(i));
		}

	}

	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180 degrés");
	}

	public void couper() {
		System.out.println("Découpage en parts triangulaires");
	}

	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");
	}

	public String getNom() {
		return nom;
	}
}
