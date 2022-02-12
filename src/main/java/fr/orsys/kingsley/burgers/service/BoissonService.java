package fr.orsys.kingsley.burgers.service;

import java.util.List;

import fr.orsys.kingsley.burgers.business.Boisson;

public interface BoissonService {
	Boisson ajouterBoisson(final String nom, final Double prix);

	List<Boisson> recupererBoissons();

	Boisson recupererBoisson(Long id);

	boolean supprimerBoisson(Long id);
}
