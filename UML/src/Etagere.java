import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


  public class Etagere extends Document implements Imprimable {
     
	Document doc=new Livre(1,"avanttoi","cymes",200);
	List <Document> liste;
	
	public Etagere()
	{
	liste= new ArrayList<Document>();
	}
	
    public void ajouter_doc(Document doc)
    {
        liste.add(doc); 
    }
    
    
    public void  supprimer(Document doc){
        liste.remove(doc);
    }
    
    public void imprimer()
    {
    	for (int i=0 ; i<liste.size(); i++)
    	{
            if (liste.get(i) instanceof Livre)
            {
          	       liste.get(i).ToString();
            }
       }
    }
    
   
    public void lister_doc(){
    	for (int i=0 ; i<liste.size(); i++) {
    		System.out.println(liste.get(i).ToString());
    	}
    }

    public void rechercher_doc(String titre)
    {
    	for (int i=0 ; i<liste.size(); i++) {
    		
    		if(liste.get(i).getTitre()==titre)
    		{
    		System.out.println("le document recherché existe :");	
    		
    		System.out.println(liste.get(i).ToString());
    		}	
    	}
    }
	Dictionnaire dic= new Dictionnaire(2,"larousse","français");
	Livre l1 = new Livre(1,"bonheur d'etre soi","MoussaNabati",200);
	
	Revue rev=new Revue(3,"psychologie",7,2017);

	
	public void tri(){

		Collections.sort(liste, new Comparator<Document>()
		{
	        public int compare( Document doc1, Document doc2)
	        {
	            return  doc1.getTitre().compareTo(doc2.getTitre());
	        }
	    });
		
		System.out.println("les documents triés : ");
		for (int i=0 ; i<liste.size(); i++) {
			 System.out.println(liste.get(i).getTitre());
		}		
//		    for (Document doc : liste)
//		{
//		      System.out.println(doc.getTitre());
//		}
	    }
	
	
	
//	public void Rechercher_Doc(String auteur){
//		ArrayList <Livre>  li=new ArrayList<Livre>();
//		Iterator <Livre> it = li.iterator();
//		while(it.hasNext())
//		{
//			if(it.next().getAuteur()==auteur)
//		{
//				
//		}
//		}
//		
//	}
	
}
