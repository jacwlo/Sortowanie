package sortowanie;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/**Wprowadzenie d³ugoœci tablicy**/
		System.out.println("Witamy");
		System.out.print("Podaj wielkoœæ tablicy: ");
		int a = in.nextInt();
		int[] tab = new int[a];
		System.out.format("Wielkoœæ tablicy: %d", tab.length);
		
		for (int i=0; i<tab.length; i++){
		System.out.format("\nPodaj %d element tablicy: ", i+1);
		int b = in.nextInt();
		tab[i]=b;
		System.out.format("Wprowadzony %d element to: %d", i, tab[i]);
		};
	}

}
