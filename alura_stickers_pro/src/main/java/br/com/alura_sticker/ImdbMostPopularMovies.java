package br.com.alura_sticker;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class ImdbMostPopularMovies {
	public static List<ImdbMostPopularItem> getMovies() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbMostPopularItem> listaMostPapular = JsonParser.jsonToListMostPupularObject(RequestImdb.requestGet(ConfigApp.getProperties("urlMostPopularMovies")));
		return listaMostPapular;
	}
}
