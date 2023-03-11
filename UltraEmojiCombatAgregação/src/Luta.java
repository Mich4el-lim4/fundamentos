import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	public void marcarLuta(Lutador lutador, Lutador oponente) {
		if (lutador.getCategoria() == oponente.getCategoria() && lutador != oponente) {
			this.aprovado = true;
			this.desafiante = lutador;
			this.desafiado = oponente;
		} else {
			this.aprovado =false;
			this.desafiante = null;
			this.desafiado = null;
		}
	}
	
	public void lutar() {
		if (this.aprovado) {
			System.out.println();
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println();
			System.out.println("===== RESULTADO DA LUTA =====");
			switch (vencedor) {
			case 0:
				System.out.println();
				System.out.println("Empatou !!");
				this.desafiante.empatarLuta();
				this.desafiado.empatarLuta();
				break;

			case 1:
				System.out.println();
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			
			case 2:
				System.out.println();
				System.out.println("Vitória do " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
			
			System.out.println();
			System.out.println("============================");
			
		} else {
			System.out.println("A luta não pode acontecer ! ");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
}
