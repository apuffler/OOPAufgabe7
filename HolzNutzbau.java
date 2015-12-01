import java.util.LinkedList;

public class HolzNutzbau extends Holzbau{
	public HolzNutzbau(int laenge, int amount) {
		super(laenge, amount);
	}

	@Override
	public Bauholz getSuitableBauholz(LinkedList<Bauholz> bauholzLager) {
		for(Bauholz bauholz : bauholzLager){
			if(bauholz.isSuitableForHolzbau() && bauholz.isSuitableForNutzbau()){
				if(bauholz.laenge() >= this.laenge()){
					return bauholz;
				}
			}
		}
		return null;
	}
}
