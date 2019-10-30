package lanzando_caber;

import java.util.ArrayList;
import java.util.List;

public class Competidor {
	
	private List<Tiro> listaDeTiros = new ArrayList<Tiro>(3);
	private int nroCompetidor;
	private double consistencia;
	private double distancia;
	
	public int getNroCompetidor() {
		return nroCompetidor;
	}

	public void setNroCompetidor(int nroCompetidor) {
		this.nroCompetidor = nroCompetidor;
	}

	public void realizarTiro(double distancia, double angulo){
		Tiro tiro = new Tiro(distancia,angulo);
		this.listaDeTiros.add(tiro);
	}
	
	public boolean participaEnConsistencia(){
		for(Tiro t : listaDeTiros){
			if(!t.compiteTiro()){
				return false;
			}
		}
		return true;
	}
	
	public boolean participaEnDistancia(){
		for(Tiro t : listaDeTiros){
			if(t.compiteTiro()){
				return true;
			}
		}
		return false;
	}
	
	public double calcularConsistencia(){
		double resta1 = listaDeTiros.get(0).getAngulo()-listaDeTiros.get(1).getAngulo();
		double resta2 = listaDeTiros.get(0).getAngulo()-listaDeTiros.get(2).getAngulo();
		double resta3 = listaDeTiros.get(1).getAngulo()-listaDeTiros.get(2).getAngulo();
		this.consistencia = Math.abs(resta1)+Math.abs(resta2)+Math.abs(resta3);
		return Math.abs(resta1)+Math.abs(resta2)+Math.abs(resta3);
	}
	
	public double calcularDistancia(){
		double distancia1 = listaDeTiros.get(0).compiteTiro() ?  listaDeTiros.get(0).getDistancia() : 0 ;
		double distancia2 = listaDeTiros.get(1).compiteTiro() ?  listaDeTiros.get(1).getDistancia() : 0 ;
		double distancia3 = listaDeTiros.get(2).compiteTiro() ?  listaDeTiros.get(2).getDistancia() : 0 ;
		return distancia1+distancia2+distancia3;
	}
}
