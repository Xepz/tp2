package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin; 
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax, int forcePotion) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = forcePotion;
		parler("Bonjour, je suis le druide " + nom
				+ " et ma potion peut aller d'une force " + effetPotionMin + " � "
				+ effetPotionMax + ".");
		}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public int preparerPotion() {
		Random r = new Random();
		int m = r.nextInt(effetPotionMax);
		while ((m < 5) || (m > 10)){
			m = r.nextInt(effetPotionMax);
		}
		return m;
	}
	
	public void booster(Gaulois gaulois){
		if (gaulois.getNom() == "Ob�lix"){
			System.out.println("� Non, Ob�lix !... Tu n�auras pas de potion\r\n" + 
					"magique");
		}
		else {
			gaulois.boirPotion(preparerPotion());
		}
	}
	
	public static void main(String[] args){
		Druide druide = new Druide("Panoramix",5,10,1);
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Gaulois Obelix = new Gaulois("Ob�lix",8);
		int p = druide.preparerPotion();
		if(p > 7){
			druide.parler("J'ai pr�par� une super potion de force");
		}
		else {
			druide.parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force");
		}
		System.out.println(p);
		druide.booster(Obelix);
		druide.booster(asterix);
	}
}
