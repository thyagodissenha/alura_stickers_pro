package alura_sticker;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import br.com.alura_sticker.ImdbTop250Item;
import br.com.alura_sticker.ImdbTop250Movies;
import br.com.alura_sticker.UnicodeString;

public class ViewImdbTop250Movies {

	public static void showMovies() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbTop250Item> listaImbdTop250 = ImdbTop250Movies.getMovies();
		System.out.println("*******************************Top 250 Movies********************************");
		for (ImdbTop250Item movie : listaImbdTop250) {
			  System.out.println("Title       : " + movie.getTitle());	
			  System.out.println("Poster      : " + movie.getImage());
			  System.out.println("Imdb Rating : " + movie.getImDbRating());
		}		
	}
	public static void showMoviesUnicode() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbTop250Item> listaImbdTop250 = ImdbTop250Movies.getMovies();
		System.out.println("*******************************Top 250 Movies********************************");
		for (ImdbTop250Item movie : listaImbdTop250) {
			System.out.println("Title       : " + movie.getTitle());	
			System.out.println("Poster      : " + movie.getImage());
			System.out.println("Imdb Rating : " + UnicodeString.toStarEmoji((int)Double.parseDouble(movie.getImDbRating())) + "(" + movie.getImDbRating() + ")");
		}		
	}
}
