package br.com.alura_sticker;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class ImdbMostPopularTVs {
	public static List<ImdbMostPopularItem> getTVs() throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		List<ImdbMostPopularItem> listTVs = JsonParser.jsonToListMostPupularObject(RequestImdb.requestGet(ConfigApp.getProperties("urlMostPopularTVs")));
		return listTVs;
	}
}
