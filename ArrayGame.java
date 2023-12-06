public class U5_2_MatrizRandomTry {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x = "";
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();


		System.out.println("Dime el rango (000-000): ");
		x = sc.nextLine();
		int n;
		String[] v = x.split("-");
		int f = 0;


		int[][] matriz = new int[10][10];
		
		int min = Integer.parseInt(v[0]);
		int max = Integer.parseInt(v[1]);


		rellenarMatriz(matriz,max,min);

		
		System.out.println("Dime un numero que creus que alberga la matriu: ");
		n = sc.nextInt();
		
		if (encontrarNumero(matriz,n)) {
			System.out.println("Pues si, si que esta dins del vector, eres un maquineta."); 
		} else {
			System.out.println("Tolai, no esta.");
		}

		System.out.println("Se repetix un total de " + numeroRepetido(matriz,n) + " voltes.");	

			System.out.println("Vols mirar la matriu? (0 no, 1 si)");
			f = sc.nextInt();
			if (f == 1) {
				imprimirMatriz(matriz);
			}

		
		System.out.println("Fi.");
		
	}

	public static int numeroRepetido(int[][] matriz, int n) {
		int c = 0;
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {

				if (n == matriz[i][j]) {
					c++;
				}
				
			}
		}
		
		return c;
	}
	
	
	public static boolean encontrarNumero(int[][] matriz, int n) {
		boolean sino = false;
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {

				if (n == matriz[i][j]) {
					sino = true;
				}
				
			}
		}
		
		
		return sino;
		
	}
	
	
	public static int[][] rellenarMatriz(int[][] matriz,int max,int min) {
		
		for (int i = 0; i < matriz.length; i++) {

			// Recorrer columnas
			for (int j = 0; j < matriz[0].length; j++) {

				matriz[i][j] = (int) (Math.random() * (max - min + 1) + min);

			}
		}

	return  matriz;
	
}
	
	public static void imprimirMatriz (int[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[0].length; j++) {

				System.out.printf("%5d", matriz[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void imprimirNombre (String nombre) {
	
	System.out.println("Felicidades " + nombre + "has ganado.");


	}




}
