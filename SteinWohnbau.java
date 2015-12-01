import java.util.LinkedList;

public class SteinWohnbau extends Steinbau{
	//ASSERT: int laenge must be >= 0, int amount must be >= 0
	public SteinWohnbau(int laenge, int amount) {
		super(laenge, amount);
	}


	//ASSERT: LinkedList<Bauholz> bauholzLager must not be NULL
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
