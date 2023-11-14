package personnages;

public class Village{
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois = 0;
	
	public Village(String nom, Gaulois villageois, Chef chef,int nbVillageois,int nbVillageoisMax) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois [nbVillageoisMax];
		this.nbVillageois = nbVillageois;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	void ajouterHabitant(Gaulois gaulois){
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	Gaulois trouverHabitant(int num){
		return villageois[num];
	}
	
	public static void main(String[] args) {
		Chef chef = new Chef("GrandChef",20,village);
		Village village = new Village("Village des Irréductibles", chef, );
		Gaulois gaulois = village.trouverHabitant(30);

	}
	
}
