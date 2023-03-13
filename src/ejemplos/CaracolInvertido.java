package ejemplos;

public class CaracolInvertido {

	public static void main(String[] args) {

		int tamanio = 5;
		int[][] datos = new int[tamanio][tamanio];
		
		int I = tamanio / 2;
		int J = tamanio /2;
		int numeroPoner = 25;
		
		datos[I][J] = numeroPoner--;
		
		//Creo una variable para los avances
		int avance = 2;
		
		while(numeroPoner != 0) {

			I--;
			J--;
			
			for(int k=0; k<avance; k++) {
				J++;
				datos[I][J] = numeroPoner--;
			}
			
			for(int k=0; k<avance; k++) {
				I++;
				datos[I][J] = numeroPoner--;
			}
	
			for(int k=0; k<avance; k++) {
				J--;
				datos[I][J] = numeroPoner--;
			}
			
			for(int k=0; k<avance; k++) {
				I--;
				datos[I][J] = numeroPoner--;
			}

			avance +=2;
		}
		
		
		
		for(int i = 0; i < tamanio ; i++) {
			
			for(int j = 0; j < tamanio; j++) {
				//Imprimo la fila de la matriz que avanza con el primer bucle y las columnas
				//que avanza con el segundo, en la misma línea
				
				if(datos[i][j]<10) {
					System.out.print("0");
				}
				System.out.print(datos[i][j] + " ");
			}
				
				//Salto de línea para seguir con la siguiente fila
				System.out.println();
		}
	
	}

}
