package lanzando_caber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Competencia {
	
	private List<Competidor> listaCompetidores;
	private List<Competidor> listaCompetidoresConsistencia;
	private List<Competidor> listaCompetidoresDistancia;

	public Competencia(List<Competidor> listaCompetidores){
		this.listaCompetidores=listaCompetidores;
	}
	
	public int[] hallarPodioDistancia() {
		listaCompetidoresDistancia = new ArrayList<Competidor>();
		for(Competidor c : this.listaCompetidores){
			if(c.participaEnDistancia()){
				listaCompetidoresDistancia.add(c);
			}
		}
		int podioDistancia[] = new int[listaCompetidoresDistancia.size()];
		listaCompetidoresDistancia.sort(new Comparator<Competidor>() {
			@Override
			public int compare(Competidor o1, Competidor o2) {
				return o1.calcularDistancia() > o2.calcularDistancia() ? -1 :  1;
			}
		});
		for(int i=0; i<listaCompetidoresDistancia.size() && i<3; i++){
			podioDistancia[i]=listaCompetidoresDistancia.get(i).getNroCompetidor();
		}
		return podioDistancia;
	}

	public int[] hallarPodioConsistencia() {
		listaCompetidoresConsistencia = new ArrayList<Competidor>();
		for(Competidor c : this.listaCompetidores){
			if(c.participaEnConsistencia()){
				listaCompetidoresConsistencia.add(c);
			}
		}
		int podioConsistencia[] = new int[listaCompetidoresConsistencia.size()];
		listaCompetidoresConsistencia.sort(new Comparator<Competidor>() {
			@Override
			public int compare(Competidor o1, Competidor o2) {
				return (int) (o1.calcularConsistencia()-o2.calcularConsistencia());
			}
		});
		for(int i=0; i<listaCompetidoresConsistencia.size() && i<3;i++){
			podioConsistencia[i]=listaCompetidoresConsistencia.get(i).getNroCompetidor();
		}
		return podioConsistencia;
	}

	
}
