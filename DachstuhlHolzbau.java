import java.util.LinkedList;

public class DachstuhlHolzbau extends Dachstuhl{
	public DachstuhlHolzbau(int laenge) {
		super(laenge);
	}

	@Override
	public Bauholz getSuitableBauholz(LinkedList<Bauholz> bauholzLager) {
		for(Bauholz bauholz : bauholzLager){
			if(bauholz.isSuitableForHolzbau()){
				if(bauholz.laenge() >= this.laenge()){
					return bauholz;
				}
			}
		}
		return null;
	}
}
