/**Aplikacja przyjmuje na wejscie niekompletna tablice oraz
 * wielkosc calej tablicy. Na wyjscie otrzymujemy brakujace 
 * elementy tablicy**/

package sortowanie;

//import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		/**Wprowadzenie dlugosci tablicy z konsoli**/
		//Scanner in = new Scanner(System.in);
		/*
		System.out.println("Witamy");
		System.out.print("Podaj wielkoœæ tablicy: ");
		int a = in.nextInt();
		int[] tab = new int[a];
		System.out.format("Wielkoœæ tablicy: %d", tab.length);
		*/
		/*
		for (int i=0; i<tab.length; i++){
			System.out.format("\nPodaj %d element tablicy: ", i+1);
			int b = in.nextInt();
			tab[i]=b;
			System.out.format("Wprowadzony %d element to: %d", i, tab[i]);
		};
		*/
		/**Zdefiniowana wielkosci tablicy  **/
		int[] tab_in={2,3,7,4,9};
		int[] tab_out= new int[10];
		int out;
		
		/**Petla porownujaca tablice wejsciowa z tablica kompletna
		 * i wstawiajaca flagi (0) tam gdzie wystepuja wspolne elementy**/
		for (int i=0; i<tab_out.length; i++){
			tab_out[i]=i+1;
			out=tab_out[i];
			for (int j=0; j<tab_in.length; j++){
				if (tab_in[j]==out)
				tab_out[i]=0;
			};
			if (tab_out[i]!=0)
			System.out.println(tab_out[i]);
		};
		
	}

}
