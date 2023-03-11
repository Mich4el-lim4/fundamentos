

public class RemoteControl implements Controller {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public RemoteControl() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void turnOn() {
		this.setLigado(true);
		
	}

	@Override
	public void turnOff() {
		this.setLigado(false);
		
	}

	@Override
	public void openMenu() {
		if(this.isLigado()) {
			System.out.println("-------MENU-------");
			System.out.println("Está ligado? " + this.isLigado());
			System.out.println("Está tocando? " + this.isTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 0; i <= this.getVolume(); i += 10) {
				System.out.print(" [|]");
				
			}
		} else {
			System.out.println("Desligado");
		}
		
	}
	
	@Override
	public void closesMenu() {
		System.out.println("Fechando Menu...");
		
	}

	@Override
	public void moreVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
		
	}

	@Override
	public void lessVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
		
	}

	@Override
	public void turnOnMute() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void turnOffMute() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if(this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if(this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
		
	}
	
}
