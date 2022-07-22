package br.com.alura_sticker;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class ImdbTop250TVs {
	
	public static List<ImdbTop250Item> getTVs() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbTop250Item> listaTop250 = JsonParser.jsonToListTop250Object(RequestImdb.requestGet(ConfigApp.getProperties("urlTop250Tvs")));
		return listaTop250;
	}

}
