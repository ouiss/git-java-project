
public class Revue extends Document {
	
	private int mois;
	private int ann�e;
   
	public Revue(int num,String titre,int mois, int ann�e)
	{
		super(num,titre);
		this.mois=mois;
		this.ann�e=ann�e;
	}
   
	public String ToString(){
		
		return super.ToString() + "\n mois : " +mois + "\n ann�e : " +ann�e ;
	}

}
