package br.com.alura_sticker;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class GeradorDeFigurinhas {
	
	public static void gerarFigurinha(InputStream imputStream, String nome, double imdbRating) throws Exception {
        File dir = new File("saida");
        if (!dir.exists()) dir.mkdirs();
		nome = nome.replaceAll("[^A-Za-z0-9()\\[\\]]", "");
		BufferedImage imagemOriginal = ImageIO.read(imputStream);
		double escala = (double) 450/imagemOriginal.getWidth();
		int largura = (int) (imagemOriginal.getWidth() * escala);
		int altura = (int) (imagemOriginal.getHeight() * escala);
		int rodape = 200;
		int tamanhoEstrela = 30;
		String textoFigurinha = "TOPZERA";
		BufferedImage imagemNova = new BufferedImage(largura, altura + rodape, BufferedImage.TRANSLUCENT);
		Graphics2D graphics = imagemNova.createGraphics();
		Font fonte = openFontTTF();
		graphics.setFont(fonte);
		graphics.setColor(Color.YELLOW);
		FontMetrics metrics = graphics.getFontMetrics();
		int larguraTexto = metrics.stringWidth(textoFigurinha);
		graphics.drawImage(imagemOriginal, 0, 0, largura, altura, null);
		graphics.drawImage(gerarEstrela(imdbRating, tamanhoEstrela), (int)largura/2 - (int)(tamanhoEstrela*10/2), altura + (int)rodape/2 + tamanhoEstrela, tamanhoEstrela*10, tamanhoEstrela, null);
		graphics.drawString(textoFigurinha, (int)largura/2 - (int)larguraTexto/2, altura + (int)rodape/2);
		
		ImageIO.write(imagemNova, "png", new File("saida/" + nome + ".png"));
	}
	
	public static BufferedImage gerarEstrela(double imdbRating, int tamanhoEstrela) throws Exception {
		int imdbRatingInteiro = (int) imdbRating;
		int imdbRatingResto = (int) ((imdbRating - imdbRatingInteiro) * 10);
		BufferedImage estrelaAmarela = resizeImagem(ImageIO.read(new File("src/main/resources/EstrelaAmarela.png")), tamanhoEstrela,tamanhoEstrela);
		BufferedImage estrelaPerta = resizeImagem(ImageIO.read(new File("src/main/resources/EstrelaPreta.png")), tamanhoEstrela,tamanhoEstrela);
		BufferedImage imagemNova = new BufferedImage(tamanhoEstrela*10, tamanhoEstrela, BufferedImage.TRANSLUCENT);
		Graphics2D graphics = imagemNova.createGraphics();
		for(int i = 0; i < imdbRatingInteiro; i++) {
			graphics.drawImage(estrelaAmarela, tamanhoEstrela*i, 0, null);
		}
		for(int i = imdbRatingInteiro; i < 10; i++) {
			graphics.drawImage(estrelaPerta, tamanhoEstrela*i, 0, null);
		}
		graphics.drawImage(estrelaAmarela,
				tamanhoEstrela*imdbRatingInteiro,
                0,
                (int)(tamanhoEstrela*imdbRatingInteiro+(int)(tamanhoEstrela/10)*imdbRatingResto),
                tamanhoEstrela,
                0,
                0,
                (int)(tamanhoEstrela/10)*imdbRatingResto,
                tamanhoEstrela,
                null);
		return imagemNova;
	}
	
	public static Font openFontTTF() throws Exception {

		Font font = Font.createFont(Font.TRUETYPE_FONT, new File("src/main/resources/Android Scratch.ttf"));
		return font.deriveFont(48f);
	}
	
	public static BufferedImage resizeImagem(BufferedImage imagem, int altura, int largura) {
		
		BufferedImage imagemNova = new BufferedImage(largura, altura, BufferedImage.TRANSLUCENT);
		Graphics2D graphics = imagemNova.createGraphics();
		graphics.drawImage(imagem, 0, 0, altura, largura, null);
		return imagemNova;		
	}
}
