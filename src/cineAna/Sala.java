package cineAna;

public class Sala {
	
	private Butaca asientos[][];
	private boolean modo_covid;
	private int numFilas;
	private int numColumnas;
	
	public Sala(int filas, int columnas) {
		this.numFilas= filas;
		this.numColumnas= columnas;
	}
	
	/**
	 * Método que crea una matriz de butacas.
	 * @param esCovid Si hay covid se bloquean asientos para separar.
	 * @param num_separacion Numero de asientos de separación en modo covid.
	 */
	public void IniciaSala(boolean esCovid, int num_separacion) {
		modo_covid = esCovid;
		asientos = new Butaca[numFilas][numFilas];
		int contador=0;
		
		for(int i = 0; i<numFilas;i++ ) {
			for(int j=0; j<numColumnas; j++) {
				Butaca butaca = new Butaca();
				asientos[i][j]= butaca;
				
				if(modo_covid) {
					if(contador<num_separacion)
						contador++;
					else {
						butaca.setButaca_bloqueada(esCovid);
						contador=0;
					}
				}
			}
		}
	}
	
	public void guardarAsiento(int fila, int columna) {
		
		Butaca butaca;
		butaca = asientos[fila][columna];
		if(butaca.getButacaLibre() && !butaca.getButacaBloqueada()) {
			butaca.setButacaOcupada();
		}
	}
	
	public void liberarAsiento(int fila, int columna) {
		
		Butaca butaca;
		butaca = asientos[fila][columna];
		if(butaca.getButacaOcupada()) {
			butaca.setButaca_libre(true);
		}
		
	}

	public String toString() {
		String devolver = "";
		Butaca butaca = new Butaca();
		
		for(int i=0; i<numFilas; i++) {
			for(int j=0; j<numColumnas; j++) {
				
				butaca = asientos[i][j];
				devolver +=  (i)+ " " + (j) +" "+ butaca.toString() + "\n" ;
			}
		}
		return devolver;
	}
}
