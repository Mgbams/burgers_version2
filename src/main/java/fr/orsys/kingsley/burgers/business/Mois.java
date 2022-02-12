package fr.orsys.kingsley.burgers.business;

public enum Mois {
	JANVIER("Janvier"), 
	FÉVRIER("Février"), 
	MARS("Mars"), 
	AVRIL("Avril"), 
	MAI("Mai"),
	JUIN("Juin"), 
	JUILLET("Juillet"), 
	AOÛT("Août"), 
	SEPTEMBRE("Septembre"), 
	OCTOBRE("Octobre"), 
	NOVEMBRE("Novembre"), 
	DÉCEMBRE("Décembre");
	
	 private String moisMiniscule;

    private Mois(String moisMiniscule) {
        this.moisMiniscule = moisMiniscule;
    }
    
    public String getMois(){
        return moisMiniscule;
    }
}
