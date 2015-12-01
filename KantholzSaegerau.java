
public class KantholzSaegerau extends Kantholz{

	//ASSERT: int laenge must be >= 0, int preis must be >= 0, int breite must be >= 0, int hoehe must be >= 0
	public KantholzSaegerau(int laenge, int preis, int breite, int hoehe) {
		super(laenge, preis, breite, hoehe);
	}
	
	public boolean isSuitableForNutzbau(){
		return true;
	}
}
