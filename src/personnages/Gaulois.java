package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public int getForce() {
		return force;
	}
	public String getNom() {
		return nom;	
	}
	
	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}
	
	public void boirPotion(int forcePotion){
		 effetPotion = forcePotion + effetPotion;
		 System.out.println("Merci Duide, je sens que ma force est " + forcePotion 
				 + " fois décuplée.");
	}
	
	public static void main(String[] args) {
		//TODO créer un main permettant de tester la classe Gaulois
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain romaindetest = new Romain("César",8);
		Druide druide = new Druide("Panoramix",5,10,1);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("Test de la fonction parler");
		asterix.frapper(romaindetest);
		asterix.boirPotion(druide.preparerPotion());
		asterix.frapper(romaindetest);
	}

}



