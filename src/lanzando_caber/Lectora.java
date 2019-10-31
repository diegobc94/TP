package lanzando_caber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lectora {
	private List<Competidor> listaCompetidores;
	private static Scanner sc;
	
	public Lectora(String path){
		File file = new File(path);
		try {
			Lectora.sc=new Scanner(file);
			sc.useLocale(Locale.ENGLISH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Competencia obtenerCompetencia(){
		int cantCompetidores = sc.nextInt();
		Competidor competidor;
		listaCompetidores = new ArrayList<Competidor>(cantCompetidores);
		for(int i=0; i<cantCompetidores; i++){
			competidor = new Competidor();
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
