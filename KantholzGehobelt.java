
public class KantholzGehobelt extends Kantholz{

	public KantholzGehobelt(int laenge, int preis, int breite, int hoehe) {
		super(laenge, preis, breite, hoehe);
	}
	public boolean isSuitableForWohnbau(){
		return true;
	}
}
