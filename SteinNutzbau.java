import java.util.LinkedList;

public class SteinNutzbau extends Steinbau{
	public SteinNutzbau(int laenge, int amount) {
		super(laenge, amount);
	}

	@Override
	public Bauholz getSuitableBauholz(LinkedList<Bauholz> bauholzLager) {
		for(Bauholz bauholz : bauholzLager){
			if(bauholz.isSuitableForSteinbau() && bauholz.isSuitableForNutzbau()){
				if(bauholz.laenge() >= this.laenge()){
					return bauholz;
				}
			}
		}
		return null;
	}
}
