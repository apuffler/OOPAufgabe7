
public abstract class Rundholz extends Bauholz{
	protected int durchmesser;	//In Cm
	

	//ASSERT: int laenge must be >= 0, int preis must be >= 0, int breite must be >= 0, int durchmesser must be >= 0
	public Rundholz(int laenge, int preis, int durchmesser) {
		super(laenge, preis);
		if(durchmesser <= 0){
			throw new IllegalArgumentException("Diameter must be greater than zero");
		}
		
		this.durchmesser = durchmesser;
	}
	
	public boolean isSuitableForHolzbau(){
		return true;
	}
}
