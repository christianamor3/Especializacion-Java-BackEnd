package n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		
		crearArchivo("ListaLista.txt");
		
		File file = new File("C:/Users/Cristian/PruebaRuta");
		imprimirDirectorio (file);
		
		System.out.println("Ya se ha guardado el listado de archivos en su documento .txt");
		
		
		
		
	}
	
	public static void escribirArchivo(String ruta, String contenido) {
		File file = new File(ruta);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(file, true));
			salida.println(contenido);
			salida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void crearArchivo(String ruta) {
		File file = new File(ruta);
		
		try {
			PrintWriter salida = new PrintWriter(file);
			salida.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void imprimirDirectorio (File file) {
		
		String[] listaEscritorio = file.list();
		
		for (int i = 0; i<listaEscritorio.length;i++) {

			File f = new File(file.getAbsolutePath(),listaEscritorio[i]);
			
			if (f.isDirectory()) {
				
				Date fecha = new Date (f.lastModified());
				
				escribirArchivo("ListaLista.txt", listaEscritorio[i] + " (D)" + fecha);
					
				imprimirDirectorio(f);
				
			} else {
				Date fecha = new Date (f.lastModified());

				escribirArchivo("ListaLista.txt", listaEscritorio[i] + " (F)" + fecha);
				
			}
		}
	}

}

