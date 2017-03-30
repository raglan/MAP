
public class Cliente {
	public static void main(String[]args){
		ImagemTarget imagem = new JpegImage();
		imagem.carregarImagem("teste.jpeg");
		imagem.desenharImagem(0, 0, 10, 10);
		
		imagem = new PngImage();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
		
		imagem = new BmpImage();
		imagem.carregarImagem("teste.bmp");
		imagem.desenharImagem(0, 0, 10, 10);
	}
}
