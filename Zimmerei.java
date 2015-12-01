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
	public Dachstuhl construct(Dachstuhl dachst)
	{

		while (dachst.bauholzMaterial.size() > 0)
		{
			
			Bauholz b = this.lager.get(dachst);

			//Dachstuhl couldn't be finished, return all material.
			if(b == null ) // && !this.dachst.isFinished 
			{
				//Return all the Bauholu
				for (Bauholz r : this.lager.bauholzMaterial)
				{
					this.lager.add(r);
				}
				this.lager.bauholzLager = new LinkedList<Bauholz>();
			}

		}


		//Finished 
		return dachst;

	}

}