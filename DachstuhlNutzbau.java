import java.util.LinkedList;

public class DachstuhlNutzbau extends Dachstuhl{

	public DachstuhlNutzbau(int laenge) {
		super(laenge);
	}

	@Override
	public Bauholz getSuitableBauholz(LinkedList<Bauholz> bauholzLager) {
		for(Bauholz bauholz : bauholzLager){
			if(bauholz.isSuitableForNutzbau()){
				if(bauholz.laenge() >= this.laenge()){
					return bauholz;
				}
			}
		}
		
		for(Bauholz bauholz : bauholzLager){
			if(bauholz.isSuitableForWohnbau()){
				if(bauholz.laenge() >= this.laenge()){
					return bauholz;
				}
			}
		}
		return null;
	}

}
