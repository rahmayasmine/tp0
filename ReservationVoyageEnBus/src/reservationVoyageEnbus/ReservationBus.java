package reservationVoyageEnbus;

public class ReservationBus {
	   
	    private String dated;
	    private String datea;
	    private String nompassager;
	    private String nompassager2;
	   private int id;
	   VoyageEnBus v;
	   private String Vd;
	   private String Va;
	    public ReservationBus(VoyageEnBus v,String dated,String datea,String nom,int id)
	    {this.datea=datea;
	    this.dated=dated;
	     Passagé p= new Passagé(nom);
	    this.nompassager=p.getNom();
	    this.id=id;
	    this.Va=v.getVillea().getNom();
	    this.Vd=v.getVilled().getNom();
	    }

	

		public int getId() {
			return id;
		}



		public String getVd() {
			return Vd;
		}



		public void setVd(String vd) {
			Vd = vd;
		}



		public String getVa() {
			return Va;
		}



		public void setVa(String va) {
			Va = va;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getDated() {
			return dated;
		}

		public void setDated(String dated) {
			this.dated = dated;
		}

		public String getDatea() {
			return datea;
		}

		public void setDatea(String datea) {
			this.datea = datea;
		}

		public String getNompassager() {
			return nompassager;
		}

		public void setNompassager(String nompassager) {
			this.nompassager = nompassager;
		}
	 

	    
	   

	
}
