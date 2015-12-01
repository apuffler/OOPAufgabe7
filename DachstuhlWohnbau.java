import java.util.LinkedList;

public class DachstuhlWohnbau extends Dachstuhl{

	public DachstuhlWohnbau(int laenge) {
		super(laenge);
	}

	@Override
	public Bauholz getSuitableBauholz(LinkedList<Bauholz> bauholzLager) {
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
