package alura_sticker;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import br.com.alura_sticker.ImdbMostPopularItem;
import br.com.alura_sticker.ImdbMostPopularTVs;
import br.com.alura_sticker.UnicodeString;

public class ViewMostPopularTVs {
	public static void showTVs() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbMostPopularItem> listaImbdMostPopular = ImdbMostPopularTVs.getTVs();
		System.out.println("******************************Most Popular TVs*******************************");
		for (ImdbMostPopularItem tv : listaImbdMostPopular) {
			  System.out.println("Title       : " + tv.getTitle());	
			  System.out.println("Poster      : " + tv.getImage());
			  System.out.println("Imdb Rating : " + tv.getImDbRating());
		}		
	}
	public static void showTVsUnicode() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbMostPopularItem> listaImbdMostPopular = ImdbMostPopularTVs.getTVs();
		System.out.println("******************************Most Popular TVs*******************************");
		for (ImdbMostPopularItem tv : listaImbdMostPopular) {
			  System.out.println("Title       : " + tv.getTitle());	
			  System.out.println("Poster      : " + tv.getImage());
			  System.out.println("Imdb Rating : " + UnicodeString.toStarEmoji((int)Double.parseDouble(tv.getImDbRating())) + "(" + tv.getImDbRating() + ")");
		}		
	}
}
