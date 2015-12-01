import java.util.LinkedList;

public class Lager {
	private LinkedList<Bauholz> bauholzLager;
	
	public Lager(){
		this.bauholzLager = new LinkedList<Bauholz>();
	}
	
	public void add(Bauholz bauholz){
		if(bauholz != null){
			this.bauholzLager.add(bauholz);
		}
	}
	
	public void list(){		
		int holzCounter = 1;
		for(Bauholz b : this.bauholzLager){
			System.out.println("Länge des "+holzCounter+".Holzstückes: "+b.laenge());
		}
	}
	
	public Bauholz get(Dachstuhl stuhl){
		Bauholz suitableHolz = stuhl.getSuitableBauholz(this.bauholzLager);
		if(suitableHolz != null){
			this.bauholzLager.remove(suitableHolz);
			return suitableHolz;
		}
		return null;
	}
}
