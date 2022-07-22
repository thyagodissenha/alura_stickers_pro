package br.com.alura_sticker;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class ImdbTop250Movies {

	public static List<ImdbTop250Item> getMovies() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbTop250Item> listaImbdTop250 = JsonParser.jsonToListTop250Object(RequestImdb.requestGet(ConfigApp.getProperties("urlTop250Movies")));
		return listaImbdTop250;
	}	
}
