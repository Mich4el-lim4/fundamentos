
public class TestaCondicionalIf {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("você tem mais de 18 anos");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("você não tem 18, mas pode entrar, pois está acompanhado");
			} else {
				System.out.println("infelizmente você não pode entrar");
			}
		}
	}
}
