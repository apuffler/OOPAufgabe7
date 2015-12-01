
public class RundholzGehobelt extends Rundholz{


	//ASSERT: int laenge must be >= 0, int preis must be >= 0, int breite must be >= 0, int durchmesser must be >= 0
	public RundholzGehobelt(int laenge, int preis, int durchmesser) {
		super(laenge, preis, durchmesser);
	}
	public boolean isSuitableForWohnbau(){
		return true;
	}
}
