
public abstract class Rundholz extends Bauholz{
	protected int durchmesser;	//In Cm
	
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
