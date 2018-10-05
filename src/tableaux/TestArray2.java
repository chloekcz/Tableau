package tableaux;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Display average
		int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		double moyenne = (double) somme / tab.length;
		System.out.println(moyenne);
		
		
		
		// Display index 
		int index = 15;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == 15) {
				index=i;
				break;
			}
		}
		
		System.out.println(index);
		
		
		
		
		
		// Display duplicate
		int nbDoublon = 0;
		for (int i = 0; i < tab.length-1; i++) {
			nbDoublon = tab[i];
			for (int j = i + 1; j < tab.length-1; j++) {
				int nombre = tab[j];
				if (nbDoublon == nombre) {
					System.out.println(nombre);
				}
		}
		}
		
		
	}

}
