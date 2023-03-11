
public class Teste {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumeroConta(1212);
		System.out.println(conta.getNumeroConta());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Engenheiro de software");
		System.out.println(conta.getTitular().getProfissao());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
	}

}
