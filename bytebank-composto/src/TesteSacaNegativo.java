
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		boolean statusSaque = conta.saca(100);
		if(statusSaque) {
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Valor insuficiente");
		}
		
		
		//System.out.println(conta.saldo);
		// não pode ser feito desta maneira
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);

	}

}
