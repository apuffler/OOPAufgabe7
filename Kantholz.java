
public abstract class Kantholz extends Bauholz{
	protected int breite;
	protected int hoehe;
	public Kantholz(int laenge, int preis, int breite, int hoehe) {
		super(laenge, preis);
		if(breite <= 0 || hoehe <= 0){
			throw new IllegalArgumentException("Width and Height must be greater than zero");
		}
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public boolean isSuitableForSteinbau(){
		return true;
	}
}
