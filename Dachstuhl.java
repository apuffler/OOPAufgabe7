import java.util.LinkedList;

public abstract class Dachstuhl {
	protected LinkedList<Bauholz> bauholzMaterial;
	protected int laenge;
	
	public Dachstuhl(int laenge){
		this.bauholzMaterial = new LinkedList<Bauholz>();
		this.laenge = laenge;
	}
	
	public void list(){
		int holzCounter = 1;
		for(Bauholz b : this.bauholzMaterial){
			System.out.println("Länge des "+holzCounter+".Holzstückes: "+b.laenge());
		}
	}
	
	public void price(){
		int preis = 0;
		for(Bauholz b : this.bauholzMaterial){
			preis += b.preis();
		}
		
		System.out.println("Der Preis für diesen Dachstuhl beträgt " + preis + " €");
	}
	
	public void add(Bauholz b){
		this.bauholzMaterial.add(b);
	}
	
	public int laenge(){
		return this.laenge;
	}

	public abstract Bauholz getSuitableBauholz(LinkedList<Bauholz> bauholzLager);
}
