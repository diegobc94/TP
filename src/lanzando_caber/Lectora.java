package lanzando_caber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lectora {
	List<Competidor> listaCompetidores;
	Scanner sc;
	
	public Lectora(String path){
		File file = new File(path);
		try {
			this.sc= new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Competencia obtenerCompetencia(String path){
		int cantCompetidores = this.sc.nextInt();
		listaCompetidores = new ArrayList<Competidor>(cantCompetidores);
		for(int i=0; i<cantCompetidores; i++){
			Competidor competidor = new Competidor();
			competidor.setNroCompetidor(i+1);		
			competidor.realizarTiro(sc.nextDouble(), sc.nextDouble());
			competidor.realizarTiro(sc.nextDouble(), sc.nextDouble());
			competidor.realizarTiro(sc.nextDouble(), sc.nextDouble());
			listaCompetidores.add(competidor);
		}
		Competencia comp = new Competencia(listaCompetidores);
		sc.close();
		return comp;
	}
}
