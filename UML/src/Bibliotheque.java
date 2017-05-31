
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque extends Etagere{
    
	List <Etagere> niveau;
        
        public Bibliotheque(){
	    niveau = new ArrayList<Etagere>();
	}
        
        public void ajouter_etagere(Etagere E){
        liste.add(E);
        }
        
        public void lister_etagere(){
    	for (int i=0 ; i<niveau.size(); i++) {
    		System.out.println(niveau.get(i).ToString());
    	}
    }
}
