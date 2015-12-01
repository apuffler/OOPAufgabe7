
public abstract class Kantholz extends Bauholz{
	protected int breite;
	protected int hoehe;

	//ASSERT: int laenge must be >= 0, int preis must be >= 0, int breite must be >= 0, int hoehe must be >= 0
	public Kantholz(int laenge, int preis, int breite, int hoehe) {
		super(laenge, preis);
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public boolean isSuitableForSteinbau(){
		return true;
	}
}
