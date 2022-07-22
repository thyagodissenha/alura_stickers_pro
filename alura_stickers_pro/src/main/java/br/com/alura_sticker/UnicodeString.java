package br.com.alura_sticker;

public class UnicodeString {
	
	public static String toStarEmoji(int valor) {
		StringBuilder stars = new StringBuilder(""); ;
		for(int i = 0; i < valor; i++)
			stars.append("\u2605");
		for(int i = 0; i < 10 - valor; i++)
			stars.append("\u2B50");
		return stars.toString();
	}
}
