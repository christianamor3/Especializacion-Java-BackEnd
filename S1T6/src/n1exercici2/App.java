package n1exercici2;

public class App {

	public static void main(String[] args) {
		
		// Llamamos al metodo generico con diferentes tipos de parametros
		GenericMethods.imprimirArguments("Hola", 5, true);
		
		// Ahora lo hacemos con un objeto Persona, un String y un numero:
		GenericMethods.imprimirArguments(new Persona("Christian", "Amor", 25), "Buenos Dias", 365);

	}

}
