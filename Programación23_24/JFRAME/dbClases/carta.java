package dbClases;

public class carta {

	private String dni;
	private int ritmo;
	private int tiro;
	private int pase;
	private int regate;
	private int defensa;
	private int fisico;
	public carta(String dni, int ritmo, int tiro, int pase, int regate, int defensa, int fisico) {
		super();
		this.dni = dni;
		this.ritmo = ritmo;
		this.tiro = tiro;
		this.pase = pase;
		this.regate = regate;
		this.defensa = defensa;
		this.fisico = fisico;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getRitmo() {
		return ritmo;
	}
	public void setRitmo(int ritmo) {
		this.ritmo = ritmo;
	}
	public int getTiro() {
		return tiro;
	}
	public void setTiro(int tiro) {
		this.tiro = tiro;
	}
	public int getPase() {
		return pase;
	}
	public void setPase(int pase) {
		this.pase = pase;
	}
	public int getRegate() {
		return regate;
	}
	public void setRegate(int regate) {
		this.regate = regate;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getFisico() {
		return fisico;
	}
	public void setFisico(int fisico) {
		this.fisico = fisico;
	}
	@Override
	public String toString() {
		return "carta [dni=" + dni + ", ritmo=" + ritmo + ", tiro=" + tiro + ", pase=" + pase + ", regate=" + regate
				+ ", defensa=" + defensa + ", fisico=" + fisico + "]";
	}
	
	
	
	
}
