package fr.orsys.kingsley.burgers.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import fr.orsys.kingsley.burgers.business.Burger;
import fr.orsys.kingsley.burgers.service.BurgerService;

public class BurgerServiceImpl implements BurgerService {
	private static List<Burger> burgers = new ArrayList<>();
	private static final int BURGER_LIST = 4;

	@Override
	public Burger ajouterBurger(String nom, Double prix) {
		Burger burger = new Burger(nom, prix);
		
			if (burgers.size() < BURGER_LIST ) {
				burgers.add(burger);
			}
		
		return burger;
	}

	@Override
	public List<Burger> recupererBurgers() {
		return burgers;
	}

	@Override
	public Burger recupererBurger(Long id) {
		for (Burger burger : burgers) {
			if (burger.getId().equals(id)) {
				return burger;
			}
		}
		return null;
	}

	@Override
	public boolean supprimerBurger(Long id) {
		Burger burgerASupprimer = recupererBurger(id);
		if (burgerASupprimer==null) {
			return false;
		} else {
			return burgers.remove(burgerASupprimer);
		}
	}

}
