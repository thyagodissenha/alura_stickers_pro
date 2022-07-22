package alura_sticker;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class ViewMain {

	public static void showMenu() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		int option = 0;
		boolean loopMenu = true;
		try (Scanner sc = new Scanner(System.in)) {
			while(loopMenu) {			
				System.out.println("Digite a opção desejada");
				System.out.println("Opção 11 - Top 250 Movies");
				System.out.println("Opção 12 - Top 250 Movies Unicode");
				System.out.println("Opção 21 - Top 250 TVs");
				System.out.println("Opção 22 - Top 250 TVs Unicode");
				System.out.println("Opção 31 - Most Popular Movies");
				System.out.println("Opção 32 - Most Popular Unicode");
				System.out.println("Opção 41 - Most Popular TVs");
				System.out.println("Opção 42 - Most Popular TVs Unicode");
				System.out.println("Opção  0 - Sair");
				System.out.print("Opção: ");
				option = sc.nextInt();
				sc.nextLine();
				
				switch (option) {
				case 11:
					ViewImdbTop250Movies.showMovies();
					break;
				case 12:
					ViewImdbTop250Movies.showMoviesUnicode();
					break;
				case 21:
					ViewImdbTop250TVs.showMovies();
					break;
				case 22:
					ViewImdbTop250TVs.showMoviesUnicode();
					break;
				case 31:
					ViewMostPopularMovies.showMovies();
					break;
				case 32:
					ViewMostPopularMovies.showMoviesUnicode();
					break;
				case 41:
					ViewMostPopularTVs.showTVs();
					break;
				case 42:
					ViewMostPopularTVs.showTVsUnicode();
					break;
				case 0:
					System.out.println("Até mais!!!");
					loopMenu = false;
					break;

				default:
					System.out.println("Opção inválida");
					break;
				}
			}
		}
	}
}
