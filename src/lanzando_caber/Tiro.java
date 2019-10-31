package lanzando_caber;

public class Tiro {
	
	private double distancia;
	private double angulo;
	
	public Tiro(double distancia, double angulo) {
		this.angulo = angulo;
		if(this.angulo>-30 && this.angulo<30) {
			this.distancia=distancia;
		}else {
			this.distancia=distancia-distancia*0.2;
		}
	}
	
	
	public boolean compiteTiro(){
		return this.angulo >= -90.00 && this.angulo <= 90.00;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
	
	
}
