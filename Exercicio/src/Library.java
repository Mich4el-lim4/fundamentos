
public class Library {

	public static void main(String[] args) {
		Pessoa [] pessoa = new Pessoa [3];
		Livro [] livro = new Livro [3];
		
		pessoa [0] = new Pessoa("Ana", 23, "f");
		pessoa [1] = new Pessoa("Diego", 25, "m");
		
		livro [0] = new Livro("Aprenda java", "José da Silva", 300, pessoa[0]);
		livro [1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, pessoa[1]);
		livro [2] = new Livro("Java Avançado", "Maria Candido", 800, pessoa[0]);
		
		System.out.println(livro [0].detalhes() );
	}

}
