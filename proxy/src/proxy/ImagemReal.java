package proxy;

public class ImagemReal implements Imagem{
	private String nomeDoArquivo;

	public ImagemReal(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
		carregarImagemDoDisco();
	}

	private void carregarImagemDoDisco() {
		System.out.println("Carregando " + nomeDoArquivo);
	}

	public void mostrarImagem() {
		System.out.println("Mostrando " + nomeDoArquivo);
	}
}
