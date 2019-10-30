package lanzando_caber;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritora {
	
	private PrintWriter pw;
	
	public Escritora(String path) throws IOException{
		FileWriter fileWriter = new FileWriter(path);
		pw = new PrintWriter(fileWriter);
	}
	
	public void grabarSalida(int[] podioConsistencia, int[] podioDistancia){
		for(int i=0; i<podioConsistencia.length; i++){
			pw.print(podioConsistencia[i]+" ");
		}
		pw.println();
		for(int i=0; i<podioDistancia.length; i++){
			pw.print(podioDistancia[i]+" ");
		}
		pw.close();
	}
}
