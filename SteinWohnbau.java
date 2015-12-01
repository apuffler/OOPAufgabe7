import java.util.LinkedList;

public class SteinWohnbau extends Steinbau{
	public SteinWohnbau(int laenge, int amount) {
		super(laenge, amount);
	}

	@Override
	public Bauholz getSuitableBauholz(LinkedList<Bauholz> bauholzLager) {
		for(Bauholz bauholz : bauholzLager){
			if(bauholz.isSuitableForSteinbau() && bauholz.isSuitableForWohnbau()){
				if(bauholz.laenge() >= this.laenge()){
					return bauholz;
				}
			}
		}
		return null;
	}
}
