
public abstract class Document{

   private int num;
   private String titre;
   public Document(){
	   
   }
   public Document(int num , String titre )
   
   {
	   this.num=num;
	   this.titre=titre;	
   }
   
   
   public int getNum() {
	return num;
}

   public void setNum(int num) {
	this.num = num;
}
public String getTitre(){
	   return titre;
   }
   
   public String ToString(){
	   return " numéro : " +num+ "\n titre : " +titre  ;
   }
   


}

