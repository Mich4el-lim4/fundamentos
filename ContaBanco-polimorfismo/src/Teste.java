
public class Teste {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumConta(1111);
		conta.setNome("Michael");
		conta.abrirConta("cc");
		conta.deposita(100);
		
		Conta conta2 = new Conta();
		conta2.setNumConta(3224);
		conta2.setNome("Ana");
		conta2.abrirConta("cp");
		conta2.deposita(150);
		
		conta.estadoAtual();
		conta2.estadoAtual();

	}

}
