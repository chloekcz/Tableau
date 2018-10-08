package tableaux;

import java.lang.reflect.Array;

public class TestArray1 {

	public static void main(String[] args) {

		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		/** 
		 * Loop for
		 */
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}


		/**
		 * Loop for reverse
		 */
		for (int i = tab.length - 1; i >= 0; i--) {
			System.out.println(tab[i]);
		}

		
		/**
		 *  Display number > 3
		 */
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > 3) {
				System.out.println(tab[i]);
			}
		}

		
		/**
		 * Display even integer
		 */
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				System.out.println(tab[i]);
			}
		}
				
		
		
		/* ! Le tableau ne doit pas être vide pour être pris en compte */
		
		/**
		 * Display bigger number
		 */
		int resultat = Integer.MIN_VALUE; // C'est la valeur la plus petite (-2*10puissance 31)
		for (int i = 0; i < tab.length; i++) {
			int test = tab [i];
			if (test > resultat) {
				resultat = test;
				System.out.println(resultat);
			}
		}
		
		
		/**
		 * Display small number
		 */
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] < result) {
				result = tab[i];
			}
		}
		System.out.println(result);	
	}
}