package alura_sticker;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import br.com.alura_sticker.ImdbTop250Item;
import br.com.alura_sticker.ImdbTop250TVs;
import br.com.alura_sticker.UnicodeString;

public class ViewImdbTop250TVs {
	public static void showMovies() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbTop250Item> listaImbdTop250 = ImdbTop250TVs.getTVs();
		System.out.println("*********************************Top 250 TVs*********************************");
		for (ImdbTop250Item tv : listaImbdTop250) {
			  System.out.println("Title       : " + tv.getTitle());	
			  System.out.println("Poster      : " + tv.getImage());
			  System.out.println("Imdb Rating : " + tv.getImDbRating());
		}		
	}
	public static void showMoviesUnicode() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbTop250Item> listaImbdTop250 = ImdbTop250TVs.getTVs();
		System.out.println("*********************************Top 250 TVs*********************************");
		for (ImdbTop250Item tv : listaImbdTop250) {
			  System.out.println("Title       : " + tv.getTitle());	
			  System.out.println("Poster      : " + tv.getImage());
			  System.out.println("Imdb Rating : " + UnicodeString.toStarEmoji((int)Double.parseDouble(tv.getImDbRating())) + "(" + tv.getImDbRating() + ")");
		}		
	}
}
