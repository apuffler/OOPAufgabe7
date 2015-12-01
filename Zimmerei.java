import java.util.LinkedList;
public class Zimmerei
{
	
	Lager lager = null;
	
	//ASSERT: Lager lager must not be NULL!
	public Zimmerei (Lager lager)
	{
		this.lager = lager;
	}

	//ASSERT: Lager l must not be NULL!
	public void setLager (Lager l)
	{
		this.lager = l;
	}
	//ASSERT: Dachstuhl dachst must not be NULL!
	public boolean construct(Dachstuhl dachst)
	{


		int lagerSize = this.lager.getBauholzVorrat().size();

		int dachstNeeded = dachst.getNeededBauholzAmount();

		LinkedList<Bauholz> dachstList = dachst.getBauholzList();
		

		//Not enough pieces available.
		if (lagerSize < dachstNeeded)
		{
			return false;
		}



		while (!dachst.isFinished())
		{
			Bauholz b = this.lager.get(dachst);

			//Dachstuhl couldn't be finished, return all material.
			if(b == null )
			{
				//Return all the Bauholz
				for (Bauholz r : dachstList)
				{
					this.lager.add(r);
				}
				dachst.getBauholzList().clear();
				return false;
			}

			this.lager.add(b);

		}

		//Finished 
		return true;

	}

}