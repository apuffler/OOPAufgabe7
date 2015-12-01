import java.util.LinkedList;

public class DachstuhlSteinbau extends Dachstuhl{

	public DachstuhlSteinbau(int laenge) {
		super(laenge);
	}

	@Override
	public Bauholz getSuitableBauholz(LinkedList<Bauholz> bauholzLager) {
		for(Bauholz bauholz : bauholzLager){
			if(bauholz.isSuitableForSteinbau()){
				if(bauholz.laenge() >= this.laenge()){
					return bauholz;
				}
			}
		}
		return null;
	}
}
