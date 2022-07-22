package alura_sticker;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import br.com.alura_sticker.ImdbMostPopularItem;
import br.com.alura_sticker.ImdbMostPopularMovies;
import br.com.alura_sticker.UnicodeString;

public class ViewMostPopularMovies {
	public static void showMovies() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbMostPopularItem> listaImbdMostPopular = ImdbMostPopularMovies.getMovies();
		System.out.println("*****************************Most Popular Movies*****************************");
		for (ImdbMostPopularItem movie : listaImbdMostPopular) {
			  System.out.println("Title       : " + movie.getTitle());	
			  System.out.println("Poster      : " + movie.getImage());
			  System.out.println("Imdb Rating : " + movie.getImDbRating());
		}		
	}
	public static void showMoviesUnicode() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbMostPopularItem> listaImbdMostPopular = ImdbMostPopularMovies.getMovies();
		System.out.println("*****************************Most Popular Movies*****************************");
		for (ImdbMostPopularItem movie : listaImbdMostPopular) {
			  System.out.println("Title       : " + movie.getTitle());	
			  System.out.println("Poster      : " + movie.getImage());
			  System.out.println("Imdb Rating : " + UnicodeString.toStarEmoji((int)Double.parseDouble(movie.getImDbRating())) + "(" + movie.getImDbRating() + ")");
		}		
	}
}
