package ejemplos;

public class Start {

	public static void main(String[] args) {
		
		int filas = 7;
		int columnas = 7;
		
		int[][] matriz = new int[filas][columnas];
		
//		matriz[7][8] = 1;
//		matriz[3][3] = 1;
//		matriz[2][5] = 1;
		
		
		
		//Para rellenar la primera fila con 1, la segunda con 2...
//		int numero = 1;
//		for(int x = 0; x < filas ; x++) {
//			
//			for(int z = 0; z < columnas; z++) {
//				
//				matriz[x][z] = numero++;
//			}
//		}
		
		//Para rellenar los bordes de la matriz con todo 1s.
//		for(int x = 0; x < filas ; x++) {
//		
//			for(int z = 0; z < columnas; z++) {
//			
//				if(x==0 || z==0 || x== filas-1 || z==columnas-1) {
//					matriz[x][z] = 1;
//				}
//			}
//			
//		}
			
		//La mariposa:
		
		int enBlanco = 0;
		for(int j = 0; j < columnas ; j++) {
			
			for(int i = enBlanco; i < filas - enBlanco; i++) {
			
				matriz[i][j] = 7;
			}
				
				if( j<columnas/2 ) enBlanco++;
				
				else enBlanco--;
				
				
			
			
		}
		
		for(int i = 0; i < filas ; i++) {
			
			for(int j = 0; j < columnas; j++) {
				//Imprimo la fila de la matriz que avanza con el primer bucle y las columnas
				//que avanza con el segundo, en la misma línea
				System.out.print(matriz[i][j] + " ");
			}
				
				//Salto de línea para seguir con la siguiente fila
				System.out.println();
		}
	}

}
