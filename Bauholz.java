public abstract class Bauholz {
	protected int laenge;	//In Cm
	protected int preis;	//In Cent
	

	//ASSERT: int laenge must be >= 0, int preis must be >= 0
	public Bauholz(int laenge, int preis){
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
