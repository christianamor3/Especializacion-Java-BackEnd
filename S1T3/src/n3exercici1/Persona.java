package n3exercici1;

public class Persona {

	private String nom;
	private String cognom;
	private String DNI;
	
	public Persona(String nom, String cognom, String DNI) {
		this.nom = nom;
		this.cognom = cognom;
		this.DNI = DNI;
	}
	
	
	
	public final String getNom() {
		return nom;
	}

	public final String getCognom() {
		return cognom;
	}

	public final String getDNI() {
		return DNI;
	}



	public String pasarDatosCSV() {
		return this.nom+","+this.cognom+","+this.DNI;
	}



	@Override
	public String toString() {
		return "nom=" + nom + " cognom=" + cognom + " DNI=" + DNI + "]";
	}
	
	
}
