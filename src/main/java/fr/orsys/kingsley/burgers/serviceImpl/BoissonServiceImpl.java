package fr.orsys.kingsley.burgers.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import fr.orsys.kingsley.burgers.business.Boisson;
import fr.orsys.kingsley.burgers.service.BoissonService;

public class BoissonServiceImpl implements BoissonService {
	private static List<Boisson> boissons = new ArrayList<>();
	private static final int BOISSON_LIST = 4;

	@Override
	public Boisson ajouterBoisson(String nom, Double prix) {
		Boisson boisson = new Boisson(nom, prix);

		if (boissons.size() < BOISSON_LIST) {
			boissons.add(boisson);
		}

		return boisson;
	}

	@Override
	public List<Boisson> recupererBoissons() {
		return boissons;
	}

	@Override
	public Boisson recupererBoisson(Long id) {
		for (Boisson boisson : boissons) {
			if (boisson.getId().equals(id)) {
				return boisson;
			}
		}
		return null;
	}

	@Override
	public boolean supprimerBoisson(Long id) {
		Boisson boissonASupprimer = recupererBoisson(id);
		if (boissonASupprimer == null) {
			return false;
		} else {
			return boissons.remove(boissonASupprimer);
		}
	}

}
