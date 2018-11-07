package fr.esipe.benoit.cycleLogiciel_CC;

public class Consomateur {
	private Central centrale;
	public int afficheCentral() {
		if (centrale!=null) {
			return centrale.getNiveau();
		}
		else throw new NullPointerException();
	}		
}
