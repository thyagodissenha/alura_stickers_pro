package br.com.alura_sticker;

import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {
	
	public static List<ImdbTop250Item> jsonToListTop250Object(String json) throws JsonMappingException, JsonProcessingException{		
	    json = json.replace("{\"items\":", "").replace(",\"errorMessage\":\"\"}", "");
		final ObjectMapper objectMapper = new ObjectMapper();
	    List<ImdbTop250Item> listaImdbTop250 = objectMapper.readValue(json, new TypeReference<List<ImdbTop250Item>>() {});
		return listaImdbTop250;
	}
	public static List<ImdbMostPopularItem> jsonToListMostPupularObject(String json) throws JsonMappingException, JsonProcessingException {		
	    json = json.replace("{\"items\":", "").replace(",\"errorMessage\":\"\"}", "");
		final ObjectMapper objectMapper = new ObjectMapper();
	    List<ImdbMostPopularItem> listaImdbMostPopular = objectMapper.readValue(json, new TypeReference<List<ImdbMostPopularItem>>() {});
		return listaImdbMostPopular;
	}	
}
