package fr.orsys.kingsley.burgers.service;

import java.util.List;

import fr.orsys.kingsley.burgers.business.Burger;

public interface BurgerService {
	
	Burger ajouterBurger(final String nom, final Double prix);

	List<Burger> recupererBurgers();

	Burger recupererBurger(Long id);

	boolean supprimerBurger(Long id);
}
