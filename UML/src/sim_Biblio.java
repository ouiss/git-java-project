
public class sim_Biblio {

	public static void main(String[] args) 
	{
        
		Livre l1 = new Livre(1,"avanttoi","ouiiss",200);
		//System.out.println(l1.ToString());
		//l1.imprimer();
//        Imprimable i =new Livre();
//     	i.imprimer();
		Etagere E = new Etagere();
		Roman R = new Roman(2,"owew","ramadan",100 ,"prix");
		//R.imprimer();
		Livre l2 = new Livre(2,"les misérables","o",20);
		E.ajouter_doc(new Livre(3, "khkhkh", "t",2));
		E.ajouter_doc(R);
//		E.ajouter_doc(5, "Allo");
//		E.ajouter_doc(4, "Boum");
		E.ajouter_doc(l2);
		E.ajouter_doc(l1);
		E.lister_doc();
//		E.imprimer_doc();
//		E.rechercher_doc("livre");
//		E.tri();
		
	}
}
