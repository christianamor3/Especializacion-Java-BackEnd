package n2exercici2;

public class Restaurant {

	private String nom;
	private int puntuacio;
	
	public Restaurant(String nom, int puntuacio) {
		super();
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	@Override
	public String toString() {
		return "nom:" + nom + ", puntuacio=" + puntuacio + "]";
	}

	
	
	
	
}
