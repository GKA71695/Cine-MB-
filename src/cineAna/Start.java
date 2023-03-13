package cineAna;

public class Start {

	public static void main(String[] args) {

		int filas =5;
		int columnas=5;
		Sala sala_cine = new Sala(filas, columnas);
		
		sala_cine.IniciaSala(true, 3);
		
		System.out.println(sala_cine.toString());
		
		sala_cine.guardarAsiento(4, 2);

		sala_cine.guardarAsiento(2, 2);

		sala_cine.guardarAsiento(2, 3);

		System.out.println(sala_cine.toString());

		sala_cine.liberarAsiento(4, 2);
		
		System.out.println(sala_cine.toString());
	}

}
