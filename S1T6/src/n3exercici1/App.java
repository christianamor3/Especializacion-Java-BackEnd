package n3exercici1;

public class App {

	public static void main(String[] args) {
		
		Smartphone sm1 = new Smartphone();
		
		
		
		/* Como un objeto de una clase que implementa una interfaz, puede servir como objeto
		 * de esa interfaz, paso un objeto smartphone como parametro, ya que implementa Telefon y, por lo tanto,
		 * el objeto smartphone vale como objeto de tipo telefon.  
		 */
		Generica.returnT(sm1);
		Generica.returnE(sm1);
		
		/* El metodo limitado por la interficie Telefon no puede llamar al metodo ferFotos(),
		 * por que la interfaz solo sabe de su metodo trucar(). Está limitada a su metodo. 
		 * Sin embargo, el metodo que extiende Smartphone, como implementa
		 * Telefon, si puede llamar a sus metodos y a los propios.
		 */
	}

}
