package Cinema;

public class Application {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Horreur peur = new Horreur();
		peur.setNom("L'invasion des pirates de l'espace");
		peur.setAnnee(1950);
		peur.setCouleur(false);
		peur.setDuree(120);
		peur.setRestrictionAge(18);
		
		if (peur.couleur == true) {
		
		System.out.println("Le film " + peur.getNom() + " sorti en " + peur.annee + " en couleur a une durée de " +
		peur.duree +" min" + " et est interdit aux moins de " + peur.getRestrictionAge() + " ans");
		}
		else {
		
		System.out.println("Le film " + peur.getNom() + " sorti en " + peur.annee + " en noir et blanc a une durée de " +
		peur.duree +" min" + " et est interdit aux moins de " + peur.getRestrictionAge() + " ans");
			
		}
		
		Comedie rire = new Comedie();
		rire.setNom("Kung Fu à la maternelle");
		rire.setAnnee(1998);
		rire.setDuree(55);
		rire.setNote(2);
		rire.setProduction("Délires Prod");
		rire.setCouleur(true);
		rire.setComedieMusicale(false);
		
		if(rire.couleur == true) {
		
		System.out.println("Le film " + rire.getNom() + " sorti en " + rire.getAnnee() + " a une durée de " +
		rire.getDuree() + "min, en couleurs \nproduit par " + rire.getProduction() + " a reçu la note de " + rire.getNote()+
		" sur 10 par Allan");
		}
		else {
		System.out.println("Le film " + rire.getNom() + "sorti en " + rire.getAnnee() + " a une durée de " +
		rire.getDuree() + "min, en noir et blanc produit par " + rire.getProduction() + " a reçu la note de " + rire.getNote()+
		" sur 10 par Allan");
					}
	
		SF futur = new SF();
		futur.setNom("Du coca sur Mars");
		futur.setCouleur(false);
		futur.setGenre(" Space Opera ");
		futur.setAnnee(1970);
		futur.setDuree(159);
		futur.setProduction("Productions SF");
		futur.setNote(11);
		futur.setCouleur(true);
		
		if (futur.couleur == true) {
		
		System.out.println("Le film " + futur.getNom() + " sorti en " + futur.getAnnee() + " a une durée de " +
		futur.getDuree() + "min, en couleurs \nproduit par " + futur.getProduction() + " a reçu la note de " + futur.getNote()+
		" sur 10 par Allan");
			}
		else {
		System.out.println("Le film " + futur.getNom() + " sorti en " + futur.getAnnee() + " a une durée de " +
		futur.getDuree() + "min, en noir et blanc \nproduit par " + futur.getProduction() + " a reçu la note de " + futur.getNote()+
		" sur 10 par Allan");
			}
		}
	
	}


