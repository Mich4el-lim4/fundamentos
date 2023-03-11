
public class Conta {

	private int numConta;
	private String tipoConta;
	private String nome;
	private double saldo;
	private boolean status;
	
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void estadoAtual() {
		System.out.println();
		System.out.println("Numero da conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipoConta());
		System.out.println("Nome do titular: " + this.getNome());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status da conta: " + this.getStatus());
		System.out.println();
	}
	
	public void abrirConta(String tipoConta) {
		this.setTipoConta(tipoConta);
		this.setStatus(true);
		
		if (tipoConta == "cc" || tipoConta == "CC" || tipoConta == "Cc" || tipoConta == "cC") {
			this.setSaldo(50);
		} else if(tipoConta == "cp" || tipoConta == "CP" || tipoConta == "Cp" || tipoConta == "cP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!!!");
	}
	
	public void fecharCota() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
		} else if(this.getSaldo() < 0){
			System.out.println("Conta não pode ser fecheda pois tem débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!!!");
		}
	}
	
	public void deposita(double valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na conta " + this.getNome());
		} else {
			System.out.println("Inpossível fazer o deposito!!!");
		}
	}
	
	public void sacar(double valor) {
		if (this.getStatus()) {
			if(this.getSaldo() >= valor) {
				System.out.println("Saque realizado na conta de " + this.getNome());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
			System.out.println("Impossível sacar de uma conta fechada!!!");
		}
	}
	
	public void pagarMensal() {
		double valorMensal = 0;
		if (this.getTipoConta() == "cc" || tipoConta == "CC" || tipoConta == "Cc" || tipoConta == "cC") {
			valorMensal = 12;
		} else if(this.getTipoConta() == "cp" || tipoConta == "CP" || tipoConta == "Cp" || tipoConta == "cP") {
			valorMensal = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - valorMensal);
		} else {
			System.out.println("Inpossível paga uma conta fechada!!!");
		}
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
}
