package n2exercici1;

public class GenericMethods <T, F>{

	T tipoGenerico;
	F tipoGenerico2;
	int num;
	
	public static <T, F> void imprimirArguments(T tipoGenerico, F tipoGenerico2, int num) {
		System.out.println(tipoGenerico);
		System.out.println(tipoGenerico2);
		System.out.println(num);

	}
	
	
	
	
}
