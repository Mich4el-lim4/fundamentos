
public class Ringue {

	public static void main(String[] args) {
		Lutador lutador[] = new Lutador[6]; 
		
		lutador[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 1.75, 68.9);
		lutador[1] = new Lutador("Putscript", "Brasil", 29, 12, 0, 3, 1.7, 65.9);
		lutador[2] = new Lutador("Snapshasow", "EUA", 28, 10, 5, 1, 1.68, 60.9);
		lutador[3] = new Lutador("Dead Code", "Austrália", 28, 10, 4, 1, 1.80, 100.9);
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(lutador[0], lutador[1]);
		UEC01.lutar();
		
	}

}
