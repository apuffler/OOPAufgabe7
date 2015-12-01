
public class KantholzSaegerau extends Kantholz{

	public KantholzSaegerau(int laenge, int preis, int breite, int hoehe) {
		super(laenge, preis, breite, hoehe);
	}
	
	public boolean isSuitableForNutzbau(){
		return true;
	}
}
