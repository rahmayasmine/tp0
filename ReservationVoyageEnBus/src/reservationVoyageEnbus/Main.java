package reservationVoyageEnbus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{int x,t,indis,ar,id=0,test=0,i;
	String n,p,a,e,k,l,m,non="non";
	
	boolean b;
	 Client c2=new Client();
	 ArrayList <Client> c3=new ArrayList <Client> ();
	 ArrayList <String> lhd = new ArrayList<String>();
	 ArrayList <String> lha = new ArrayList<String>();
	 ArrayList<String> arret = new ArrayList<String>();
	 ArrayList<VoyageEnBus> V2 = new ArrayList<VoyageEnBus>();
	 ArrayList<VoyageEnBus> V;
	 ArrayList<ReservationBus> R1 = new ArrayList<ReservationBus>();
	 Voyagiste v1=new Voyagiste();
	 VoyageEnBus vb ;
	 
	VoyageEnBus v;
	do {
		System.out.println("         ~~choisissez votre cas~~\n");
		System.out.println("pour un voyagiste entre "+"1 .\n");
		System.out.println("pour un client entre "+"2 .\n");
		Scanner sc= new Scanner(System.in);
		do {
			x=sc.nextInt();
		}while(x!=1 && x!=2);
		if(x==2)
		{System.out.println("        ~~bien venue  a YasmineTraveling agence~~ \n\n");
		System.out.println("        ~~si vous ete un  client passe  pour YasmineTraveling agence entre 1 si non 0 ~~ \n\n");
		do {
		x=sc.nextInt();}while(x!=1 && x!=0);
		if(x==0)
		{ System.out.println("_______________________________________________________________________________________________________________\n");
		System.out.println("pour jouindre un notre famille entre les information suivent \n");
		 System.out.println(" . nom : ");
		n=sc.next();
		System.out.println("\n . prénom : ");
		p=sc.next();
		System.out.println("\n . Adresse : ");
		a=sc.next();
		System.out.println("\n . num tel : ");
		m=sc.next();
		System.out.println("\n . email : ");
		e=sc.next();
	    Client c1= new Client(n,p,a,m,e);
	    v1.getClients().add(c1);
	    }
		else
		{ System.out.println("_______________________________________________________________________________________________________________\n");
           
		System.out.println("*pour accédé a votre compte entrée les informations suivant:\n");
	do {
		System.out.println("votre id:\n--------");
		e=sc.next();
		System.out.println("votre Mot_de_passe:\n------------------");
		a=sc.next();
				c2=v1.connecter_client(e,a);
			
						if(c2==null)
						{   System.out.println(" ________________________________");
							System.out.println("|                                |");
							System.out.println("|erreur reentré votre information|");
							System.out.println("|________________________________|");
						}
						else
						{
							System.out.println("bien venue client :\n"+c2.getNom()+" "+c2.getPrénom());
						}
		}while(c2==null);
		}
	    do {
	    System.out.println("        ~~voullez vous reserver: 1/ annuler: 2/ confirmer3/ un voyage:// est pour afficher vos voyage 4 ~~ \n");
	    do {
			x=sc.nextInt();
		}while(x!=1 && x!=2 && x!=3 && x!=4);
	      switch(x)
	      {case 1:{  System.out.println("*pour resrver un voyage il faux que vous selectionner : \n\n");
	      System.out.println("1-la ville de départ :\n------------------------\n");
	      n=sc.next();
	      System.out.println("1-la ville d'arrivé :\n------------------------\n");
	      a=sc.next();
	      System.out.println("\n nom de passager : ");
	      e=sc.next();
	      V2.clear();
			 V2=v1.checher_voyage_dated(V2,n,a,v1);
				if(V2.size()!=0)
				{System.out.println("les voyages de "+V2.get(0).getVilled().getNom()+"a "+V2.get(0).getVillea().getNom()+"sont :");
					for(indis=0;indis<V2.size();indis++)
				{
					 System.out.println("\n-date d'épart :"+V2.get(indis).getDate_départ()  +"\n-date d'arrivée:"+V2.get(indis).getDate_arrivée()+"\n-nb de plasse:"+V2.get(indis).getplace_libres()+"\n-id:"+V2.get(indis).getId());
				if(V2.get(indis).getest_ouvert()==true)
				{System.out.println("-l'etat de voyage: ouveret\n"); 
			 	}
				else
					System.out.println("\n-l'etat de voyage: fermer\n");
				}
					System.out.println("entre id de voyage que vous vouley reservez\n");
					t=sc.nextInt();
					vb=v1.recherche_id(t);
					R1=c2.reserver_voyage_bus(vb,e);
					System.out.println("le voyage est bie RESERVER");
	
				}
				else
					 System.out.println("le voyage  de "+n+" a "+a+" n'existe pas :\n");
				
	    	  
	    	  
	      break;}
	      case 2:{System.out.println("*pour ANNULER un voyage :\n");
	      System.out.println("entre id de voyage que vous vouley ANNULER\n");
			t=sc.nextInt();
		//	vb=v1.recherche_id(t);
			c2.annuler(R1,t);
			System.out.println("la reservation est bien  ANNULER\n");
	      break;}
	      case 3:{System.out.println("*pour CONFIRMER un voyage :\n");
	      System.out.println("entre id de voyage que vous vouley CONFIRMER\n");
			t=sc.nextInt();
			System.out.println("la reservation est bien  CONFIRMER\n");
	      break;}
	      case 4:{System.out.println("voisi votre liste de reservation :\n\n");

	    	  for(indis=0;indis<R1.size();indis++)
	    	  { System.out.println("_______________________________________________________________________________________________________________\n");
              System.out.println(" -date de depart:"+R1.get(indis).getDated()+" \n-date d'arrivée"+R1.get(indis).getDatea()+" \n-ville de départ"+R1.get(indis).getVd()+" \n-ville d'arrivée"+R1.get(indis).getVa()+" \n-nom de passager "+R1.get(indis).getNompassager()+" \n-id de voyage"+R1.get(indis).getId());
	    	
	    	  }
	    	   System.out.println("_______________________________________________________________________________________________________________\n");

	      break;}
	      
	      
	      
	      }
	    
	    System.out.println("***************************************************");
	    System.out.println("vouler vous rester en ligne comme client (oui/non)?\n");
	    System.out.println("***************************************************");
	    non=sc.next();
	    
	    }while(non.compareTo("oui")==0);
	    
	    
	    
		}//fin client
		else// voyagiste
		{ System.out.println("_______________________________________________________________________________________________________________\n");
			System.out.println("                    ~~bien venue  chére voyagiste a YasmineTraveling agence~~ \n");
		System.out.println("*pour accédé a votre compte entrée les informations suivant:\n");
		do {
		System.out.println("votre id:\n--------");
		e=sc.next();
		System.out.println("votre Mot_de_passe:\n------------------");
		a=sc.next();
		
		b=v1.connecter(e, a);
		
		if(b==false)
		{System.out.println(" ________________________________");
		 System.out.println("|                                |");
		 System.out.println("|erreur reentré votre information|");
		 System.out.println("|________________________________|");
		}
		else
		{
			System.out.println("Bien venue :\n__________\n-Nom:"+v1.getNom()+"\n-Adresse:"+v1.getAdresse()+"\n-tel:"+v1.getTeléphone());	
		 System.out.println("_______________________________________________________________________________________________________________\n");
		do {
			System.out.println("-voulley vous:\n1.ajouter \n2.fermer \n3.ouvrire \n4.rechercher \n5.suprimer \n6.afficher les voyages \n7.afficher les Client\n8.afficher la liste globale des reservation");
		 do {
				x=sc.nextInt();
			}while(x!=1 && x!=2 && x!=3 && x!=4&& x!=5&&x!=6 && x!=7&& x!=8);
		 if(x==1)// ajouter un voyage 
		 {System.out.println("*pour ajouter un vouyage:\n-----------------------");
			 System.out.println("1/entre la date de départ sous la forme JJ/MM/AA :\n");
		 e=sc.next();
		 System.out.println("2/entre la date de d'arivée sous la forme JJ/MM/AA:\n");
		 a=sc.next();
		 System.out.println("3/entre le nb de places :\n");
		 t=sc.nextInt();
		 System.out.println("4/entre la ville de départ  :\n");
		 p=sc.next();
		 System.out.println("5/entre la ville d' arivée  :\n");
		 n=sc.next();
		 System.out.println("6/entre combien de villes d'arret  :\n");
		 ar=sc.nextInt();
		 for(indis=0;indis<ar;indis++)
		 {		 System.out.println("7/entre la ville d'arret  :"+indis+1+"\n");
			 arret.add(sc.next());
			 
		 }
		
		 
		 for(indis=0;indis<ar;indis++)
		 {		 System.out.println("8/entre l'heure de d'arrivé d'arret :"+indis+1+"\n");
			 lhd.add(sc.next());
		 }
		 for(indis=0;indis<ar;indis++)
		 {		 System.out.println("9/entre l'heure de  d'épart d'arret:"+indis+1+"\n");
			 lha.add(sc.next());
		 }
		 
		
		 id++;
			v= v1.Ajouter_voyage(e,a,t,id,p,n,arret,lhd,lha);
			 v1.getVoyages().add(v);
			
		 }
		 else {
			 if(x==4)//rechercher voyage
			 {System.out.println("*pour chercher un vouyage:\n------------------------\n");
				 System.out.println("entre la ville de d'part :\n");
			 e=sc.next();
			 System.out.println("entre la ville d'arrivée :\n");
			 a=sc.next();
			 V2.clear();
			 V2=v1.checher_voyage_dated(V2,e,a,v1);
				if(V2.size()!=0)
				{System.out.println("______________________________________________________________________________________________________________________________________________________________________________________");
					System.out.println("les voyages de "+V2.get(0).getVilled().getNom()+"a "+V2.get(0).getVillea().getNom()+"sont :");
					for(indis=0;indis<V2.size();indis++)
				{
					 System.out.println("\n  -date d'épart :"+V2.get(indis).getDate_départ()  +"\n  -date d'arrivée:"+V2.get(indis).getDate_arrivée()+"\n  -nb de plasse:"+V2.get(indis).getplace_libres()+"\n  -id:"+V2.get(indis).getId());
					 for(i=0;i<V2.get(indis).getArret().size();i++)
					 {
						 System.out.println("  -arret "+i+"\n  .ville: "+V2.get(indis).getInf().get(i).getV().getNom()+"\n  de "+V2.get(indis).getInf().get(i).getHeurArivée()+"h a "+V2.get(indis).getInf().get(i).getHeurDépar()+"h");
						 
					 }
				if(V2.get(indis).getest_ouvert()==true)
				{System.out.println("\n-l'etat de voyage: ouveret\n"); 
			 	}
				else
					System.out.println("\n-l'etat de voyage: fermer\n");
				}
				}
				else
					 System.out.println("le voyage  de "+ V2.get(0).getVilled().getNom()+"a "+V2.get(0).getVillea().getNom()+"n'existe pas :\n");
				 System.out.println("______________________________________________________________________________________________________________________________________________________________________________________");

			 }
			 else
			 {if(x==2)//fermer voyage 
			    {System.out.println("*pour Fermer un vouyage:\n------------------------\n");
			    System.out.println("-entre ID de ce voyage \n");
			    t=sc.nextInt();
				 v1.fermer_voyage_bus(t);	
				 System.out.println("fermeture bien efectuer \n");
			    }
			 else
			  { if(x==3)//ouvrire voyage
				 {System.out.println("*pour OUVRIR un vouyage:\n------------------------\n");
				    System.out.println("-entre ID de ce voyage \n");
				    t=sc.nextInt();
					 v1.fermer_voyage_bus(t);
					 System.out.println("ouverture bien efectuer \n");
			     }
			  else
			    {if(x==5)
			    {System.out.println("*pour SUPRIMER un vouyage:\n------------------------\n");
			    System.out.println("-entre ID de ce voyage \n");
			    t=sc.nextInt();
				 v1.suprimer_voyage(t);
				 System.out.println("supression bien éfectuer \n");
			    	
			    }
			    else
			    {if(x==6)
			    {System.out.println("______________________________________________________________________________________________________________________________________________________________________________________");
			    	System.out.println("*VOS VOYAGES:\n-------------\n");
			    V= v1.getVoyages();
			    
			    if(V.size()!=0)
			    {
			    for(indis=0;indis<V.size();indis++)
			    {System.out.println("\n-Ville d'épart :"+V.get(indis).getVilled().getNom()+"\n-Ville arrivet :"+V.get(indis).getVillea().getNom()+"\n-date d'épart :"+V.get(indis).getDate_départ()  +"\n-date d'arrivée:"+V.get(indis).getDate_arrivée()+"\n-nb de plasse:"+V.get(indis).getplace_libres()+"\n-id:"+V.get(indis).getId());
			    if(V.get(indis).getest_ouvert()==true)
				{System.out.println("\n-l'etat de voyage: ouveret\n"); 
			 	}
				else
					System.out.println("\n-l'etat de voyage: fermer\n");
				}	
			    }
			    else
			    {
			    	System.out.println("\n-pas de voyages pour le moment \n");
			    }
			    System.out.println("______________________________________________________________________________________________________________________________________________________________________________________");
	
			      }
			    else
			    {if(x==7)
			      {	System.out.println("______________________________________________________________________________________________________________________________________________________________________________________");

			    	System.out.println("*VOS Client:\n-------------\n");
			      c3=v1.getClients();
			      if(c3.size()!=0)
			      {
			      for(indis=0;indis<c3.size();indis++)
			      {
			    	  System.out.println("Clinet :"+indis+"\n nom :"+c3.get(indis).getNom()+" prenom :"+c3.get(indis).getPrénom()+" adresse :"+c3.get(indis).getAdresse()+" telephone :"+c3.get(indis).getTelephone()+" email :"+c3.get(indis).getEmail());
			    	  
			      }
			      }
			      else
			      {   System.out.println("***************************");
			    	  System.out.println("PAS DE CLINET DANS L'AGENCE.");
			    	  System.out.println("***************************\n");
			    	  }
			      }
			    else
			    {if(x==8)
			      {	System.out.println("______________________________________________________________________________________________________________________________________________________________________________________");
			      System.out.println("*LISTE RESERVATION GLOBAL:\n---------------------\n");
			      for(indis=0;indis<v1.getVoyages().size();indis++)
			      {System.out.println("le voyage id:"+v1.getVoyages().get(indis).getId()+"reserver par les clients suivant:");
			      for(i=0;i<v1.getClients().size();i++)
			      {
			    	  if(v1.getVoyages().size()!=0)
			    	  {
			    		  if(Integer.compare(v1.getVoyages().get(indis).getId(),Integer.parseInt(v1.getClients().get(i).getId()))==0)
			    	  {
			    		  System.out.println("  nom :"+v1.getClients().get(i).getNom()+"\n  prénom:"+v1.getClients().get(i).getPrénom()+"\n  N°tlf:"+v1.getClients().get(i).getTelephone());
			    	  }
			    	  }
			      }
			    	
			      }
			      
			    	
			    	
			    }
			    	
			    }
			    	
			    }
			    	
			    }
				  
			    }
			  }
				
			 }
		    }//fin big else
	
		  System.out.println("***************************************************");
		    System.out.println("vouler vous rester en ligne comme voyagiste (oui/non)?\n");
		    System.out.println("***************************************************");
		    non=sc.next();
		}while(non.compareTo("oui")==0);//
		}
		}while(b==false);
		
		}
		
	}while(non.compareTo("non")==0);
		
		
			
	}
		
}

	
