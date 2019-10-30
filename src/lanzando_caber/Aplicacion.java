package lanzando_caber;

import java.io.IOException;

public class Aplicacion {
	
	public static void main(String[] args) throws IOException {
		String pathEntrada = "/home/diego/eclipse-workspace/LanzandoCaber/entrada.in";
		String pathSalida ="/home/diego/eclipse-workspace/LanzandoCaber/salida.out";
		Lectora lectora = new Lectora(pathEntrada);
		Competencia comp = lectora.obtenerCompetencia(pathEntrada);
		int[] podioDistancia = comp.hallarPodioDistancia();
		int[] podioConsistencia = comp.hallarPodioConsistencia();
		Escritora escritora = new Escritora(pathSalida);
		escritora.grabarSalida(podioConsistencia,podioDistancia);
	}
	
}
