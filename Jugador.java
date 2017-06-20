import java.io.Serializable;
import java.util.Arrays;

public class Jugador implements Serializable {

	private int poder;
	private String tipo;
	private String[] armas;
	
	
	
	/**
	 * @return the poder
	 */
	public int getPoder() {
		return poder;
	}



	/**
	 * @param poder the poder to set
	 */
	public void setPoder(int poder) {
		if(poder>0){
		this.poder = poder;
		}
	}



	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}



	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	/**
	 * @return the armas
	 */
	public String[] getArmas() {
		return armas;
	}



	/**
	 * @param armas the armas to set
	 */
	public void setArmas(String[] armas) {
		this.armas = armas;
	}



	public Jugador() {
		poder=0;
		tipo=null;
		armas =null;	
	}
	
	public Jugador(int pow, String tip, String[] arm){
		setPoder(pow);
		setTipo(tip);
		setArmas(arm);
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jugador poder=" + poder + ", tipo=" + tipo + ", armas=" + Arrays.toString(armas);
	}
	
	

}
