import java.util.LinkedList;

public abstract class Dachstuhl {
	protected LinkedList<Bauholz> bauholzMaterial;
	protected int laenge;
	protected int neededBauholzAmount;
	
	public Dachstuhl(int laenge, int bholzAmount){
		this.bauholzMaterial = new LinkedList<Bauholz>();
		this.laenge = laenge;
		this.neededBauholzAmount = bholzAmount;
	}
	
	public void list(){
		int holzCounter = 1;
		for(Bauholz b : this.bauholzMaterial){
			System.out.println("Laenge des "+holzCounter+".Holzstueckes: "+b.laenge());
		}
	}
	
	public void price(){
		int preis = 0;
		for(Bauholz b : this.bauholzMaterial){
			preis += b.preis();
		}
		
		System.out.println("Der Preis fuer diesen Dachstuhl betraegt " + preis + " cm");
	}
	
	public void add(Bauholz b){
		this.bauholzMaterial.add(b);
	}
	
	public int laenge(){
		return this.laenge;
	}

	public LinkedList<Bauholz> getBauholzList(){
		return this.bauholzMaterial;
	}

	public boolean isFinished(){
		return this.bauholzMaterial.size() == this.neededBauholzAmount;
	}

	public abstract Bauholz getSuitableBauholz(LinkedList<Bauholz> bauholzLager);
}
