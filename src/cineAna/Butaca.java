package cineAna;

public class Butaca {

	private boolean butaca_libre;
	private boolean butaca_bloqueada;
	private boolean butaca_ocupada;
	
	public Butaca() {
		butaca_libre= true;
		butaca_bloqueada= false;
	}

	public void setButaca_libre(boolean butaca_libre) {
		this.butaca_libre = butaca_libre;
	}

	public void setButaca_bloqueada(boolean butaca_bloqueada) {
		this.butaca_bloqueada = butaca_bloqueada;
	}
	
	public boolean getButacaLibre() {
		
		return butaca_libre = true;
	}

	public boolean getButacaBloqueada() {
		
		return butaca_bloqueada;
	}
	
	public void setButacaOcupada() {
		
		this.butaca_libre = false;
	}
	
	public boolean getButacaOcupada() {
		
		return butaca_ocupada=true;
	}

	
	public String toString() {
		
		if (butaca_bloqueada) return " #";
		else if(butaca_libre) return" -";
		else return " X";
	}
}
