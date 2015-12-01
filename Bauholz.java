public abstract class Bauholz {
	protected int laenge;	//In Cm
	protected int preis;	//In Cent
	
	public Bauholz(int laenge, int preis){
		if(laenge <= 0 || preis < 0){
			throw new IllegalArgumentException("Price and Length must be positive");
		}
		
		this.laenge = laenge;
		this.preis = preis;
	}

	public int laenge() {
		return this.laenge;
	}

	public int preis() {
		return this.preis;
	}

	public boolean isSuitableForWohnbau(){
		return false;
	}

	public boolean isSuitableForSteinbau(){
		return false;
	}
	
	public boolean isSuitableForHolzbau(){
		return false;
	}
	
	public boolean isSuitableForNutzbau(){
		return false;
	}
}
