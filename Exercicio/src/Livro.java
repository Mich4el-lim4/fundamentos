
public class Livro implements Publicacao {
	 private String titulo;
	 private String autor;
	 private int totalPaginas;
	 private int paginaAtual;
	 private boolean aberto;
	 private Pessoa leitor;

	public String detalhes() {
		return "Livro\ntitulo= " + titulo + ",\nautor= " + autor + ",\ntotalPaginas= " + totalPaginas + ", \npaginaAtual= "
				+ paginaAtual + ", \naberto= " + aberto + ",\nleitor= " + leitor.getNome()
				+ "\nidade= " + leitor.getIdade() + "\nsexo= " + leitor.getSexo();
	}

public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.totalPaginas = totalPaginas;
	this.leitor = leitor;
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

public int getTotalPaginas() {
	return totalPaginas;
}

public void setTotalPaginas(int totalPaginas) {
	this.totalPaginas = totalPaginas;
}

public int getPaginaAtual() {
	return paginaAtual;
}

public void setPaginaAtual(int paginaAtual) {
	this.paginaAtual = paginaAtual;
}

public boolean isAberto() {
	return aberto;
}

public void setAberto(boolean aberto) {
	this.aberto = aberto;
}

public Pessoa getLeitor() {
	return leitor;
}

public void setLeitor(Pessoa leitor) {
	this.leitor = leitor;
}

@Override
public void abrir() {
	
}

@Override
public void fechar() {
	
}

@Override
public void folhear(int pagina) {
	this.paginaAtual = pagina;
}

@Override
public void avançarPag() {
	this.paginaAtual++;
}

@Override
public void intvoltarPag() {
	this.paginaAtual--;
}
 
}
