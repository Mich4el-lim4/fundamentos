
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.setSaldo(100);
		contaPaulo.deposita(50);
		System.out.println(contaPaulo.getSaldo());
		
		boolean retirada = contaPaulo.saca(20);//retorno do metodo boolean
		System.out.println(contaPaulo.getSaldo());
		System.out.println(retirada);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(300, contaPaulo);
		System.out.println(contaMarcela.getSaldo());
		System.out.println(contaPaulo.getSaldo());
	}

}
