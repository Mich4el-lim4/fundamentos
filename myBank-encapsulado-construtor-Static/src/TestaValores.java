
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1223, 2222);
		Conta conta2 = new Conta(1224, 2222);
		Conta conta3 = new Conta(1111, 4562);
		
		Cliente cliente = new Cliente();
		cliente.setNome("michael");
		cliente.setCpf("233.433.222-01");
		cliente.setProfissao("Programador");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Ana");
		cliente2.setCpf("444.443.244-01");
		cliente2.setProfissao("FrontEnd");
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Diego");
		cliente3.setCpf("444.666.244-01");
		cliente3.setProfissao("Infraestrutura");
		
		conta3.setTitular(cliente3);
		conta2.setTitular(cliente2);
		conta.setTitular(cliente);
		
		conta.status();
		conta2.status();
		conta3.status();
		
		System.out.println();
		System.out.println("Total de contas criadas: " + Conta.getTotal());
		
	}

}
