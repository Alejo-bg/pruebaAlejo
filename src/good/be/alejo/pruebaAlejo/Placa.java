package good.be.alejo.pruebaAlejo;

public class Placa {
	private String placa;

	public Placa(String placa) {
		super();
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	} 
	
	public boolean asignarParqueadero() {
		return (this.placa.charAt(0)=='A');
	}

}
