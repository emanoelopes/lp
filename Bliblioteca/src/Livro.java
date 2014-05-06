public class Livro {

		private Integer codigo;
		private String titulo;
		private String autor;
		
		
		
		//Método construtor
		public Livro(Integer codigo, String titulo, String autor) {
			this.codigo = codigo;
			this.titulo = titulo;
			this.autor = autor;
		}
		
		public Integer getCodigo() {
			return codigo;
		}
		
		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}

		@Override
		public String toString() {
			return "Livro [codigo=" + codigo + ", titulo=" + titulo
					+ ", autor=" + autor + "]";
		}
		
}
