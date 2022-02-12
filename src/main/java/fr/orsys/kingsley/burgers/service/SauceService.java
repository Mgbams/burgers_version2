package fr.orsys.kingsley.burgers.service;

import java.util.List;

import fr.orsys.kingsley.burgers.business.Sauce;

public interface SauceService {
	Sauce ajouterSauce(final String nom, final Double prix);

	List<Sauce> recupererSauces();

	Sauce recupererSauce(Long id);

	boolean supprimerSauce(Long id);
}
