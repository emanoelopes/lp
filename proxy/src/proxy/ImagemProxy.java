package proxy;

public class ImagemProxy implements Imagem {

	private String nomeDoArquivo;
	private ImagemReal imagemReal;

	public ImagemProxy(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}

	@Override
	public void mostrarImagem() {
		if(imagemReal==null){
			imagemReal=new ImagemReal(nomeDoArquivo);
		}
		imagemReal.mostrarImagem();
	}

}
